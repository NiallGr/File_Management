package virtualkey;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

@SuppressWarnings("resource")
public class CreateFile {  
	  public static void main(String[] args) {  
		  
	    }  

	public void CreateFile() throws IOException {
		 try {  
			 Path path = Paths.get("");
			 System.out.println("Please enter new file name: ");
			    Scanner input= new Scanner(System.in);
			    String newFile;
				newFile = input.next();
			      File myObj = new File(path.toAbsolutePath().toString() + "\\NewFiles", newFile); 
			      if (myObj.createNewFile()) { 
			    	
			        System.out.println("File created: " + myObj.getName()); 
			        Thread.sleep(1000);
//			        Back To Menu
			        Virtual_Key backToMenu = new Virtual_Key();
					Virtual_Key.MainMenu();
			      } else {  
			        System.out.println("File already exists.");  
			      }  
			    } catch (IOException | InterruptedException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace(); 
			      Virtual_Key backToMenu = new Virtual_Key();
					Virtual_Key.MainMenu();
			    }  
		} 
	}
