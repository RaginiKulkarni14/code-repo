package com.test.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileAsAppend {

	public static void main(String[] args) throws IOException {

		writeFileAsAppend();
	}

	private static void writeFileAsAppend() throws IOException {
		List<String> lines = readFileWithHeader();
		List<String> linesWh = readFileWithoutHeader();
		Path path = getWriteFilePath();
		Files.write(path, lines, StandardOpenOption.APPEND);
		Files.write(path, linesWh, StandardOpenOption.APPEND);
	}

	private static List<String> readFileWithHeader() throws IOException {
		Path path = getReadFilePathWithHeader();
		List<String> lines = Files.readAllLines(path);
		return lines;
	}

	private static List<String> readFileWithoutHeader() throws IOException {
		Path path = getReadFilePathWithoutHeader();
		List<String> lines = Files.readAllLines(path);
		List<String> secondLine = Files.readAllLines(path).subList(1, lines.size());
		return secondLine;
	}

	private static Path getReadFilePathWithHeader() {
		Path path = Paths.get("C:\\\\Users\\\\rukulkar.I-FLEX\\\\Desktop\\\\TestFile\\\\readcsv\\\\readh.csv");
		return path.normalize();
	}

	private static Path getReadFilePathWithoutHeader() {
		Path path = Paths.get("C:\\\\Users\\\\rukulkar.I-FLEX\\\\Desktop\\\\TestFile\\\\readcsv\\\\readwh.csv");
		return path.normalize();
	}
	private static Path getWriteFilePath() {
		Path path = Paths.get("C:\\\\Users\\\\rukulkar.I-FLEX\\\\Desktop\\\\TestFile\\\\readcsv\\\\write.csv");
		return path;
	}
}
