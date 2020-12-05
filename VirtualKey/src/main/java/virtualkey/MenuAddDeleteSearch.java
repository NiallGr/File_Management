package virtualkey;

import java.io.IOException;
import java.util.Scanner;

public class MenuAddDeleteSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void MenuADS() throws IOException {
		loop:
	    	while (true) 	{
			String FileOptions =
		"********************************** \n" +
				"Menu :\n"
						+ " \"1\" add a file : \n"
						+ " \"2\" Delete a file: \n"
						+ " \"3\" Search for a file : \n"
						+ " \"4\" Back to menu : \n";
	    System.out.println(FileOptions);
	    int choose2;
	    System.out.print("Enter your selection: "); 
	    Scanner input= new Scanner(System.in);
		choose2 = input.nextInt();  	
		switch(choose2){
		case 1:
//			Method located in createFile. 
			CreateFile createFile =new CreateFile();
	         createFile.CreateFile(); 
		    System.out.println("File Was Created" );	
		    break loop;
//		    Delete File
		case 2:
			DeleteClass deleteClass =new DeleteClass();
			deleteClass.DeleteFile();
			System.out.println("File Was Deleted" );				
			break loop;
//			Search File
		case 3:
			SearchFile searchFile =new SearchFile();
			searchFile.SearchFile();
			System.out.println("File Found" );
			break loop;
//			Return To menu
		case 4:
			Virtual_Key backToMenu = new Virtual_Key();
			Virtual_Key.MainMenu();
			break loop;
	    default:
	        System.out.println("Please retry that is not a correct input");
	        break;
				}
	   	};	
	}
}
