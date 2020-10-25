// Rule 05. Object Orientation (OBJ)
// OBJ01-J. Limit accessibility of fields

public class R01_DCL00_J {

    public static void main(String[] args) {}

}

public class Widget {
  private int total; // Declared private
 
  public int getTotal () {
    return total;
  }
 
  void add() {
    if (total < Integer.MAX_VALUE) {     
      total++;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
  }
 
  void remove() { 
    if (total > 0) {     
      total--;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
  }
}