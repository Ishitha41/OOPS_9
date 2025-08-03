package Strings;

public class Multiplestring {

}
    public static void main(String[] args) {
        String text = "  Java Programming  ";

        
        System.out.println("Original: '" + text + "'");

 
        String trimmed = text.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        
        System.out.println("Uppercase: " + trimmed.toUpperCase());

        
        System.out.println("Lowercase: " + trimmed.toLowerCase());

       
        System.out.println("Length: " + trimmed.length());

        
        System.out.println("Contains 'Java'? " + trimmed.contains("Java"));

       
        System.out.println("Replace 'Java' with 'Core Java': " + trimmed.replace("Java", "Core Java"));
    }
}