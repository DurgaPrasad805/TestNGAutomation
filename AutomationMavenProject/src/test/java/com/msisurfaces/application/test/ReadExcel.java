package com.msisurfaces.application.test;

import java.util.List;
import java.util.Map;

import com.msisurfaces.framework.utilities.ExcelUtil;

public class ReadExcel {

	public static void main(String[] args) {
		
		List<Map<String,String>> data=ExcelUtil.readData("Book1.xlsx", "LoginData");
		
		System.out.println(data.get(3).get("SecretCode"));

	}

}
