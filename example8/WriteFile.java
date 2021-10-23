import java.io.*;

public class WriteFile {
   public static void main(String[] args) {
      FileOutputStream out = null;
      File file;
      String mycontent = "This is my Data which needs to be written into the file";
      try {
          /* Specify the file path here
		 This returns a error if not changed */
	  file = new File("c:/myfile.txt");
	  out = new FileOutputStream(file);

          /* This logic will check whether the file exists or not
		  If the file is not found at the specified location it would create a new file */
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  	/* String content cannot be directly written into a file
	  	It needs to be converted into bytes */
	  byte[] bytesArray = mycontent.getBytes();

	  out.write(bytesArray);
	  out.flush();
	  System.out.println("File Written Successfully");
       } 
       catch (IOException ioe) {
	  ioe.printStackTrace();
       } 
       finally {
	  try {
	     if (out != null) {
		 out.close();
		}
    } 
	  catch (IOException ioe) {
	     System.out.println("Error in closing the Stream");
	  	}
       }
   }
}