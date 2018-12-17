package aladin.model;

public class Departement {
	private Integer num;
	private String nom;
	public Departement(Integer num, String nom) {
		super();
		this.num = num;
		this.nom = nom;
	}
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	

}
