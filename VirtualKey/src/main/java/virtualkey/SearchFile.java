package virtualkey;

import java.io.File;  // Import the File class
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchFile { 
  public static void main(String[] args) {
	  
  }
  

  public void SearchFile() {
	  System.out.println("********************************** \n" );
	  System.out.print("Please Enter New File Name: ");
	    try (Scanner input = new Scanner(System.in)) {
			String searchFile; 
			  searchFile = input.next();
			  Path path = Paths.get("");
			  File directory =new File(path.toAbsolutePath().toString() + "\\NewFiles");
				String absolutePath = new String(path.toAbsolutePath().toString());
				int absolutePathLength = absolutePath.length() - 1;
				char userPath = absolutePath.charAt(absolutePathLength);
//				Option 1 file path:
				if(absolutePath.charAt(absolutePathLength) == '1'){
				directory = new File(path.toAbsolutePath().toString() + "\\VirtualKey\\NewFiles", searchFile);
				File myObj = new File(path.toAbsolutePath().toString() + "\\\\VirtualKey\\NewFiles", searchFile);
			    String v = myObj.getName();
//     ignoring case sensitivity, while comparing Input and folder location
			if (v.equalsIgnoreCase(searchFile) && myObj.canWrite() == true){
				System.out.println("\n" + "********************************** \n"); 
				System.out.println("File FOUND");	
							System.out.println("File name: " + myObj.getName());
							System.out.println("Absolute path: " + myObj.getPath());
							System.out.println("Writeable: " + myObj.canWrite());
							System.out.println("Readable " + myObj.canRead());
							System.out.println("File size in bytes " + myObj.length());
							System.out.println("********************************** \n");
							promptReturnToMenu();
			} 	else {
					System.out.println("\n**********************************");
					System.out.println("The file does not exist.");
					System.out.println("********************************** \n");
					SearchFile();
				}	
			}  else {
					directory = new File(path.toAbsolutePath().toString() + "\\NewFiles", searchFile);
					File myObj = new File(path.toAbsolutePath().toString() + "\\NewFiles", searchFile);
				    String v = myObj.getName();
//	     ignoring case sensitivity, while comparing Input and folder location
				if (v.equalsIgnoreCase(searchFile) && myObj.canWrite() == true){
					System.out.println("\n" + "********************************** \n"); 
					System.out.println("File FOUND");	
					System.out.println("File name: " + myObj.getName());
					System.out.println("Absolute path: " + myObj.getPath());
					System.out.println("Writeable: " + myObj.canWrite());
					System.out.println("Readable " + myObj.canRead());
					System.out.println("File size in bytes " + myObj.length());
					System.out.println("********************************** \n");
				  promptReturnToMenu();
				} else {
					System.out.println("\n**********************************");
				  System.out.println("The file does not exist.");
				  System.out.println("********************************** \n");
				  SearchFile();
				}
			}
			}
			}
	    
 
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

