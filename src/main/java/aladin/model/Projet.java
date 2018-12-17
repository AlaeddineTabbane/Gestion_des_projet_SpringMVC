package aladin.model;

public class Projet {
	private Integer num;
	private String titre;
	private int etat;
	private int dept;
	public Projet(Integer num, String titre, int etat, int dept) {
		super();
		this.num = num;
		this.titre = titre;
		this.etat = etat;
		this.dept = dept;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
