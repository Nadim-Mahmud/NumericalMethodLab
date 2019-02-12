package rootFindingMethods;

public class BisectionMethod {
	
	public double bisection() {
		
		double low ,high,mid,tolerance;
		tolerance = 1E-6;
		
		//positive random
		high = Math.random()*10000000.0;
		while(Equation.equation(high)<0) {
			high = Math.random()*10000000.0;
		}
		
		//negetive random
		low = Math.random()*10000000.0;
		while(Equation.equation(low)>0) {
			low = Math.random()*10000000.0;
		}
		
		mid =  0;
		
		while(Math.abs(Equation.equation(mid)- 0.0)>tolerance) {
			
			mid = (low + high)/2.0;
			//System.out.println(high +" " + low);
			if(Equation.equation(mid)<0.0) low = mid;
			else high = mid;
		}
		
		//System.out.println(Equation.equation(high) + " " + Equation.equation(low));
		
		return mid;
	}
}
