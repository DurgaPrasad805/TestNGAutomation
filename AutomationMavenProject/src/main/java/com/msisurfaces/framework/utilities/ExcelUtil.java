package com.msisurfaces.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static List<Map<String,String>> readData(String fileName, String sheetName){
		
		List<Map<String, String>> data=new ArrayList<Map<String, String>>();
		
		
			
				try {
					FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\"+fileName);
					
					XSSFWorkbook wb=new XSSFWorkbook(fis);
					
					XSSFSheet sh=wb.getSheet(sheetName);
					
					int toatlrows=sh.getPhysicalNumberOfRows();
					int totalColoumns=sh.getRow(0).getPhysicalNumberOfCells();
					
					for(int r=1; r<toatlrows;r++) {
						
						Map<String,String> rowdata=new HashMap<String,String>();
						
						for(int c=0;c<totalColoumns; c++) {
							
							String key=sh.getRow(0).getCell(c).getStringCellValue();
							String value=sh.getRow(r).getCell(c).getStringCellValue();
							rowdata.put(key, value);
						}
						data.add(rowdata);
						
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
		
		return data;
		
	}

}
