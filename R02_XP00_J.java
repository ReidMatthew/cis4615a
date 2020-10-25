// Rule 02. Expressions (EXP)

public class R02_XP00_J {

    public static void main(String[] args) {    }

    public void deleteFile(){
 
      File someFile = new File("someFileName.txt");
      // Do something with someFile
      if (!someFile.delete()) {
        // Handle failure to delete the file
      }
     
    }

}