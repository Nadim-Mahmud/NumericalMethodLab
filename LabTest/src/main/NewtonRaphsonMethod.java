package main;

public class NewtonRaphsonMethod {
	
	public double newton() {
		
		double x,tmp,tolerance = 1e-6;
		
		x = Math.random()*10.0;
		
		while(Math.abs(Equation.equation(x)-0.0)>tolerance) {
			
			tmp  = x - Equation.equation(x)/Equation.dfeq(x);
			
			x = tmp;
		}
		
		return x;
	}
}
