package spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

import spring.model.Export_Detail_Note;
import spring.model.Export_Note;
import spring.model.Import_Detail_Note;
import spring.model.Import_Note;
import spring.model.Merchandise;
import spring.model.User;
import spring.service.GenericService;

@Controller
public class ImportController {
	
	@Autowired
	private GenericService<Import_Detail_Note> import_detailService;
	
	@Autowired
	private GenericService<Import_Note> import_noteService;
	
	@Autowired
	private GenericService<Merchandise> merchandiseService;
	
	private Import_Note importNote = new Import_Note();
	
	@GetMapping("/addImport")
	public String importPage(Model model) {
		contructorNote(model);
		contructorDetail(model);
		return "addImport";
	}
	
	
	@GetMapping("/showAllImportNote")
	public String ShowImportNote(Model model) {
		model.addAttribute("listNote",getList());
		return "showAllImportNote";
	}
	
	@GetMapping("/getImportDetail/{importDetailId}")
	public String getImportDetail(@PathVariable(name = "importDetailId") String importDetailId, Model model) {
		Import_Detail_Note getDetailNote = import_detailService.returnUserFindByName(importDetailId);
		if (getDetailNote != null) {
			model.addAttribute("importDetail", getDetailNote);
		}
		return "editImport";
	}
	
	@PostMapping("/updateImportDetail")
	public String updateImportDetail(@ModelAttribute("importDetail") @Valid Import_Detail_Note detail,
			BindingResult result, Model model) {

		import_detailService.update(detail);
		return "redirect:/showAllImportNote";

	}
	
	@PostMapping("/saveImportNote")
	public String saveImportNote(@ModelAttribute("note") @Valid Import_Note note, @ModelAttribute("detail") @Valid Import_Detail_Note detail, BindingResult result, Model model) {
		System.out.println("Note: " + note);
		System.out.println("Detail: " + detail);
		List<Merchandise> listMerchandise = merchandiseService.findAll();
		
		//System.out.println("role: " + user.getRole().getName());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		if (result.hasErrors()) {
			contructorDetail(model);
			contructorNote(model);
			System.out.println("Model: " + model);
			System.out.println("Error saving: " + result.getAllErrors());
			return "addImport";
		}
		System.out.println();
		model.addAttribute("listMerchandise",listMerchandise);
		model.addAttribute("detail",detail);
		contructorNote(model);
		contructorDetail(model);
		importNote.setId(note.getId());
		
		import_noteService.save(note);
		return "detailNote";
	}
	
	@PostMapping("/saveDetailNote")
	public String saveDetailNote(@ModelAttribute("note") @Valid Import_Note note, @ModelAttribute("detail") @Valid Import_Detail_Note detail, BindingResult result, Model model) {
		System.out.println("Note: " + note);
		System.out.println("Detail: " + detail);
		List<Merchandise> listMerchandise = merchandiseService.findAll();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		if (result.hasErrors()) {
			contructorDetail(model);
			contructorNote(model);
			System.out.println("Model: " + model);
			System.out.println("Error saving: " + result.getAllErrors());
			return "addImport";
		}
		detail.setImport_Note_id(importNote.getId());
		import_detailService.save(detail);
		System.out.println(detail);
		
		model.addAttribute("listMerchandise",listMerchandise);
		List<Import_Detail_Note> listDetail = import_detailService.getListByAttribute(importNote.getId());
		model.addAttribute("listDetail",listDetail);
		model.addAttribute("note",importNote);
		contructorDetail(model);
		return "detailNote";
	}
	
//	public Model contructorDetail(Model model) {
//		List<Import_Detail_Note> listDetail = import_detailService.findAll();
//		int lengthDetail = listDetail.size();
//		int id;
//		if(lengthDetail == 0 || listDetail == null)
//		{
//			id = 1;
//			Import_Detail_Note detail = new Import_Detail_Note();
//			detail.setId("DID"+id);
//			model.addAttribute("detail", detail);
//			System.out.println(model);
//		}
//		else
//		{
//			id = (lengthDetail + 1);
//			Import_Detail_Note detail = new Import_Detail_Note();
//			detail.setId("DID"+id);
//			model.addAttribute("detail", detail);
//			System.out.println(model);
//		}
//		return model;
//	}
	
	public List<Import_Note> getList() {
		List<Import_Note> listNotes = import_noteService.findAll();
		int length = listNotes.size();
		int count = 1;
		for (Import_Note obj : listNotes) {
			if (count <= length) {
				obj.setNumberOfObject(count);
				count++;
			}
		}
		return listNotes;
	}
	
	public Model contructorNote(Model model) {
		Random rand = new Random();
		String noteId = "IMPORTID-" + Math.abs(rand.nextInt());
		Import_Note getNote = import_noteService.findById(noteId);
		Import_Note modelNote = new Import_Note();
		while (getNote != null) {
			noteId = "IMPORTID-" + rand.nextInt();
			getNote = import_noteService.findById(noteId);
		}

		if (getNote == null) {
			modelNote.setId(noteId);
			model.addAttribute("note", modelNote);
		}
		return model;
	}
	
	public Model contructorDetail(Model model) {
		Random rand = new Random();
		String detailNoteId = "IMDETAILID-" + Math.abs(rand.nextInt());
		Import_Detail_Note getDetailNote = import_detailService.findById(detailNoteId);
		Export_Detail_Note modelNote = new Export_Detail_Note();
		while (getDetailNote != null) {
			detailNoteId = "IMDETAILID-" + rand.nextInt();
			getDetailNote = import_detailService.findById(detailNoteId);
		}

		if (getDetailNote == null) {
			modelNote.setId(detailNoteId);
			model.addAttribute("detail", modelNote);
		}
		return model;
	}

//	public Model contructorNote(Model model) {
//		List<Import_Note> listNote = import_noteService.findAll();
//		int lengthNote = listNote.size();
//		int id;
//		if(lengthNote == 0 || listNote == null)
//		{
//			id = 1;
//			Import_Note note = new Import_Note();
//			note.setId("NDID"+id);
//			model.addAttribute("note", note);
//			System.out.println(model);
//		}
//		else
//		{
//			id = (lengthNote + 1);
//			Import_Note note = new Import_Note();
//			note.setId("NDID"+id);
//			model.addAttribute("note", note);
//			System.out.println(model);
//		}
//		return model;
//	}
	
	@GetMapping("/deleteNote/{id}")
	public String deleteImportNote(@PathVariable String id, Model model) {
		List<Import_Detail_Note> detail = import_detailService.getListByAttribute(id);
		for(Import_Detail_Note obj: detail)
		{
			import_detailService.delete(obj.getId());
		}
		import_noteService.delete(id);
		return "redirect:/showAllImportNote";
	}
	
	@RequestMapping("/deleteDetail/{id}")
	public String deleteDetail(@PathVariable String id, Model model) {
		import_detailService.delete(id);
		return "";
	}
}
