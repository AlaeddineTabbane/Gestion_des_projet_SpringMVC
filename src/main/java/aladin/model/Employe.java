package aladin.model;

public class Employe {

	private Integer num;
	private String nom;
	private String fonction;
	private int proj;
	private int dept;
	public Employe(Integer num, String nom, String fonction, int proj, int dept) {
		super();
		this.num = num;
		this.nom = nom;
		this.fonction = fonction;
		this.proj = proj;
		this.dept = dept;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public int getProj() {
		return proj;
	}
	public void setProj(int proj) {
		this.proj = proj;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	
	
}
