package spring.controller;

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
import spring.model.Export_Detail_Note;
import spring.model.Export_Note;
import spring.model.Import_Detail_Note;
import spring.model.Merchandise;
import spring.service.GenericService;

@Controller
public class ExportController {
	
	@Autowired
	private GenericService<Export_Detail_Note> export_detailService;
	@Autowired
	private GenericService<Export_Note> export_noteService;
	@Autowired
	private GenericService<Merchandise> merchandiseService;
		
	@GetMapping("/addExport")
	public String exportPage(Model model) {
			contructorNote(model);
		return "addExport";
	}
	
	@GetMapping("/showAllExportNote")
	public String ShowExportNote(Model model) {
		List<Export_Note> listNote = export_noteService.findAll();
		model.addAttribute("listNote",listNote);
		return "showAllExportNote";
	}
	
	@PostMapping("/saveExportNote")
	public String saveExportNote(@ModelAttribute("note") @Valid Export_Note note, BindingResult result, Model model) {
		note.setStatus("Khoi Tao");
		List<Merchandise> listMerchandise = merchandiseService.findAll();
		model.addAttribute("listMerchandise",listMerchandise);
		model.addAttribute("note",note);
		contructorDetail(model);
		export_noteService.save(note);
		return "exportDetailNote";
	}
	
	@PostMapping("/saveExportDetailNote")
	public String saveExportDetailNote(@ModelAttribute("detail") @Valid Export_Detail_Note detail, BindingResult result, Model model) {
		List<Merchandise> listMerchandise = merchandiseService.findAll();
		export_detailService.save(detail);
		
		model.addAttribute("listMerchandise",listMerchandise);
		List<Export_Detail_Note> listDetail = export_detailService.getListByAttribute(detail.getExport_Note_id());
		model.addAttribute("listDetail",listDetail);
		Export_Note getNote = export_noteService.findById(detail.getExport_Note_id());
		model.addAttribute("note",getNote);
		contructorDetail(model);
		return "exportDetailNote";
	}
	
	@GetMapping("/getExportDetail/{exportDetailId}")
	public String getExportDetail(@PathVariable(name = "exportDetailId") String exportDetailId, Model model) {
		Export_Detail_Note getDetailNote = export_detailService.findByForeignKey(exportDetailId);
		if(getDetailNote != null) {
			model.addAttribute("exportDetail",getDetailNote);
		}
		return "getExportDetail";
	}
	
	
	
	public Model contructorNote(Model model) {
		Random rand = new Random(); 
		String nodeId ="EXPORTID-"+ Math.abs(rand.nextInt());
		Export_Note getNote = export_noteService.findById(nodeId);
		Export_Note modelNote = new Export_Note();
		while(getNote != null) {
			nodeId ="EXPORTID-"+ rand.nextInt();
			getNote = export_noteService.findById(nodeId);
		}
		
		if(getNote == null) {
			modelNote.setId(nodeId);
			model.addAttribute("note", modelNote);
		}
		return model;
	}
	
	public Model contructorDetail(Model model) {
		Random rand = new Random(); 
		String detailNodeId ="EXDETAILID-"+ Math.abs(rand.nextInt());
		Export_Detail_Note getDetailNote = export_detailService.findById(detailNodeId);
		Export_Detail_Note modelNote = new Export_Detail_Note();
		while(getDetailNote != null) {
			detailNodeId ="EXDETAILID-"+ rand.nextInt();
			getDetailNote = export_detailService.findById(detailNodeId);
		}
		
		if(getDetailNote == null) {
			modelNote.setId(detailNodeId);
			model.addAttribute("detail", modelNote);
		}
		return model;
	}
	
	public List<Export_Note> getList() {
		List<Export_Note> listNotes = export_noteService.findAll();
		int length = listNotes.size();
		int count = 1;
		for (Export_Note obj : listNotes) {
			if (count <= length) {
				obj.setNumberOfObject(count);
				count++;
			}
		}
		return listNotes;
	}
	
	
}	