// Rule 03. Numeric Types and Operations (NUM)NUM03-J. 
// Use integer types that can fully represent the possible 
// range of unsigned dataGiven thenon-compliantcode below:

public class R03_NUM03_J  {

    public static void main(String[] args) {}

    public static long getInteger(DataInputStream is) throws IOException {
      return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }

}