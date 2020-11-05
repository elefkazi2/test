package dao;

import java.sql.Connection;

import classe.Person;
import connexion.connection;

public class DAOFactory extends AbstractDAOFactory{
protected static final Connection conn = connexion.connection.getInstance();
	
	public DAO<Person> getp(){
		return new PersonDao(conn);
	}

}
