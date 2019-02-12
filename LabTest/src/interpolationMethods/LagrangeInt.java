package interpolationMethods;

import java.util.Scanner;

public class LagrangeInt {
	
	public double [] xv = new double [1000];
	public double [] yv = new double [1000];
	public int points;
	public double targetx;
	public String str;
	
	public LagrangeInt() {
		
		Scanner sc = new Scanner(System.in);
		points = sc.nextInt();
		
		str = sc.next();
		targetx = Double.parseDouble(str);
		
		for(int i=0; i<points; i++) {
			str = sc.next();
			xv[i] = Double.parseDouble(str);
			str = sc.next();
			yv[i] = Double.parseDouble(str);
		}
		
		sc.close();
	}
	
	public double calculate() {
		
		double tmp,sum=0;
		
		for(int i=0; i<points ; i++) {
			
			tmp = yv[i];
			for(int j=0; j<points; j++) {
				
				if(i!=j) {
					tmp = tmp*(targetx - xv[j])/(xv[i] - xv[j]);
				}
			}
			sum += tmp;
		}
		return sum;
	}
}

