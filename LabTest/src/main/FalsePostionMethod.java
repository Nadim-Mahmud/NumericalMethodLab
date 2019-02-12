package main;

public class FalsePostionMethod {
	
	public double falsePostion() {
		
		double a,b,x,tolerance,tmp;
		
		tolerance = 1E-6;
		
		//positive random
		b = Math.random()*100.0;
		while(Equation.equation(b)<0) {
			b = Math.random()*100.0;
		}
		
		//negetive random
		a = Math.random()*100.0;
		while(Equation.equation(a)>0) {
			a = Math.random()*100.0;
		}
		x  = 0.0 ;
		//System.out.println(Equation.equation(a));
		
		while(Math.abs(Equation.equation(x)- 0.0)>tolerance) {
			
			tmp = a*Equation.equation(b) - b*Equation.equation(a);
			x = tmp / (Equation.equation(b) - Equation.equation(a));
			
			//System.out.println(x);
			
			if(Equation.equation(x)<0.0) a = x;
			else b = x;
			
			//break;
		}
		
		//System.out.println(Equation.equation(high) + " " + Equation.equation(low));
		
		return x;
	}
}
