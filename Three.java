package Arrays;

public class Three {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = {10, 20, 30, 40, 50};

	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();

	        boolean found = false;
	        for(int num : arr) {
	            if(num == key) {
	                found = true;
	                break;
	            }
	        }

	        if(found)
	            System.out.println(key + " is found in the array.");
	        else
	            System.out.println(key + " is not found in the array.");
	    }

}
