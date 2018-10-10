
public class NewtonRapson {
	
	public double tolarance = 0.00001;
	
	Equation eq = new Equation();
	
	public double newton() {
		
		double x1=0,x2,x0,x=10000;
		int cn = 0;
		
		do{
	
			x = x1;
			x1 = x - eq.equation(x)/eq.derivedFunc(x);
			
			cn++;
			
		}
		while(Math.abs(x1-x)>tolarance);
		
		System.out.println("Number of Iterations : " + cn);
		
		return x;
	}

}
