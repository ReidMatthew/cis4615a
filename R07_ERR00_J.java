// Rule 07. Exceptional Behavior (ERR)
// ERR00-J. Do not suppress or ignore checked exceptions

public class R01_DCL00_J {

    public static void main(String[] args) {
      boolean validFlag = false;
      do {
        try {
          // ...
          // If requested file does not exist, throws FileNotFoundException
          // If requested file exists, sets validFlag to true
          validFlag = true;
        } catch (FileNotFoundException e) {
          // Ask the user for a different file name
        }
      } while (validFlag != true);
      // Use the file
    }

}