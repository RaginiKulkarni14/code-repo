package com.test.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;

public class FileTransfer {

	public static void main(String[] args) throws IOException {
		Path dir = Paths.get("C:\\Users\\rukulkar.I-FLEX\\Desktop\\TestFile");  // specify your directory

		Optional<Path> lastFilePath = Files.list(dir)    // here we get the stream with full directory listing
		    .filter(f -> !Files.isDirectory(f))  // exclude subdirectories from listing
		    .max(Comparator.comparingLong(f -> f.toFile().lastModified()));  // finally get the last file using simple comparator by lastModified field

		Path filePath = lastFilePath.get();
		
		System.out.println(filePath);
		
		String fileName = filePath.getFileName().toString();
		
		String pattern =  "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
		
		// First we see the input string.
	    String input = "Sample_File_$date_*.xlsx";

	    // Here we call Regex.Match. 
		sleepMethod();
		

	}
	
	public static void sleepMethod()
	{
		long sl=1*60*1000;
		int count =3;
		while(count>0)
		{
			System.out.println("before sleep");
			try {
				Thread.sleep(sl);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("ecxp");
			}
		}
		
	}

}
