package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bisection Methods Result : " + new BisectionMethod().bisection());
		
		System.out.println("FalsePostion Methods Result :" + new FalsePostionMethod().falsePostion());

		System.out.println("NewtonRaphson Methods Result :" + new NewtonRaphsonMethod().newton()); 
	}

}
