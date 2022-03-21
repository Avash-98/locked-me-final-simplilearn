package simplilearnFinalProject;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int choice;
		do {
			LockedMe.displayMenu();
			System.out.println("Enter your choice: ");
			choice = Integer.parseInt(obj.nextLine());

			switch (choice) {
			case 1:
				LockedMe.displayAllFiles();
				break;
			case 2:
				LockedMe.addFiles();
				break;
			case 3:
				LockedMe.deleteFiles();
				break;
			case 4:
				LockedMe.searchFile();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		} while (choice > 0);
		obj.next();
		obj.close();
	}

}
