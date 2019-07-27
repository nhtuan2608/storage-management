package spring.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import spring.model.Import_Note;

public class ViewPDF extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setHeader("Content-Disposition", "attachment, filename:\"import_note.pdf\"");
		@SuppressWarnings("unchecked")
		List<Import_Note> list = (List<Import_Note>) model.get("noteList");
		
		//header Row
		Table table = new Table(4);
		table.addCell("ID");
		table.addCell("USER_ID");
		table.addCell("CREATED_DATE");
		table.addCell("STATUS");
		
		for(Import_Note note :	list)
		{
			table.addCell(note.getId());
			table.addCell(note.getUser_id());
			table.addCell(String.valueOf(note.getCreatedAt()));
			table.addCell(note.getStatus());
		}
		
		document.add(table);
	}

}
