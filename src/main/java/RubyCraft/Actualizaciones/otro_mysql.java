package RubyCraft.Actualizaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;
import java.util.UUID;

public class otro_mysql {

	private Connection connection;
	public String host, database, username, password, table;
	public int port;
	public static boolean mysql;
	public static String[] mensajes = {"","","","",""};
	 public  static void iniciar(String nombre, UUID uuid) throws Exception{ 
		if(mysql == true) {
		new otro_mysql().mysqlSetup(nombre, uuid);
		}
		
	 }
	 
	
	
	/** public static void cambiar_table(String nombre, ) {
		 new mysql().mysqlSetup(nombre);
		 new mysql().actualizar_string(tabla, valor, uuid);
	 }
	 **/
	public void mysqlSetup(String nombre, UUID uuid) {
		
		host = "rubycraftmod.ddns.net";
		port = 3306;
		database = "Version_mods";
		username = "Programas";
		password = "no la sabras nunca xD obvio";
		table = "Jugadores";

		try {

			synchronized (this) {
				if (getConnection() != null && !getConnection().isClosed()) {
					return;
				} 

				Class.forName("com.mysql.jdbc.Driver");
				

				setConnection(
						DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port  + "/" + this.database +"?serverTimezone="+TimeZone.getDefault().getID(),
								this.username, this.password));
				
				 
				 if(playerExists(uuid)) {
				     String conexiones_totales = getStringFromTable("CONEXIONES", uuid);
				     int conexiones_int = Integer.parseInt(conexiones_totales) + 1;
				     actualizar_string("conexiones", Integer.toString(conexiones_int), uuid);
				     }
				createPlayer(uuid, nombre);
			    
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
					.prepareStatement("SELECT * FROM " + table + " WHERE UUID=?");
			statement.setString(1, uuid.toString());

			ResultSet results = statement.executeQuery();
			if (results.next()) {
				
				return true;
			}
		

		} catch (SQLException e) {
			e.printStackTrace();
		
	  }
		return false;
	}

public  void createPlayer(final UUID uuid, String nombre) {
	
	try {
		PreparedStatement statement = this.getConnection()
				.prepareStatement("SELECT * FROM " + table + " WHERE UUID=?");
		statement.setString(1, uuid.toString());
		ResultSet results = statement.executeQuery();
		results.next();
	
		//System.out.print(1);
		if (!playerExists(uuid)) {
			PreparedStatement insert = this.getConnection()
					.prepareStatement("INSERT INTO " + table + " (NOMBRE,CONEXIONES,UUID) VALUES (?,?,?)");
			
			insert.setString(1, nombre);
			insert.setString(2, "1");
			insert.setString(3, uuid.toString());
			insert.executeUpdate();

		//	System.out.println("Player Inserted");
		
	}

	}catch (Exception e) {
		
	}

}

	
	
	public void actualizar_string(String tabla, String valor, UUID id)  {
		
		try {
		PreparedStatement statement = this.getConnection().prepareStatement("UPDATE " + table + " SET " + tabla + "=? WHERE UUID=?");
		statement.setString(1, valor);
		statement.setString(2, id.toString());
		statement.executeUpdate();
		}catch (Exception e) {
		   }
		}



public String getStringFromTable(String tabla, UUID id) {
	

	
		try {
	PreparedStatement statement = getConnection()
			.prepareStatement("SELECT * FROM " + table + " WHERE UUID=?");
		statement.setString(1, id.toString());
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