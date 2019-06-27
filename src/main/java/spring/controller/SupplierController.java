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

import spring.model.Address;
import spring.model.Supplier;
import spring.service.GenericService;

@Controller
public class SupplierController {
	@Autowired
	private GenericService<Supplier> supplierService;
	@Autowired
	private GenericService<Address> addressService;
	
	private Address address;
	
	@GetMapping("/addSupplier")
	public String newSupplier(Model model) {
		contructorModel(model);
		address = new Address();
		model.addAttribute("address",address);
		return "addSupplier";
	}

	@GetMapping("/showSupplier")
	public String showSupplier(Model model) {
		model.addAttribute("listSuppliers", getList());
		return "showSupplier";
	}
	
	@RequestMapping("/detailSupplier/{id}")
	public String detailSupplier(@PathVariable String id,Model model) {
		Supplier supplier = supplierService.findById(id);
		Integer address_id = supplier.getAddress_id();
		model.addAttribute("supplier", supplier);
		model.addAttribute("address", getListAddress(address_id));
		System.out.println("Model detail: "+ model);
		return "detailSupplier";
	}

	@RequestMapping("/editSupplier/{id}")
	public String editSupplier(@PathVariable String id, Model model) {
		Supplier Supplier = supplierService.findById(id);
		model.addAttribute("supplier", Supplier);
		return "editSupplier";
	}

	@PostMapping("/saveSupplier")
	public String saveSupplier(@ModelAttribute("supplier") @Valid Supplier supplier, @ModelAttribute("address") @Valid Address address, BindingResult result, Model model) {
		if (result.hasErrors()) {
			contructorModel(model);
			System.out.println("Model: " + model);
			System.out.println("Error saving: " + result.getAllErrors());
			return "addSupplier";
		}
		if(supplierService.findByName(supplier.getName()))
		{
			System.out.println("Supplier " + supplier.getName() + " exists.");
			model.addAttribute("SupplierExisted", supplier);
			contructorModel(model);
			System.out.println("Model: " + model);
			return "addSupplier";
		}
		address.setStreet(address.getStreet());
		address.setWard(address.getWard());
		address.setDistrict(address.getDistrict());
		address.setCity(address.getCity());
		address.setCountry(address.getCountry());
		address.setPostalCode(address.getPostalCode());
		
		
		System.out.println("Address: " + address);
		System.out.println("save Supplier: " + supplier);
		System.out.println("to the save service");
		
		
		
		try {
			addressService.save(address);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		supplier.setAddress_id(address.getAddress_id());
		supplierService.save(supplier);
		return "redirect:/showSupplier";

	}

	@RequestMapping("/deleteSupplier/{id}")
	public String deleteSupplier(@PathVariable String id, Model model) {
		supplierService.delete(id);
		return "redirect:/showSupplier";
	}

	public List<Supplier> getList() {
		List<Supplier> listSuppliers = supplierService.findAll();
		int length = listSuppliers.size();
		int count = 1;
		for (Supplier obj : listSuppliers) {
			if (count <= length) {
				obj.setNumberOfObject(count);
				count++;
			}
		}
		return listSuppliers;
	}
	
	public Address getListAddress(Integer id) {
		Address address = addressService.findByIntegerId(id);
		System.out.println("Address to detail: " + address);
		return address;
	}
	
	public Model contructorModel(Model model) {
		List<Supplier> listSuppliers = supplierService.findAll();
		int length = listSuppliers.size();
		int id;
		Supplier Supplier = new Supplier();
		if(length == 0 || listSuppliers == null)
		{
			id = 1;
			Supplier.setId("SID"+id);
			model.addAttribute("supplier", Supplier);
			System.out.println(model);
		}
		else
		{
			id = (length + 1);
			Supplier.setId("SID"+id);
			model.addAttribute("supplier", Supplier);
			System.out.println(model);
		}
		return model;
	}
}
