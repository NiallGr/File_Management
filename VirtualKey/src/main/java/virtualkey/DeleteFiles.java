package virtualkey;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner; 

public class DeleteFiles {

	public static void main(String[] args) {

	}
	
	public void DeleteFile() {
		Path path = Paths.get("");
		System.out.println("********************************** \n" );
		 System.out.print("Please enter a file to be deleted: ");
		    @SuppressWarnings("resource")
			Scanner input= new Scanner(System.in);
		    String deleteFile;
			deleteFile = input.next();
		      File myObj = new File(path.toAbsolutePath().toString() + "\\NewFiles", deleteFile);  
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	      try {
			Virtual_Key.MainMenu();
		} catch (IOException e) {
			System.out.println("Error trying to reach the main menu");
			e.printStackTrace();
		}
	    } else {
	      System.out.println("Failed to delete the file.");
	      DeleteFile();
	    }
	}
}