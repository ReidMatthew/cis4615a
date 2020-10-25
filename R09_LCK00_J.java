// Rule 09. Locking (LCK)
// LCK00-J. Use private final lock objects to 
// synchronize classes that may interact with untrusted code

public class R01_DCL00_J {

    public static void main(String[] args) {    }

}


public class SomeObject {
  private final Object lock = new Object(); // private final lock object
 
  public void changeValue() {
    synchronized (lock) { // Locks on the private Object
      // ...
    }
  }
}