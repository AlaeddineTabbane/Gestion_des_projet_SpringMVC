package aladin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import aladin.model.Departement;
import aladin.model.Employe;
import aladin.model.Projet;

@Repository
public class GestionImpl implements IGestion {
	
	@Autowired
	@Qualifier(value="dataSource")
	DataSource data;
	public void setData(DataSource data) {
		this.data = data;
	}

	public List<Departement> getAllDepartement() {
		// TODO Auto-generated method stub
		List<Departement> listD=null;
		try {
			listD = new ArrayList<Departement>();
			String sql = "select * from departement";
			Connection c= data.getConnection();
			PreparedStatement ps= c.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				Departement d=new Departement(rs.getInt("num"), rs.getString("nom"));
				listD.add(d);
			}
			
		}catch(Exception e) {
			System.out.println("erreur getAllDepartement");
		}
		return listD;
	}

	public List<Projet> getAllProjet() {
		List<Projet> listP=null;
		try {
			listP = new ArrayList<Projet>();
			String sql = "select * from projet";
			Connection c= data.getConnection();
			PreparedStatement ps= c.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				Projet p=new Projet(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
				listP.add(p);
			}
			
		}catch(Exception e) {
			System.out.println("erreur getAllDepartement");
		}
		return listP;
	}

	public List<Employe> getAllEmployeByDept(int numdept) {
		List<Employe> listE=null;
		try {
			listE = new ArrayList<Employe>();
			String sql = "select * from employe where dept="+numdept;
			Connection c= data.getConnection();
			PreparedStatement ps= c.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				Employe e=new Employe(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				listE.add(e);
			}
			
		}catch(Exception e) {
			System.out.println("erreur getAllDepartement");
		}
		return listE;
	}

	public List<Projet> getAllProjetbyDept(int numdept) {
		List<Projet> listP=null;
		try {
			listP = new ArrayList<Projet>();
			String sql = "select * from projet where dept="+numdept;
			Connection c= data.getConnection();
			PreparedStatement ps= c.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				Projet p=new Projet(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
				listP.add(p);
			}
			
		}catch(Exception e) {
			System.out.println("erreur getAllDepartement");
		}
		return listP;
	}

	public List<Employe> getAllEmployeByProjet(int numproj) {
		List<Employe> listE=null;
		try {
			listE = new ArrayList<Employe>();
			String sql = "select * from employe where proj="+numproj;
			Connection c= data.getConnection();
			PreparedStatement ps= c.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				Employe e=new Employe(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				listE.add(e);
			}
			
		}catch(Exception e) {
			System.out.println("erreur getAllDepartement");
		}
		return listE;
	}

	public void addProjet(Projet p) {
		try {
			String sql = "insert into projet (titre,etat,dept) values(?,?,?)";
			Connection c= data.getConnection();
			PreparedStatement ps= c.prepareStatement(sql);
			ps.setString(1, p.getTitre());
			ps.setInt(2, p.getEtat());
			ps.setInt(3, p.getDept());
			ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void addEmploye(Employe e) {
		try {
			String sql = "insert into employe (`nom`, `fonction`, `proj`, `dept`) values(?,?,?,?)";
			Connection c= data.getConnection();
			PreparedStatement ps= c.prepareStatement(sql);
			ps.setString(1, e.getNom());
			ps.setString(2, e.getFonction());
			ps.setInt(3, e.getProj());
			ps.setInt(4, e.getDept());
			ps.executeUpdate();
			
		}catch(SQLException es) {
			System.out.println(es.getMessage());
		}		
	}

	public Projet getProjetByNum(int numproj) {
		Projet p=null;
		try {
			String sql = "select * from projet where num="+numproj;
			Connection c= data.getConnection();
			PreparedStatement ps= c.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				p=new Projet(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
			}
			
		}catch(Exception e) {
			System.out.println("erreur getAllDepartement");
		}
		return p;
	}

	public Departement getDepartementByNum(int numdept) {
		Departement d=null;
		try {
			String sql = "select * from departement where num="+numdept;
			Connection c= data.getConnection();
			PreparedStatement ps= c.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				d=new Departement(rs.getInt("num"), rs.getString("nom"));
			}
			
		}catch(Exception e) {
			System.out.println("erreur getAllDepartement");
		}
		return d;
	}

}
