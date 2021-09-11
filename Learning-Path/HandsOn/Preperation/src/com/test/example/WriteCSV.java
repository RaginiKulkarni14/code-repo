package com.test.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//import com.opencsv.CSVWriter;

public class WriteCSV {
	
	public static void main(String args[]) throws IOException
	{
		//BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rukulkar.I-FLEX\\Desktop\\TestFile\\readcsv\\read.csv"));
		
		//String dir = "C:\\\\Users\\\\rukulkar.I-FLEX\\\\Desktop\\\\TestFile\\\\readcsv"; 
		
		String fileName = "read.csv";
		
		//System.out.println(dir);
		System.out.println(fileName);
		
		//addColumn(dir, fileName);
		FileWriter writer = new FileWriter("C:\\Users\\rukulkar.I-FLEX\\Desktop\\TestFile\\readcsv\\writecsv.csv",true); 
		
		String[] values = {"Name","Age","Company","Salary"};
		for (int j=0; j<values.length; j++) {
	    	String addedColumn = String.valueOf(values[j]);
	    	System.out.println(addedColumn);
	    	writer.write(values[j]+",");
	        //writer.append("\n");
	    }
		
		//writeToFile(writer);
	}
	
	public static void writeToFile() throws IOException
	{
		
        try {
            File outFile = new File("C:\\Users\\rukulkar.I-FLEX\\Desktop\\TestFile\\readcsv\\writecsv.csv");
            FileWriter fw = new FileWriter(outFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
 
            while(true){
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
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void addColumn(String path,String fileName) throws IOException{
	    BufferedReader br=null;
	    BufferedWriter bw=null;
	    final String lineSep=System.getProperty("line.separator");
	  //  List<String> data = new ArrayList<String>();

	    try {
	        File file = new File(path, fileName);
	        File file2 = new File(path, fileName+".1");//so the
	                    //names don't conflict or just use different folders

	        br = new BufferedReader(new InputStreamReader(new FileInputStream(file))) ;
	        bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
	        String line = null;
	                    int i=0;
	        for ( line = br.readLine(); line != null; line = br.readLine(),i++) 
	        {               

				/*
				 * String[] data = line.split(splitBy); String addedColumn =
				 * String.valueOf(data.get(i));
				 */
	            //bw.write(line+addedColumn+lineSep);
	    }

	    }catch(Exception e){
	        System.out.println(e);
	    }finally  {
	        if(br!=null)
	            br.close();
	        if(bw!=null)
	            bw.close();
	    }

	}
}

	
