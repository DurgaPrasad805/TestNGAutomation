package com.msisurfaces.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFUtil {

	public static String getText(String filepath) {

		String text = "";

		try {
			FileInputStream fis = new FileInputStream(filepath);
			PDDocument document = PDDocument.load(fis);
			PDFTextStripper pdf = new PDFTextStripper();
			pdf.setStartPage(1);
			pdf.setEndPage(3);
			
			text = pdf.getText(document);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return text;
	}

}
