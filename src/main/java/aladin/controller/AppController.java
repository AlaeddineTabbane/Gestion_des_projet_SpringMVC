package aladin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aladin.model.Departement;
import aladin.model.Employe;
import aladin.model.Projet;
import aladin.service.IGService;

@Controller
public class AppController {
	
	@Autowired
	IGService service;
	public void setService(IGService service) {
		this.service = service;
	}
	
	@RequestMapping(value="/departements",method=RequestMethod.GET)
	public String ListDept(Model model) {
		List<Departement> listD = service.getAllDepartement();
		model.addAttribute("listD", listD);
		return "departements";
	}
	
 	@RequestMapping(value="/projets",method=RequestMethod.GET)
	public String ListProj(Model model) {
		List<Projet> listP = service.getAllProjet();
		model.addAttribute("listP", listP);
		return "projets";
	}
 	
 	@RequestMapping(value="/employes/dept/{id}",method=RequestMethod.GET)
 	public String ListEmpl(Model model,@PathVariable(value="id") int num) {
 		List<Employe> listE = service.getAllEmployeByDept(num);
 		Departement d= service.getDepartementByNum(num);
 		model.addAttribute("listE", listE);
 		model.addAttribute("dept", d);
 		return "employeByDept";
 	}
 	
 	@RequestMapping(value="/projet/dept/{id}",method=RequestMethod.GET)
 	public  String getProjet(Model model,@PathVariable(value="id") int num) {
 		List<Projet> listP = service.getAllProjetbyDept(num);
 		Departement d= service.getDepartementByNum(num);
 		model.addAttribute("listP", listP);
 		model.addAttribute("dept", d);
 		return "projetByDept";
 	}

 	@RequestMapping(value="/employes/projet/{id}",method=RequestMethod.GET)
 	public String getEmpByproj(Model model,@PathVariable(value="id") int num){
 		List<Employe> listE = service.getAllEmployeByProjet(num);
 		Projet p = service.getProjetByNum(num);
 		model.addAttribute("listE", listE);
 		model.addAttribute("proj", p);
 		return "empByProj";
 	}
 	
 	@RequestMapping(value="/addprojet",method=RequestMethod.GET)
 	public String ajoutProj(Model model,@ModelAttribute("proj") Projet proj) {
 		List<Departement> listD = service.getAllDepartement();
		model.addAttribute("listD", listD);
 		return "ajoutProjet";
 	}
 	
 	@RequestMapping(value="/saveProjet",method=RequestMethod.POST)
 	public String saveprojet(Model model,@ModelAttribute("projet") Projet proj) {
 		service.addProjet(proj);
 		return "redirect:/departements";
 	}
 	
 	@RequestMapping(value="/addEmploye",method= RequestMethod.GET)
 	public String ajoutEmploye(Model model,@ModelAttribute("Employe") Employe emp) {
 		List<Departement> listD = service.getAllDepartement();
 		List<Projet> listP = service.getAllProjet();
 		model.addAttribute("listP", listP);
		model.addAttribute("listD", listD);
		return "ajoutEmploye";
 	}
 	
 	@RequestMapping(value="/saveEmploye",method=RequestMethod.POST)
 	public String saveEmlpoye(Model model,@ModelAttribute("Employe") Employe emp) {
 		service.addEmploye(emp);
 		System.out.println(emp.getFonction());
 		System.out.println(emp.getNom());
 		return "redirect:/departements";
 	}
 	
}
