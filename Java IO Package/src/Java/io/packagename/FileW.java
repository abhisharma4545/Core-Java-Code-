package Java.io.packagename;

import java.io.FileWriter;
import java.io.IOException;

// write file using File Writer
public class FileW {
	
	public static void main(String[] args) {
		   try(FileWriter writer = new FileWriter("ao.txt")){
			   
			      writer.write("Hello, Java IO !");
			      System.out.println("Current directory: " + System.getProperty("user.dir"));

			   
		   }catch (IOException e) {
			// TODO: handle exception
			   e.printStackTrace();
		}
	}

}
