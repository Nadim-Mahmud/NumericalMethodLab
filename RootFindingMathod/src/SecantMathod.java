
public class SecantMathod {
   
	public double tolarance = 0.00001;
	
	Equation eq = new Equation();
	RandomNumber rn = new  RandomNumber(); 
	
	
	public double secant() {
		
		double x1 = 2;//rn.positivRnd();
		double x2 = 3;//rn.negetiveRnd();
		double x3,x4,x0,dv;
		int cn = 0;
		
		//System.out.println(x1 + " " + x2);
		
		while(Math.abs(x2-x1)>tolarance) {
			
			dv = (eq.equation(x2)-eq.equation(x1))/(x2-x1);
	
			x0 = x2 - eq.equation(x2)/Math.abs(dv);
			
			x1 = x2;
			x2 = x0;
			cn++;
			//System.out.println(x1 + " " + x2);
		}
		System.out.println(cn);
		
		return x2;
	}
   
} 