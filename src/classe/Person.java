package classe;
import dao.*;
import Frame.*;
public class Person {
	private int id;
	private String nom_utilisateur;
	private String nom;
	private String prenom;
	private String password;
	private String role;
	AbstractDAOFactory adf = AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY);
	DAO<Person> persondao = adf.getp();
	
	public Person(int id,String nu,String n,String pr,String pa,String r) {
		this.id=id;
		nom_utilisateur=nu;
		nom=n;
		prenom=pr;
		password=pa;
		role=r;
	}
	public Person(String nu,String n,String pr,String pa,String r) {
		nom=n;
		prenom=pr;
		password=pa;
		nom_utilisateur=nu;
		role=r;
		
	}
	public Person() {}
	
	public int getid() {
		return id;
	}
	public String getnu() {
		return nom_utilisateur;
	}
	public String getn() {
		return nom;
	}
	public String getpr() {
		return prenom;
	}
	public String getpa() {
		return password;
	}
	public String getr() {
		return role;
	}
	public void setn(String s) {
		nom=s;
	}
	public void login(String n,String p) {
		switch(persondao.logindao(n,p)) {
		case "client" :
			Client c=new Client();
			c.setVisible(true);
			connexionouregister i=new connexionouregister();
			i.setVisible(false);
			break;
		case "gestionnaire":
			gestionnaire g=new gestionnaire();
			g.setVisible(true);
			break;
		case "organisateur":
			organisateur o=new organisateur();
			o.setVisible(true);
			break;
		case "artiste":
			artiste a=new artiste();
			a.setVisible(true);
			break;
		}
	}
	public void register(String nu,String n,String pr,String pa,String r) {
		Person p=new Person(nu,n,pr,pa,r);
		persondao.register(p);
		
	}
}
