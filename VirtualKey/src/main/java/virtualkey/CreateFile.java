package virtualkey;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

@SuppressWarnings("resource")
public class CreateFile {

	public void CreateFile() {
		try {
			// Prompt for Entry
			Path path = Paths.get("");
			System.out.println("********************************** \n" + "Please enter new file name: ");
			Scanner input = new Scanner(System.in);
			String newFileName = input.next();

			// Creating a new file object for the file to be created.
			File newFile = new File(Virtual_Key.directory.toString(), newFileName);

			// if file is present, print out file created + filename.
			if (newFile.createNewFile()) {
				System.out.println("File created: " + newFile.getName());
				Thread.sleep(1000);
			} else {
				System.out.println("File already exists.");
			}

			// Displaying the menu
			Virtual_Key.MainMenu();

			// If Error Return to menu
		} catch (IOException | InterruptedException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			Virtual_Key backToMenu = new Virtual_Key();

			try {
				Virtual_Key.MainMenu();
			} catch (IOException e1) {
				System.out.println("Error trying to reach the main menu");
				e1.printStackTrace();
			}
		}
	}
}

