package userEnterInput;

import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
		// Q. 2 Armstrong num is when the sum of its cubes is equal to the num itself
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int sum=0;
	    int remainder;
	    int temp=num;
	    while(num>0){
	    	remainder = num % 10;
	    	num = num / 10;
	        sum = sum + (remainder * remainder * remainder);
	        }
	    if (temp==sum){
	    	System.out.println("The number you entered is an armstrong");
	        }else
	        System.out.println("The number you entered is not an armstrong");
	    
	    //Q. 3
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scan.nextLine();
		int n = s.length();
	    for( int i = 0; i < n/2; i++ )
	        if (s.charAt(i) != s.charAt(n-i-1)) {
	        	System.out.println("The string you entered is not a palindrone");
	        
	        }else
		        System.out.println("The string you entered is a palindrone");
	}

}
