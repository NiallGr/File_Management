package virtualkey;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Virtual_Key {

	public static File directory;

	public static void main(String[] args) throws InterruptedException, IOException {
		// Welcome & Introduction
		Path path = Paths.get("");

		System.out.println("*****************");
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developer: Niall Grainger ");
		System.out.println("Hi " + System.getProperty("user.name") + ", " + "The current working directory is "
		+ path.toAbsolutePath());
		System.out.println("***************** " + "\n");
		Thread.sleep(1500);
		System.out.println("- How to use: \n"
		+ "- \"Lockedme\" is a file management application, with a simple to use interface. \n"
		+ "- Each interaction requires the user to inputting a numeric value between 1-4 to complete a command.\n"
		+ "- Only values of \"1\",\"2\",\"3\" or \"4\" will let the user progress to their intended destination. \n"
		+ "- The \"Adding\" and \"Deleting\" files function should be entered with case sensitivity, whereas the \"Search\" Function does not require Case Sensitivity.");
		
		updateFilepath();
		promptEnterKey();
		MainMenu();

	}

	// Prompt for Entry
	private static void promptEnterKey() {
		System.out.println("\n Press \"ENTER\" to go to menu...");
		try {
			System.in.read();
		} catch (IOException e) {
			System.out.println("Error on entry");
			e.printStackTrace();
		}
	}

	// First User Options
	@SuppressWarnings("unused")
	public static void MainMenu() throws IOException {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		loop: while (true) {
			String line = "\n" + "********************************** \n" + "System menu:\n"
					+ " \"1\" - Display all Files\n" + " \"2\" - Interaction With Files \n"
					+ " \"3\" - Close Application \n";
			System.out.println(line);
			// User choice
			System.out.print("Enter selection: ");
			int choose;
			choose = input.nextInt();
			switch (choose) {

				// Returns a list of all files present in the current directory.
				case 1:
					System.out.println("********************************** \n");

					// Checking if the directory exists, throws a message if not.
					if (directory.exists()) {

						// Checking that the directory specified is not empty.
						if (directory.list().length != 0) {

							// Looping through each object (file) within the directory and displaying each
							// filename.
							for (File object : directory.listFiles()) {
								if (object.isFile()) {
									System.out.format("File name: %s%n", object.getName());
								} else {
									System.out.println("There was a error");
								}
							}
						} else {
							System.out.println("The directory does not contain any files.");
						}
					} else {
						System.out.println("The directory does not exist. Please restart the application.");
					}

					// Re-running the menu for another selection
					promptEnterKey();
					MainMenu();
					break loop;

				// Interaction with files 4 options and new user choice
				case 2:
					MenuAddDeleteSearch.MenuADS();
					break loop;
				
				//  Close application
				case 3:
					System.out.println("Thank you for using this application" + "\n");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.exit(0);
					break loop;

				default:
					System.out.println("Not a Operation, please Select again: " + "\n");
					break;
			}
		}
	}

	// This method sets the filepath to be used by the application.
	protected static void updateFilepath() {
		// Setting the Path variable, instantiating the directory and creating a String
		// of the filepath.
		Path path = Paths.get("");
		String directoryAsString = new String(path.toAbsolutePath().toString());

		// Checking if the file path contains the VirtualKey folder and adds it if not.
		// This resolves a bug in some instances where the path returned is the root of
		// the project.
		if (directoryAsString.charAt(directoryAsString.length() - 1) == '1') {
			directory = new File(path.toAbsolutePath().toString() + "\\VirtualKey\\NewFiles");
		} else {
			directory = new File(path.toAbsolutePath().toString() + "\\NewFiles");
		}

		// Creating the NewFiles folder if one does not already exist.
		if (!directory.exists()) {
			directory.mkdirs();
		}
	}
}