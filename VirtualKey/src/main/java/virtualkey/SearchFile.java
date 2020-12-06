package virtualkey;

import java.io.File; // Import the File class
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchFile {

	public void SearchFile() {
		// Prompt for Entry.
		System.out.println("********************************** \n");
		System.out.print("Please Enter New File Name: ");
		try (Scanner input = new Scanner(System.in)) {
			String searchFile;
			searchFile = input.next();

			// Option 1 file path:
			File searchFile2 = new File(Virtual_Key.directory.toString(), searchFile);
			String v = searchFile2.getName();

			// ignoring case sensitivity, while comparing Input and folder location.
			if (v.equalsIgnoreCase(searchFile) && searchFile2.canWrite() == true) {
				System.out.println("********************************** \n");
				System.out.println("File Found \n" + "File name: " + searchFile2.getName() + "\n" + "Absolute path: "
						+ searchFile2.getPath() + "\n" + "Writeable: " + searchFile2.canWrite() + "\n" + "Readable: "
						+ searchFile2.canRead() + "\n" + "File size in bytes: " + searchFile2.length() + "\n"
						+ "********************************** \n");
				promptReturnToMenu();

				// Else Return File does not exist.
			} else {
				System.out.println("\n********************************** \n" + "The file does not exist. "
						);

				SearchFile();
			}
		}
	}

	// Return to Main menu on press.
	private void promptReturnToMenu() {
		System.out.println("Press \"ENTER\" to return to menu...");
		try {
			System.in.read();
			Virtual_Key.MainMenu();
		} catch (IOException e) {
			System.out.println("Error on entry");
			e.printStackTrace();
		}
	}
}
