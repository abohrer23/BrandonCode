//comment
import java.util.Scanner;

public class code {
	public static void main(String[] args){
		
        Scanner in = new Scanner(System.in);
    	System.out.println("Enter a word here:");
		String s = in.nextLine();
		System.out.println("Enter a number here:");
		int one = in.nextInt();
		System.out.println("Enter a second number here:");
		int two = in.nextInt();
				
		System.out.println("You entered: " + s);
		System.out.println("You entered: " + one + ", " + two);
		in.close();
		
//		System.out.println();

		int sum = add(one,two);
		
		System.out.println("The sum of "+ one +" and "+ two +" is "+sum);
		
	}
	
	private static int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
}
