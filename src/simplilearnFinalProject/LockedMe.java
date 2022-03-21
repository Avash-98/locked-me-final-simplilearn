package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {
	static final String projectFilesPath = "E:\\Simplilearn\\FinalProject\\LockedMeFiles";

	public static void displayMenu() {
		System.out.println("**************************************************************************************");
		System.out.println("\tWelcome to LockedMe.com secure app");
		System.out.println("\tDeveloped by : Avash Puitandy");
		System.out.println("**************************************************************************************");
		System.out.println("\t1. Display all files.");
		System.out.println("\t2. Add a new file.");
		System.out.println("\t3. Delete a file.");
		System.out.println("\t4. Search a file.");
		System.out.println("\t5. Exit.");
		System.out.println("**************************************************************************************");
	}

	public static void displayAllFiles() {
		File obj = new File(projectFilesPath);
		File[] listOfFiles = obj.listFiles();
		if (listOfFiles.length > 0) {
			System.out.println("Files list in ascending order: ");
			for (var l : listOfFiles) {
				System.out.println(l.getName());
			}
		} else {
			System.out.println("No files found ");
		}
	}

	public static void addFiles() {
		try {
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter the name of the file: ");
			fileName = obj.nextLine();

			int linesCount;
			System.out.println("Enter how many lines in the file: ");
			linesCount = Integer.parseInt(obj.nextLine());

			FileWriter fw = new FileWriter(projectFilesPath + "\\" + fileName);
			for (int i = 1; i <= linesCount; i++) {
				System.out.println("Enter file line: ");
				fw.write(obj.nextLine() + "\n");
			}
			System.out.println("File created successfully ");
			fw.close();
			obj.close();

		} catch (Exception Ex) {

		}
	}

	public static void deleteFiles() {
		try {
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter the name of the file to be deleted: ");
			fileName = obj.nextLine();
			File fw = new File(projectFilesPath + "\\" + fileName);
			if (fw.exists()) {
				fw.delete();
				System.out.println("File deleted successfully ");
			} else {
				System.out.println("File not found ");
			}obj.close();
		} catch (Exception Ex) {
			System.out.println("File cannot be deleted. Please contact admin ");
		}
	}

	public static void searchFile() {
		try {
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter the file to be searched ");
			fileName = obj.nextLine();
			ArrayList<String> allFilesNames = new ArrayList<String>();
			File fw = new File(projectFilesPath);
			File[] listOfFiles = fw.listFiles();
			if (listOfFiles.length > 0) {
				for (var l : listOfFiles) {
					allFilesNames.add(l.getName());
				}
			}
			File f = new File(projectFilesPath + "\\" + fileName);
			if (allFilesNames.contains(fileName)) {
				System.out.println("File is available ");
			} else {
				System.out.println("File Not Found");
			}//obj.close();
		} catch (Exception Ex) {

		}
	}
}