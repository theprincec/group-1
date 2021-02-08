package com.techelevator.readandwrite;

import com.techelevator.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FileWriter implements WriterInterface {

	private String filename;

	public FileWriter(String filename) {
		this.filename = "log.txt";
	}



	public void write(String line) throws IOException {

		try (FileWriter printWriter = new FileWriter(getFile(filename), true);
				BufferedWriter buffWriter = new BufferedWriter(printWriter)) {
			
				buffWriter.write(getDateAndTime() + " " + line + "\n");
		}

	}

	private String getDateAndTime() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
		LocalDateTime now = LocalDateTime.now();

		return dtf.format(now);
	}

	private File getFile(String filename) {

		File file = new File("log.txt");
		return file;

	}
}