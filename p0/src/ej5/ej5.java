package ej5;

public class ej5 {
	public static int factorial(int fact) {
		if (fact>1)
		fact=fact*factorial(fact-1);
		else
			fact=1;
		
		return fact;
	}
	public static void main(String[] args) {
		int fact=4;
		System.out.println(factorial(fact));
	}

}
