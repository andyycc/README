public class LetterTester{
	   public static void main (String[]args){
	     System.out.println ("This is the LetterTester.");
	     
	     if (Letter.op1('a', 1) != 'b') {
	        System.out.println("[op1] FAILED. 'a' +1 should be 'b'."); 
	        //This explains why the test failed.
	       }
	     else
	       System.out.println ("[op1] SUCCEEDED.");
	        // This informs the uier that this test passed.
	       
	     if(Letter.op2('a', Integer.MAX_VALUE) != 'x') {
	        System.out.println("[op2] FAILED. 'a' + Integer.MAX_VALUE should be 'x'.");
	      }
	     else 
	       System.out.println ("[op2] SUCCEEDED.");

	     if (Letter.op3('@', 1) != 'A'){
	        System.out.println("[op3] FAILED. '@' + 1 should be 'A'. ");
	     }
	     else 
	       System.out.println ("[op3] SUCCEEDED."); 

	     if (Letter.op4(' ', 1) != '!'){
	       System.out.println("[op4] FAILED. ' ' + 1  should be '!'.");
	     }
	     else System.out.println ("[op4] SUCCEEDED.");
	     
	    

	     
	        
	   }
	}
