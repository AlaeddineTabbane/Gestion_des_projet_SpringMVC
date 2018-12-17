package aladin.service;

import java.util.List;

import aladin.model.Departement;
import aladin.model.Employe;
import aladin.model.Projet;

public interface IGService {
	
	public List<Departement> getAllDepartement();
	public List<Projet> getAllProjet();
	public List<Employe> getAllEmployeByDept(int numdept);
	public List<Projet> getAllProjetbyDept(int numdept);
	public List<Employe> getAllEmployeByProjet(int numproj);
	public void addProjet(Projet p);
	public void addEmploye(Employe e);
	public Projet getProjetByNum(int numproj);
	public Departement getDepartementByNum(int numdept);
	
}
