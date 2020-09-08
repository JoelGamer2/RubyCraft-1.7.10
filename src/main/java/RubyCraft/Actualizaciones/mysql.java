package RubyCraft.Actualizaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;

import RubyCraft.RubyCraft;

public class mysql {

	private Connection connection;
	public String host, database, username, password, table;
	public int port;
	public static String[] mensajes = {"","","","",""};
	 public  static void iniciar(int id) throws Exception{ 
		
		new mysql().mysqlSetup(id);
		
	 }
	 
	
	
	/** public static void cambiar_table(String nombre, ) {
		 new mysql().mysqlSetup(nombre);
		 new mysql().actualizar_string(tabla, valor, uuid);
	 }
	 **/
	public void mysqlSetup(int id) {
		
		host = "rubycraftmod.ddns.net";
		port = 3306;
		database = "Version_mods";
		username = "Programas";
		password = "private_compiled";
		table = "Versiones";

		try {

			synchronized (this) {
				if (getConnection() != null && !getConnection().isClosed()) {
					return;
				} 

				Class.forName("com.mysql.jdbc.Driver");
				

				setConnection(
						DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port  + "/" + this.database +"?serverTimezone="+TimeZone.getDefault().getID(),
								this.username, this.password));
				
				 
				 
				 mensajes[0]=getStringFromTable("Texto_1", id);
				 mensajes[1]=getStringFromTable("Texto_2", id);
				 mensajes[2]=getStringFromTable("Texto_3", id);
				 mensajes[3]=getStringFromTable("Version_Mod", id);
				 mensajes[4]=getStringFromTable("Changelog", id);
		       
				 if(!(RubyCraft.version.equalsIgnoreCase(mensajes[3]))) {
					Buscar_Actualizaciones.FijarNuevaVersion();
				    RubyCraft.logger.info( mensajes[3] + " Esta es la Ultima Version de RubyCraft Disponible");
					RubyCraft.logger.info( mensajes[0]);
					RubyCraft.logger.info( mensajes[1]);
					RubyCraft.logger.info( mensajes[2]);
					
				 }
				 /**COJE EL VALOR DE LA BASE DE DATOS DE CUANTA GENTE SE CONECTO AL MOD LE SUMA 1 Y ACTUALIZA EL VALOR DENTRO DE LA BASE DE DATOS**/
				     String conexiones = getStringFromTable("Conexiones", id);
			          int resultado = Integer.parseInt(conexiones) +1;
			        actualizar_string("Conexiones", Integer.toString(resultado), id);
			     
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		
	}

	
	
	
	public void actualizar_string(String tabla, String valor, int id)  {
		
		try {
		PreparedStatement statement = this.getConnection().prepareStatement("UPDATE " + table + " SET " + tabla + "=? WHERE ID=?");
		statement.setString(1, valor);
		statement.setString(2, Integer.toString(id));
		statement.executeUpdate();
		}catch (Exception e) {
		   }
		}



public String getStringFromTable(String tabla, int id) {
	

	
		try {
	PreparedStatement statement = getConnection()
			.prepareStatement("SELECT * FROM " + table + " WHERE ID=?");
		statement.setString(1, Integer.toString(id));
		ResultSet results = statement.executeQuery();
		results.next();
	
	         return results.getString(tabla);
		}catch (Exception e) {
			return e.toString();
		}
	}
	
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
