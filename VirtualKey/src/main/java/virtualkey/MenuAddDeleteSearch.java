package virtualkey;

import java.io.IOException;
import java.util.Scanner;

public class MenuAddDeleteSearch {
	public static void MenuADS() throws IOException {
		loop: while (true) {
			String FileOptions = "********************************** \n" + "Menu :\n" + " \"1\" add a file : \n"
					+ " \"2\" Delete a file: \n" + " \"3\" Search for a file : \n" + " \"4\" Back to menu : \n";

			// Diplay 4 options to user.
			System.out.println(FileOptions);
			int choose2;
			System.out.print("Enter your selection: ");
			// Get User Input
			Scanner input = new Scanner(System.in);
			choose2 = input.nextInt();
			switch (choose2) {
				case 1:
					// Method located in createFile.
					CreateFile createFile = new CreateFile();
					createFile.CreateFile();
					break loop;
				// Delete File
				case 2:
					DeleteFiles deletefiles = new DeleteFiles();
					deletefiles.DeleteFile();
					break loop;
				// Search File
				case 3:
					SearchFile searchFile = new SearchFile();
					searchFile.SearchFile();
					break loop;
				// Return To menu
				case 4:
					Virtual_Key.MainMenu();
					break loop;
				// Not a correct input
				default:
					System.out.println("Please retry that is not a correct input");
					break;
			}
		}
		;
	}
}

