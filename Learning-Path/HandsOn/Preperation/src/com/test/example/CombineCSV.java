package com.test.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CombineCSV {

	public static void main(String[] args) throws IOException {

		writeFileAsAppend();
	}

	private static void writeFileAsAppend() throws IOException {

		try {
			File outFile = new File("C:\\Users\\rukulkar.I-FLEX\\Desktop\\TestFile\\readcsv\\write.csv");
			FileWriter fw = new FileWriter(outFile, true);
			BufferedWriter bw = new BufferedWriter(fw);

			if (outFile.exists() && outFile.length() == 0) { // check whether the file is empty
				System.out.println("The file is empty");
				bw.write("name,id,num"); // Add header
				bw.newLine();
				bw.flush();
				combineWriteCSV();
			} else {
				System.out.println("File exists");
				combineWriteCSV();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	private static void combineWriteCSV() throws IOException {
		List<String> lines = readFileWithHeader();
		List<String> linesWh = readFileWithoutHeader();
		Path path = getWriteFilePath();
		Files.write(path, lines, StandardOpenOption.APPEND);
		Files.write(path, linesWh, StandardOpenOption.APPEND);
	}

	private static List<String> readFileWithHeader() throws IOException {
		Path path = getReadFilePathBiggie();
		List<String> lines = Files.readAllLines(path);
		List<String> secondLine = Files.readAllLines(path).subList(1, lines.size());
		return secondLine;
	}

	private static List<String> readFileWithoutHeader() throws IOException {
		Path path = getReadFilePathPoolSec();
		List<String> lines = Files.readAllLines(path);
		List<String> secondLine = Files.readAllLines(path).subList(1, lines.size());
		return secondLine;
	}

	private static Path getReadFilePathBiggie() {
		Path path = Paths.get("C:\\\\Users\\\\rukulkar.I-FLEX\\\\Desktop\\\\TestFile\\\\readcsv\\\\readh.csv");
		return path.normalize();
	}

	private static Path getReadFilePathPoolSec() {
		Path path = Paths.get("C:\\\\Users\\\\rukulkar.I-FLEX\\\\Desktop\\\\TestFile\\\\readcsv\\\\readwh.csv");
		return path.normalize();
	}

	private static Path getWriteFilePath() {
		Path path = Paths.get("C:\\\\Users\\\\rukulkar.I-FLEX\\\\Desktop\\\\TestFile\\\\readcsv\\\\write.csv");
		return path;
	}
}
