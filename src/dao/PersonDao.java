package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import classe.*;

public class PersonDao extends DAO<Person>{
	
	public PersonDao(Connection conn) {
		super(conn);
	}
	public boolean register(Person obj) {
		try{
			String insertion = "INSERT INTO person(nom_utilisateur,nom,prenom,password,role) values ('"+obj.getnu()+"','" + obj.getn()+ "','"+obj.getpr()+"',"
					+ "'"+obj.getpa()+"','"+obj.getr()+"')";
			this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeUpdate(insertion);	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	public boolean delete(Person obj) {
		try{
			String supp = "DELETE * FROM person WHERE nom ='" + obj.getn()+ "' and prenom = '"+obj.getpr()+"'";
			this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeUpdate(supp);	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	public boolean update(Person obj,String s) {		
		try{
			String modif = "UPDATE person SET nom ='"+s+"' "//',"
					/*+ "prenom = '"+obj.getpr()+"', password = '"+obj.getpa()+"'*/ +"WHERE nom='"+obj.getn()+"'";
			this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeUpdate(modif);	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	public Person find(int id){
		Person eleve = new Person();
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
	ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM person WHERE id = '"+ id+"'");
			if(result.first())
eleve = new Person(id, result.getString("nom_utilisateur"), result.getString("nom"), null, null, null);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return eleve;
	}
	public String logindao(String n,String p) {
		String r = null;
		try{
			ResultSet result = this.connect.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE,
	ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Person WHERE nom_utilisateur = '" +n+"' and password ='"+p+"'");
			if(result.first()) {
				r=result.getString("role");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return r;
	}

}
