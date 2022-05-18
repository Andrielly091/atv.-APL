package br.edu.ifpe.andrielly.gestaocliente1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.andrielly.gestaocliente1.model.Cliente;



public class ClienteDao {
	
	public void adicionar(Cliente cliente) throws ClassNotFoundException, SQLException{
		Connection connection = ConexaoMySQL.getConexaoMySQL();
		String sql = "INSERT INTO `cliente`"
				+"(`codigo`, `nome`, `endereco`, `cidade`, `uf`)"
				+ "VALUES (?, ?, ?, ?, ?)";
		PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		
		stmt.setInt(1, cliente.getCodigo());
		stmt.setString(2, cliente.getNome());
		stmt.setString(3, cliente.getEndereco());
		stmt.setString(4, cliente.getCidade());
		stmt.setString(5, cliente.getUf());
		
		stmt.execute();
		stmt.close();
		connection.close();
		
	}
	
	public List<Cliente> consultarTodosClientes() throws ClassNotFoundException, SQLException{
		Connection connection = ConexaoMySQL.getConexaoMySQL();
		String sql = "SELECT `codigo`, `nome`, `endereco`, `cidade`, `uf` FROM `cliente`";
		PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		
		ResultSet resultSet = stmt.executeQuery();
		
		List<Cliente> listaTodosClientes = new ArrayList<Cliente>();
		
		while(resultSet.next()) {
			
			Cliente cliente = new Cliente(0, sql, sql, sql, sql);
			
			int codigo = resultSet.getInt("codigo");
			cliente.setCodigo(codigo);
			String nome = resultSet.getString(2);
			cliente.setNome(nome);
			cliente.setEndereco(resultSet.getString(3));
			cliente.setUf(resultSet.getString(4));
			cliente.setUf(resultSet.getString(5));
			
			listaTodosClientes.add(cliente);
		}
		return listaTodosClientes;
		
	}
	public Cliente consultarCliente(int codigo) throws ClassNotFoundException, SQLException {
		 Connection connection = ConexaoMySQL.getConexaoMySQL();
		 String sql = "SELECT * FROM `cliente` WHERE codigo = ? ";
		 
		 PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		 stmt.setInt(1, codigo);
		 
		 ResultSet resultSet = stmt.executeQuery();
		 
		 Cliente cliente = new Cliente(codigo, sql, sql, sql, sql); 
		 if(resultSet.next()) {
			 
			 cliente.setCodigo(resultSet.getInt(1));
			 cliente.setNome(resultSet.getString(2));
			 cliente.setEndereco(resultSet.getString(3));
			 cliente.setCidade(resultSet.getString(4));
			 cliente.setUf(resultSet.getString(5));
		 }		 
		 return cliente;		 
	 }
	 
	 public void alterarClienteDAO(Cliente cliente) throws ClassNotFoundException, SQLException {
		 Connection connection = ConexaoMySQL.getConexaoMySQL();
		 String sql = "UPDATE `cliente` SET `nome`= ?,`endereco`= ?,"
		 		+ "`cidade`= ?,`uf`= ? WHERE codigo = ?";

		 PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
	        
	        stmt.setString(1, cliente.getNome());
	        stmt.setString(2, cliente.getEndereco());
	        stmt.setString(3, cliente.getCidade());
	        stmt.setString(4, cliente.getUf());
	        stmt.setInt(5, cliente.getCodigo());
	        
	        stmt.executeUpdate();
	        stmt.close();
	        connection.close();
	 
	 }

	 public void deletarClienteDAO(int codigo) throws ClassNotFoundException, SQLException {
		 Connection connection = ConexaoMySQL.getConexaoMySQL();
		 String sql = "DELETE FROM `cliente` WHERE codigo = ?";

		 PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

		 stmt.setInt(1, codigo);

		 stmt.execute();
		 stmt.close();
		 connection.close();

	 }

}
