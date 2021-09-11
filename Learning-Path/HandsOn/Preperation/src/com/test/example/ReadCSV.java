package com.test.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadCSV {
	public static void main(String[] args) {
		String line = "";
		String splitBy = ",";
		   final String lineSep=System.getProperty("line.separator");
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rukulkar.I-FLEX\\Desktop\\TestFile\\readcsv\\readh.csv"));) {
			// parsing a CSV file into BufferedReader class constructor
			
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				/*
				 * String[] employee = line.split(splitBy); // use comma as separator
				 * System.out.println(employee[0] + ", " + employee[1] + ", " + employee[2] );
				 */
				String[] data = line.split(splitBy);
				
				for(String c:data)
				{
					List<String> add = new ArrayList<String>();
					add.add(c);
					try(FileWriter writer = new FileWriter("C:\\Users\\rukulkar.I-FLEX\\Desktop\\TestFile\\readcsv\\write.csv", true)) {
					    for (int j=0; j<line.length(); j++) {
					    	String addedColumn = String.valueOf(add.get(j));
					    	writer.write(addedColumn+",");
					        //writer.append("\n");
					    }
					   
					} catch (Exception e) {} 
				}
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}