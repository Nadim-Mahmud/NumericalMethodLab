package rootFindingMethods;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Root Finding Methods : \n");
		System.out.println("Bisection Methods Result : " + new BisectionMethod().bisection());
		System.out.println("False Postion Methods Result :" + new FalsePostionMethod().falsePostion());
		System.out.println("Newton Raphson Methods Result :" + new NewtonRaphsonMethod().newton()); 
		System.out.println("Secant Methods Result :" + new SecantMethod().secant());
	
		System.out.println("\n\nInterpoaltion Methods : \n");
		
		
	}

}
