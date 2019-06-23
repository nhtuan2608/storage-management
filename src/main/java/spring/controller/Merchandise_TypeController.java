package spring.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.model.Merchandise_Type;
import spring.service.GenericService;

@Controller
public class Merchandise_TypeController {
		
	@Autowired
	private GenericService<Merchandise_Type> merchandise_typeService;
	
	@GetMapping("/addMerchandise_type")
	public String newMerchandise_Type(Model model) {
		model.addAttribute("merchandise_type", new Merchandise_Type());
		return "addMerchandise";
	}

	@GetMapping("/showMerchandise_type")
	public String showMerchandise_Type(Model model) {
		model.addAttribute("listMerchandise_types", getList());
		return "showMerchandise_type";
	}

	@RequestMapping("/editMerchandise_type/{id}")
	public String editMerchandise_Type(@PathVariable String id, Model model) {
		Merchandise_Type Merchandise_Type = merchandise_typeService.findById(id);
		model.addAttribute("merchandise_type", Merchandise_Type);
		return "editMerchandise_type";
	}

	@PostMapping("/saveMerchandise_type")
	public String saveMerchandise_Type(@ModelAttribute("merchandise") @Valid Merchandise_Type entity, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Error saving: " + result.getAllErrors());
			return "editMerchandise_type";
		}
		System.out.println("save Merchandise: " + entity);
		System.out.println("to the save service");
		merchandise_typeService.save(entity);
		return "redirect:/showMerchandise_type";

	}

	@RequestMapping("/deleteMerchandise_type/{id}")
	public String deleteMerchandise_Type(@PathVariable String id, Model model) {
		merchandise_typeService.delete(id);
		return "redirect:/showMerchandise_type";
	}

	public List<Merchandise_Type> getList() {
		List<Merchandise_Type> listMerchandise_types = merchandise_typeService.findAll();
		int length = listMerchandise_types.size();
		int count = 1;
		for (Merchandise_Type obj : listMerchandise_types) {
			if (count <= length) {
				obj.setNumberOfObject(count);
				count++;
			}
		}
		return listMerchandise_types;
	}
		
//		@RequestMapping(value="/saveUser", method=RequestMethod.POST)
//		public String saveUser(Model model,HttpServletRequest rq, 
//				@RequestParam("userNo") String usrNo, 
//				@RequestParam("userName") String usrName,
//				@RequestParam("userRole") String usrRole) {
////			String usrNo = rq.getParameter("userNo");
////			String usrName = rq.getParameter("userName");
////			String usrRole = rq.getParameter("userRole");
//			
////			model.addAttribute("userNo",usrNo);
////			model.addAttribute("userName",usrName);
////			model.addAttribute("userRole",usrRole);
//			
//			User usr = new User();
//			usr.setUserNo((Integer.parseInt(usrNo)));
//			usr.setUserName((usrName));
//			usr.setUserRole((usrRole));
//			
//			model.addAttribute("user",usr);
//			return "showUser";
//		}
}
