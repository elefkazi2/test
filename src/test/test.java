package test;

import classe.*;
import dao.AbstractDAOFactory;
import dao.DAO;
import dao.PersonDao;

public class test {

	public static void main(String[] args) {
		AbstractDAOFactory adf = AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY);//je choisi soit base de donnees soit xml
		DAO<Person> persondao = adf.getp();
		/*for(int i = 1; i < 4; i++){
			Person p = persondao.find(i);
	System.out.println("\tpersonne N°" + p.getid() + " - NOM : " + p.getn()+ " - PRENOM : " + p.getpr()+" password : "+p.getpa());
		}
		System.out.println("\n\t****************************");
		Person p2=new Person("umaz","maz","dor","484484848","client");
		//persondao.create(p2);
		//persondao.create(new Person ("maz","dor","484484848"));*/
		//persondao.delete(p2);
		//persondao.update(p2,"toto");
		/*System.out.println("\n\t****************************");
		for(int i = 1; i < 9; i++){*/
		//Person p2=new Person("tres","maz","dor","5","gestionnaire");
		//persondao.create(p2);
			/*Person p =new Person();
			try {
			p.login("tres", "5");
			p.login("umaz", "484484848");
			p.login("umaz", "48448484");
			}
			catch(Exception e){
				System.out.println("nom ou mdp errone");
			}*/
			//p.register("gag", "fred", "fredo", "i", "artiste");
	        client c1=new client();
	        c1.register("yolo", "gro", "pousti", "r");
			/*if(p.getn()!=null)
	System.out.println("\tpersonne N°" + p.getid() +"nom_ut "+p.getnu()+ " - NOM : " + p.getn()+ " - PRENOM : " + p.getpr()+" password : "+p.getpa()+" role "+p.getr());*/
		}
		
	}

