package spring.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import spring.model.Import_Note;

public class ViewReport extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setHeader("Content-Disposition", "attachment, filename:\"import_note.xls\"");
		@SuppressWarnings("unchecked")
		List<Import_Note> list = (List<Import_Note>) model.get("noteList");
		Sheet sheet = workbook.createSheet("Import Note List");
		
		//header Row
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("ID");
		header.createCell(0).setCellValue("USER_ID");
		header.createCell(0).setCellValue("CREATED_DATE");
		header.createCell(0).setCellValue("STATUS");
		
		int rowNum = 1;
		
		for(Import_Note note :	list)
		{
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(note.getId());
			row.createCell(1).setCellValue(note.getUser_id());
			row.createCell(2).setCellValue(note.getCreatedAt());
			row.createCell(3).setCellValue(note.getStatus());
		}
	}

}
