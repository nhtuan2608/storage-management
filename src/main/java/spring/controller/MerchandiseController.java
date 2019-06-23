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
import spring.model.Merchandise;
import spring.service.GenericService;

@Controller
public class MerchandiseController {
	
	@Autowired
	private GenericService<Merchandise> merchandiseService;
	
	@GetMapping("/addMerchandise")
	public String newMerchandise(Model model) {
		model.addAttribute("merchandise", new Merchandise());
		return "addMerchandise";
	}

	@GetMapping("/showMerchandise")
	public String showMerchandise(Model model) {
		model.addAttribute("listMerchandises", getList());
		return "showMerchandise";
	}

	@RequestMapping("/editMerchandise/{id}")
	public String editMerchandise(@PathVariable String id, Model model) {
		Merchandise Merchandise = merchandiseService.findById(id);
		model.addAttribute("merchandise", Merchandise);
		return "editMerchandise";
	}

	@PostMapping("/saveMerchandise")
	public String saveMerchandise(@ModelAttribute("merchandise") @Valid Merchandise entity, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Error saving: " + result.getAllErrors());
			return "editMerchandise";
		}
		System.out.println("save Merchandise: " + entity);
		System.out.println("to the save service");
		merchandiseService.save(entity);
		return "redirect:/showMerchandise";

	}

	@RequestMapping("/deleteMerchandise/{id}")
	public String deleteMerchandise(@PathVariable String id, Model model) {
		merchandiseService.delete(id);
		return "redirect:/showMerchandise";
	}

	public List<Merchandise> getList() {
		List<Merchandise> listMerchandises = merchandiseService.findAll();
		int length = listMerchandises.size();
		int count = 1;
		for (Merchandise obj : listMerchandises) {
			if (count <= length) {
				obj.setNumberOfObject(count);
				count++;
			}
		}
		return listMerchandises;
	}
}
