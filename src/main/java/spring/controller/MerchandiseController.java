package spring.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.model.Merchandise;
import spring.model.Merchandise_Type;
import spring.service.GenericService;

@Controller
public class MerchandiseController{
	
	@Autowired
	private GenericService<Merchandise> merchandiseService;
	
	@Autowired
	private GenericService<Merchandise_Type> merchandise_TypeService;
	
	@GetMapping("/addMerchandise")
	public String newMerchandise(Model model) {
		contructorModel(model);
		model.addAttribute("typeList", getList_Type());
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
	public String saveMerchandise(@ModelAttribute("merchandise") @Valid Merchandise entity, BindingResult result, Model model) {
		if (result.hasErrors()) {
			contructorModel(model);
			System.out.println("Model: " + model);
			System.out.println("Error saving: " + result.getAllErrors());
			return "addMerchandise";
		}
		if(merchandiseService.findByName(entity.getName()))
		{
			System.out.println("Merchandise " + entity.getName() + " exists.");
			model.addAttribute("userExisted", entity);
			contructorModel(model);
			System.out.println("Model: " + model);
			return "addMerchandise";
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
	
	public Map<String,String> getList_Type(){
//		Map referenceData = new HashMap();
		List<Merchandise_Type> list = merchandise_TypeService.findAll();
		Map <String,String> dropBoxData = new LinkedHashMap<String,String>();
		for(Merchandise_Type obj : list)
		{
			dropBoxData.put(obj.getId(), obj.getName());
		}
//		referenceData.put("listTypes", dropBoxData);
		return dropBoxData;
	}
	
	public Model contructorModel(Model model) {
		List<Merchandise> listMerchandises = merchandiseService.findAll();
		int length = listMerchandises.size();
		int id;
		if(length == 0 || listMerchandises == null)
		{
			id = 1;
			Merchandise merchandise = new Merchandise();
			merchandise.setId("MID"+id);
			model.addAttribute("merchandise", merchandise);
			System.out.println(model);
		}
		else
		{
			id = (length + 1);
			Merchandise merchandise = new Merchandise();
			merchandise.setId("MID"+id);
			model.addAttribute("merchandise", merchandise);
			System.out.println(model);
		}
		return model;
	}
}
