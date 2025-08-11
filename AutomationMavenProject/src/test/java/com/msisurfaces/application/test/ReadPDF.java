package com.msisurfaces.application.test;

import com.msisurfaces.framework.utilities.PDFUtil;

public class ReadPDF {

	public static void main(String[] args) {
		
		String pdftext=PDFUtil.getText(System.getProperty("user.dir")+"\\files\\convex_20250807_en.pdf");
		
		System.out.println(pdftext);
		

	}

}
