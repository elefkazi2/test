package dao;

import java.sql.*;

import classe.Person;


public abstract class DAO<T> {
protected Connection connect = null;
	
	public DAO(Connection conn){
		this.connect = conn;
	}
	
	public abstract boolean register(T obj);
	
	public abstract boolean delete(T obj);
	
	public abstract boolean update(T obj,String s);
	
	public abstract String logindao(String n,String p);
	public abstract Person find(int id);

}
