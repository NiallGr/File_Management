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
	public void CreateFile(){
		 try {  
			 Path path = Paths.get("");
			 System.out.println("********************************** \n" );
			 System.out.print("Please enter new file name: ");
			    Scanner input= new Scanner(System.in);
			    String newFile;
				newFile = input.next();
				
				File directory =new File(path.toAbsolutePath().toString() + "\\NewFiles");
				String absolutePath = new String(path.toAbsolutePath().toString());
				int absolutePathLength = absolutePath.length() - 1;
				char userPath = absolutePath.charAt(absolutePathLength);
//				Option 1 file path:
				if(absolutePath.charAt(absolutePathLength) == '1'){
				directory = new File(path.toAbsolutePath().toString() + "\\VirtualKey\\NewFiles", newFile);
				File myObj = new File(path.toAbsolutePath().toString() + "\\\\VirtualKey\\NewFiles", newFile); 
					 if (myObj.createNewFile()) { 
					    	
					        System.out.println("File created: " + myObj.getName()); 
					        Thread.sleep(1000);
//					        Back To Menu
					        @SuppressWarnings("unused")
							Virtual_Key backToMenu = new Virtual_Key();
							Virtual_Key.MainMenu();
					      } else {  
					        System.out.println("File already exists."); 
					        Virtual_Key backToMenu = new Virtual_Key();
					      }  
//				Option 2 filePath:	 
				} else {
					directory =new File(path.toAbsolutePath().toString() + "\\NewFiles", newFile);
					File myObj = new File(path.toAbsolutePath().toString() + "\\NewFiles", newFile); 
					if (myObj.createNewFile()) { 
				        System.out.println("File created: " + myObj.getName()); 
				        Thread.sleep(1000);
//				        Back To Menu
				        @SuppressWarnings("unused")
						Virtual_Key backToMenu = new Virtual_Key();
						Virtual_Key.MainMenu();
				      } else {  
				        System.out.println("File already exists.");  
				        Virtual_Key backToMenu = new Virtual_Key();
				      }  
				}

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
