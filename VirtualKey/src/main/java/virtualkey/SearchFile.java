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
	  System.out.println("Please Enter New File Name");
	    Scanner input= new Scanner(System.in);
	  String searchFile; 
	  searchFile = input.next();
	  Path path = Paths.get("");
	  File myObj = new File(path.toAbsolutePath().toString() + "\\NewFiles", searchFile); 
    String v = myObj.getName();
  
//    myObj.exists()
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
    } else {
    	System.out.println("\n**********************************");
      System.out.println("The file does not exist.");
      System.out.println("********************************** \n");
      SearchFile(); 
      
      
    }}

private void promptReturnToMenu() {
	// TODO Auto-generated method stub
	 System.out.println("Press \"ENTER\" to return to menu...");
	    try {
	    	System.in.read();
	    	Virtual_Key backToMenu = new Virtual_Key();
			Virtual_Key.MainMenu();
	    } catch (IOException e) {
	        System.out.println("Error on entry");
	        e.printStackTrace(); 
	    }
	}
}

