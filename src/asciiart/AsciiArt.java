//Author: Daniel Hart
//This program will display a D as output. Its size varies with the int SIZE.
//
//Potential improvements: Ask the user what size of D they would like.
//Consider printing the D into a text file.

package asciiart;

public class AsciiArt {
    public static final int SIZE=10;
	
    public static void main(String[] args) {
	top();
	bottom();
    }
	
    public static void top() {
	for (int i=1; i<=SIZE; i++) {
            for (int j=1; j<=i; j++) {
            	System.out.print("D");
            }
            System.out.println();
        }
    }
	
    public static void bottom() {
        for (int i=SIZE; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("D");
            }
            System.out.println();
        }
    }
}