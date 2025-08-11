package com.msi.msisurfaces.framework.db.commons;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.msi.msisurfaces.framework.utilities.DBUtill;

public class DBCommons {

	
	public static List<Map<String,String>> readData (String query) throws SQLException{		
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		
		ResultSet dataSet  = DBUtill.readDb(query); //collect raw data from db using query
		
		while(dataSet.next()) { //will give result as true if next row available or false if no row exists  -it will begin from row 1
			
			Map<String,String> record = new HashMap<String,String>();
			for(int col=1; col <=dataSet.getMetaData().getColumnCount() ;col++) {
				String columnName = dataSet.getMetaData().getColumnName(col);
				String columnValue = dataSet.getString(col);
				record.put(columnName, columnValue);
			}
			data.add(record);
		}		
		
		return data;		
	}
}
