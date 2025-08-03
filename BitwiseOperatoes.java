package operators;

public class BitwiseOperatoes {

    public static void main(String[] args) {
       
        System.out.println("--- Bitwise Operators ---");
        int a = 12; 
        int b = 7; 
  System.out.println("a = " + a + " (Binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (Binary: " + Integer.toBinaryString(b) + ")");
        int resultAnd = a & b;
        System.out.println("a & b = " + resultAnd + " (Binary: " + Integer.toBinaryString(resultAnd) + ")"); 
        int resultOr = a | b;
        System.out.println("a | b = " + resultOr + " (Binary: " + Integer.toBinaryString(resultOr) + ")");   
        
        int resultComplementA = ~a;
        System.out.println("~a = " + resultComplementA + " (Binary: " + Integer.toBinaryString(resultComplementA) + ")"); 
        int resultComplementB = ~b;
        System.out.println("~b = " + resultComplementB + " (Binary: " + Integer.toBinaryString(resultComplementB) + ")"); 

        System.out.println("\n--- Compound Assignment Operators ---");