// Rule 07. Exceptional Behavior (ERR)
// ERR00-J. Do not suppress or ignore checked exceptions

public class R01_DCL00_J {

    public static void main(String[] args) {
        try {
            //...
          } catch (IOException ioe) {
            ioe.printStackTrace();
          }
    }

}