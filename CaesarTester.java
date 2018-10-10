public class CaesarTester{ //this class tests the Caesar class for mistakes.
	  public static void main (String[]args){    
	    System.out.println(Caesar.letterOperation('a',2));
	    System.out.println(Caesar.encrypt("Hello",3));
	    System.out.println(Caesar.decrypt("Khoor",3));
	    System.out.println(Caesar.encryptTwo("Hello",3));
	    System.out.println(Caesar.decryptTwo("Khoor",3));
	  }
	}
