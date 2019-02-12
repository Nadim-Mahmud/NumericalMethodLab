package rootFindingMethods;

public class SecantMethod {
	
	public double secant() {
		
		double x0 , x1 , x, tolerance = 1e-6,tmp;
		x = 0;
		
		// initial guess kemne dhorte hoy janina
		
		x0 = 0;
		x1 = 1;
		
		while(Math.abs(Equation.equation(x)-0.0)>tolerance) {
			
			tmp = x0*Equation.equation(x1) - x1*Equation.equation(x0);
			x = tmp / (Equation.equation(x1) - Equation.equation(x0));
			
			x0 = x1;
			x1 = x;
		}
		
		return x;
	}
}
