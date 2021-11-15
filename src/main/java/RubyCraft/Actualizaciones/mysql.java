package RubyCraft.Actualizaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;
import java.util.UUID;

import Eventos.Verificar_Fecha;
import RubyCraft.RubyCraft;
import RubyCraft.Bases.Descodificar;
import RubyCraft.Bloques.Bloque_de_Actualizaciones;

public class mysql {

	private Connection connection;
	public String host, database, password, username, table;
	public int port;
	public static String[] mensajes = {"","","","",""};
	 public  static void iniciar(int id,boolean conexiones) throws Exception{ 
		
		new mysql().mysqlSetup(id,conexiones);
		
	 }
	 
	
	
	/** public static void cambiar_table(String nombre, ) {
		 new mysql().mysqlSetup(nombre);
		 new mysql().actualizar_string(tabla, valor, uuid);
	 }
	 **/
	public void mysqlSetup(int id, boolean conexiones_v) {
		
		host = Verificar_Fecha.ip;
		port = Verificar_Fecha.puerto;
		database = "Mods";
		username = "mod";
		password = Descodificar.password("072065075111052079066081088108057097119073120068", "110","101");
		table = "Versiones";

		try {
			
			synchronized (this) {
				if (getConnection() != null && !getConnection().isClosed()) {
					return;
				} 

			//	Class.forName("com.mysql.jdbc.Driver");
				Class.forName("com.mysql.cj.jdbc.Driver");
				
		
				setConnection(
						DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port  + "/" + this.database +"?serverTimezone="+TimeZone.getDefault().getID(),
								this.username, this.password));
			
				 mensajes[0]=getStringFromTable("Texto_1", id);
				 
				 if(!getStringFromTable("Texto_2", id).equalsIgnoreCase("none")) {
				 mensajes[1]=getStringFromTable("Texto_2", id);
				 }else {
					 TestearActualizaciones.Mensaje2a = false;
				 }
				 if(!getStringFromTable("Texto_3", id).equalsIgnoreCase("none")) {
				 mensajes[2]=getStringFromTable("Texto_3", id);
				 }else {
					 TestearActualizaciones.Mensaje3a = false;
				 }
				 mensajes[3]=getStringFromTable("Version_Mod", id);
				 mensajes[4]=getStringFromTable("Changelog", id);
		       
				 if(!(RubyCraft.version.equalsIgnoreCase(mensajes[3]))) {
					Buscar_Actualizaciones.FijarNuevaVersion();
				    RubyCraft.logger.info( mensajes[3] + " Esta es la Ultima Version de RubyCraft Disponible");
					RubyCraft.logger.info( mensajes[0]);
					RubyCraft.logger.info( mensajes[1]);
					RubyCraft.logger.info( mensajes[2]);
					
					Bloque_de_Actualizaciones.Mensaje1 =mensajes[0];
					Bloque_de_Actualizaciones.Mensaje2 =mensajes[1];
					Bloque_de_Actualizaciones.Mensaje3 =mensajes[2];
					Bloque_de_Actualizaciones.UltimaVersion=mensajes[3];
					Bloque_de_Actualizaciones.changeLog =mensajes[4];
					
				
				 }
				 /**COJE EL VALOR DE LA BASE DE DATOS DE CUANTA GENTE SE CONECTO AL MOD LE SUMA 1 Y ACTUALIZA EL VALOR DENTRO DE LA BASE DE DATOS**/
				 if(conexiones_v && RubyCraft.cliente) {
				     String conexiones = getStringFromTable("Conexiones_Cliente", id);
			          int resultado = Integer.parseInt(conexiones) +1;
			        actualizar_string("Conexiones_Cliente", Integer.toString(resultado), id);
				 }else if(conexiones_v && !RubyCraft.cliente) {
					     String conexiones = getStringFromTable("Conexiones_Servidores", id);
				          int resultado = Integer.parseInt(conexiones) +1;
				        actualizar_string("Conexiones_Servidores", Integer.toString(resultado), id);
					 }
				 
			       this.connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		
	}

	
	
	public boolean playerExists(UUID uuid) {
		 
		try {
			PreparedStatement statement = getConnection()
					.prepareStatement("SELECT * FROM " + "Jugadores" + " WHERE UUID=?");
			statement.setString(1, uuid.toString());

			ResultSet results = statement.executeQuery();
			if (results.next()) {
				System.out.println("NOMBRE ENCONTRADO");
				return true;
			}
			 System.out.println("Player NOT Found");

		} catch (SQLException e) {
			e.printStackTrace();
		
	  }
		return false;
	}

public  void createPlayer(final UUID uuid, String nombre) {
	
	try {
		PreparedStatement statement = this.getConnection()
				.prepareStatement("SELECT * FROM " + "Jugadores" + " WHERE UUID=?");
		statement.setString(1, uuid.toString());
		ResultSet results = statement.executeQuery();
		results.next();
		System.out.print(1);
		if (!playerExists(uuid)) {
			PreparedStatement insert = this.getConnection()
					.prepareStatement("INSERT INTO " + "Jugadores" + " (NOMBRE,UUID) VALUES (?,?)");
			insert.setString(2, uuid.toString());
			insert.setString(1, nombre);
			insert.executeUpdate();

			System.out.println("Player Inserted");
		
	}

	}catch (Exception e) {
		
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