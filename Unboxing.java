package Wrapperclass;

public class unbox {
    public static void main(String[] args) {
        Integer obj = new Integer(102);

       
        int num = obj.intValue();

        System.out.println("Wrapper object: " + obj);
        System.out.println("Unboxed (Primitive) value: " + num);
    }
}