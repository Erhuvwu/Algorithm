package userEnterInput;

import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
//		Q1.Fibonacci
		Scanner console = new Scanner(System.in);
		System.out.println("********Fibonacci Series*********");
		System.out.println("Enter a number: ");
		int number = console.nextInt();
		
	     
	        
	        int number1 = 0;
	        int number2 =1;
	        int sumOfPreviousTwo = number1 + number2;
	        
	    	System.out.print("Fibonacci Series of "+number+" numbers: ");
	        for(int i =1; i<=number; ++i){
	        
	        	System.out.print(number1 + " ");
	            sumOfPreviousTwo = number1 + number2;
	            number1 = number2;
	            number2 = sumOfPreviousTwo;   
	        }
	        System.out.println();
	        System.out.println("********Armstrong Check*********");
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
	    
	    System.out.println("********Palindrone Check*********");
	    
	    //Q. 3
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scan.nextLine();
		String reverseString = "";
        String originalString = s;
        for(int i = originalString.length () -1; i>=0; i--){
            reverseString += originalString.charAt ( i );

        }
        if(originalString.equals ( reverseString ))
        	System.out.println("The string you entered is a palindrone");
        else
            System.out.println("The string you entered is not a palindrone");
            
     
	}

}
