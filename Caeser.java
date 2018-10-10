

//Keep these two lines.  They are what tell Java to include the
//classes you need for working with files.
//You might get warnings about them at first.  That's OK, just
//ignore the warnings.  They should go away as you complete your code.
import java.io.*;
import java.util.*;

/** Your header comment goes here.
* Yoonchan Choi, cs8bfbd, 10-9-2018
* In this file, there are methods that will encrypt and decrypt
* letters by asking the amount of rotation wanted.
* Be sure to include your name, cse account name, and the date 
* */
public class Caesar {

public static char letterOperation(char letter, int rotation) {
//This method rotates the character at a specific spot
if (!Character.isLetter(letter))
  return letter;
else {
  return Letter.op3(letter,rotation);
}
}

public static String encrypt(String message, int rotation) {
//this method rotates amount of rotation each char of the string message
String Encrypt = new String();
for (int i=0; i<message.length();i++){
   Encrypt += letterOperation(message.charAt(i),rotation);
}
return Encrypt;
}

public static String decrypt(String message, int rotation) {
//this method rotates backwards amount of rotation each char of the
//string message
String Decrypt = new String();
for (int i=0; i<message.length();i++){
   Decrypt += letterOperation(message.charAt(i),-rotation);
}
return Decrypt;
}

public static String encryptTwo(String message, int rotation) {
//Does the same thing as encrypt method but uses StringBuilder
StringBuilder SB = new StringBuilder (message);
 for (int i=0; i<message.length();i++){
   SB.insert(i,letterOperation(message.charAt(i),rotation));
 
 }
 return SB.substring(0,message.length());
}

public static String decryptTwo(String message, int rotation) {
//Does the same thing as decrypt method but uses StringBuilder
StringBuilder BS = new StringBuilder (message);
 for (int i=0; i<message.length();i++){
   BS.insert(i,letterOperation(message.charAt(i),-rotation));
 
 }
 return BS.substring(0,message.length());
}

}
