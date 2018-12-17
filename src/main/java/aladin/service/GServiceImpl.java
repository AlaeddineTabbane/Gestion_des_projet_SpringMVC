package aladin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aladin.dao.IGestion;
import aladin.model.Departement;
import aladin.model.Employe;
import aladin.model.Projet;

@Service
public class GServiceImpl implements IGService {

	@Autowired
	IGestion dao;
	public void setDao(IGestion dao) {
		this.dao = dao;
	}
	public List<Departement> getAllDepartement() {
		// TODO Auto-generated method stub
		return dao.getAllDepartement();
	}

	public List<Projet> getAllProjet() {
		// TODO Auto-generated method stub
		return dao.getAllProjet();
	}

	public List<Employe> getAllEmployeByDept(int numdept) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeByDept(numdept);
	}

	public List<Projet> getAllProjetbyDept(int numdept) {
		// TODO Auto-generated method stub
		return dao.getAllProjetbyDept(numdept);
	}

	public List<Employe> getAllEmployeByProjet(int numproj) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeByProjet(numproj);
	}

	public void addProjet(Projet p) {
		// TODO Auto-generated method stub
		dao.addProjet(p);
	}

	public void addEmploye(Employe e) {
		// TODO Auto-generated method stub
		dao.addEmploye(e);
	}

	public Projet getProjetByNum(int numproj) {
		// TODO Auto-generated method stub
		return dao.getProjetByNum(numproj);
	}

	public Departement getDepartementByNum(int numdept) {
		// TODO Auto-generated method stub
		return dao.getDepartementByNum(numdept);
	}

}
