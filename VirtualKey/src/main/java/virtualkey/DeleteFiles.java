package virtualkey;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DeleteFiles {
  
	public void DeleteFile() {
		System.out.println("********************************** \n");
		System.out.print("Please enter a file to be deleted: ");
		Scanner input = new Scanner(System.in);
		String deleteFileName = input.next();

		File deleteFile = new File(Virtual_Key.directory.toString(), deleteFileName);

		// Checking that the file directory exists
		if(Virtual_Key.directory.exists()) {

			// Checking that the file successfully deleted
			if (deleteFile.delete()) {
				System.out.println("Deleted the file: " + deleteFile.getName());
				
				// Printing the menu again.
				try {
					Virtual_Key.MainMenu();
				} catch (IOException e) {
					System.out.println("Error trying to reach the main menu");
					e.printStackTrace();
				}
			} else {
				System.out.println("Failed to delete the file.");
				DeleteFile();
			}
		} else {
			System.out.println("The directory does not exist. Please restart the application.");
		}
	}
}