package Assignment1.Program20;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime_Number {
    public static boolean isPrime(int n) {
        if(n<=1)
            return false;
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
    	ArrayList<Integer> num = new ArrayList<>();
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number: ");
    	while(true) {
    		int n = sc.nextInt();
    		if(isPrime(n)) {
    			num.add(n);
    			System.out.println(num);
    		}
    		else {
    			System.out.println("Square root of non prime number is: "+Math.sqrt(n));
    			System.exit(0);
    		}
    	}
    }
}
