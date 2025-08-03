package operators;

public class Leftright {

}
int originalNum = 8; 

System.out.println("Original number: " + originalNum + " (Binary: " + Integer.toBinaryString(originalNum) + ")");
System.out.println("Left shifted by 2: " + leftShifted + " (Binary: " + Integer.toBinaryString(leftShifted) + ")"); 


System.out.println("Right shifted by 1: " + rightShifted + " (Binary: " + Integer.toBinaryString(rightShifted) + ")"); 

int negativeNum = -16; 
System.out.println("\nNegative : " + negativeNum + " (Binary: " + Integer.toBinaryString(negativeNum) + ")");

int negRightShifted = negativeNum >> 2;
System.out.println("Right shifted by 2 : " + negRightShifted + " (Binary: " + Integer.toBinaryString(negRightShifted) + ")"); 


int unsignedRightShifted = negativeNum >>> 2;
System.out.println("Unsigned right shifted by 2 : " + unsignedRightShifted + " (Binary: " + Integer.toBinaryString(unsignedRightShifted) + ")"); 
}
}
