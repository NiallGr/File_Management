package virtualkey;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Virtual_Key {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// Welcome & Introduction
		Path path = Paths.get("");
	  
		System.out.println("      *****************");
		Thread.sleep(1000);
		System.out.println("  Welcome to LockedMe.com");
		System.out.println("  Developer: NiallGr ");
		System.out.println("   Hi " + System.getProperty("user.name") + ", " +"The current working Dir " + path.toAbsolutePath()); 
		Thread.sleep(1000);
		System.out.println("      ***************** " + "\n");
		Thread.sleep(1000);
		System.out.println("- How to use: \n"
				+ "- \"Lockedme\" is a file management application, with a simple to use interface. \n"
				+ "- Each interaction requires the user to inputting a numeric value between 1-4 to complete a command.\n"
				+ "- Only values of \"1\",\"2\",\"3\" or \"4\" will let the user progress to their intended destination. \n" 
				+ "- The \"Adding\" and \"Deleting\" files function should be entered with case sensitivity, whereas the \"Search\" Function does not require Case Sensitivity.");
		
		promptEnterKey();
		MainMenu();
		
	}
//	Prompt for Entry
	private static void promptEnterKey() {
		 System.out.println("\n Press \"ENTER\" to go to menu...");
		    try {
		        System.in.read();
		    } catch (IOException e) {
		        System.out.println("Error on entry");
		        e.printStackTrace(); 
		    }
	}
//		First User Options
	@SuppressWarnings("unused")
	public static void MainMenu() throws IOException {
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		loop:
			while (true) {
		String line = 
				"\n" + "********************************** \n" +
				"Enter your selection:\n"
				+ " \"1\" - Display all Files : \n"
				+ " \"2\" - Interaction With Files : \n"
				+ " \"3\" - Close Application : \n" + "\n";
				System.out.println(line);
//	User choice 			
				int choose;
				choose = input.nextInt();
				switch (choose){
//				See all files 
				case 1:
					
//					
					System.out.println("******************************** \n" );
					Path path = Paths.get("");
					File directory =new File(path.toAbsolutePath().toString() + "\\NewFiles");
					String test1 = new String(path.toAbsolutePath().toString());
					int test1Length = test1.length() - 1;
					System.out.println(test1);
					char test2 = test1.charAt(test1Length);
					if(test1.charAt(test1Length) == '1'){
						directory = new File(path.toAbsolutePath().toString() + "\\VirtualKey\\NewFiles");
					} else {
						directory =new File(path.toAbsolutePath().toString() + "\\NewFiles");
					}
					System.out.println(directory.toString());
					File[]contentsofDirectory=directory.listFiles();
					System.out.println(contentsofDirectory.length);
					for (File object : contentsofDirectory) {
						if(object.isFile()) {
							System.out.format("File name: %s%n", object.getName());
						} 
						else {
							System.out.println("There was a error");
							
						}
					}
					promptEnterKey();
					MainMenu();
				    break loop;
//				    Interaction with files 4 options and new user choice
				case 2:
					MenuAddDeleteSearch.MenuADS();
					break loop;
//					Case 3 Close application 
				 case 3:
					 System.out.println("Thank you for using this application" + "\n" );
					 try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					 System.exit(0);
					 break loop;	
				   
				    default:
				        System.out.println("Not a Operation, please Select again: " + "\n" );
				      break;
	}

}
	}
	@Override
	public String toString() {
		return "Virtual_Key []";
	}

}