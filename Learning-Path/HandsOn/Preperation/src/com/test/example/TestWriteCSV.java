package com.test.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriteCSV {

	public static void main(String[] args) {

		 try {
	            File outFile = new File("C:\\Users\\rukulkar.I-FLEX\\Desktop\\TestFile\\readcsv\\writecsv.csv");
	            FileWriter fw = new FileWriter(outFile,true);
	            BufferedWriter bw = new BufferedWriter(fw);
	 
	          //  while(true){
	                if (outFile.exists() && outFile.length()==0){ //Judge whether the file is empty
	                                         System.out.println("The file is empty");
	                                         bw.write("one,two,three,four"); //Add header
	                    bw.newLine();
	                    bw.flush();
	                }else {
	                                         System.out.println("File exists");
	                    bw.write("1,2,3,4");
	                    bw.newLine();
	                    bw.write("5,6,7,8");
	                    bw.newLine();
	                    bw.flush();
	                }
	            //}
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
