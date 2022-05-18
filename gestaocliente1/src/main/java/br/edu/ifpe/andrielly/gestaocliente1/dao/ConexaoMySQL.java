package br.edu.ifpe.andrielly.gestaocliente1.dao;

import java.sql.Connection;
import java.sql.DriverManager
;
import java.sql.SQLException;

public class ConexaoMySQL {
	
	public static Connection getConexaoMySQL() throws SQLException, ClassNotFoundException{
		Connection connection = null;
		Class.forName("com.mysql.jbdc.Driver");
		connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cliente_bd_ifpe", "root", "");
		return connection;
		
	}

}
