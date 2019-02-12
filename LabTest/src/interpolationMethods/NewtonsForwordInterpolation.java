package interpolationMethods;

import java.io.File;
import java.util.Scanner;

public class NewtonsForwordInterpolation {
	
	public double [][] table = new double[50][50];
	public double [] xv = new double [50];
	public int points;
	public double targetx;
	public String str;
	
	//taking input by constructor
	public NewtonsForwordInterpolation(){
		
		Scanner sc = new Scanner(System.in);
		points = sc.nextInt();
		
		str = sc.next();
		targetx = Double.parseDouble(str);
		
		for(int i=0; i<points; i++) {
			str = sc.next();
			xv[i] = Double.parseDouble(str);
			str = sc.next();
			table[i][0] = Double.parseDouble(str);
		}
		
		sc.close();
		
		///calculating forword differnce table
		
		for(int i=1; i<points; i++) {
			for(int j=0; j<points-i; j++) {
				table[j][i] = table[j+1][i-1] - table[j][i-1];
			}
		}
		
		// showing the table
		System.out.println("Printing Table : ");
		
		for(int i=0; i<points; i++) {
			for(int j=0; j<points-i; j++) {
				
				System.out.print(table[i][j] + "  ");
			}
			System.out.println("");
		}
	}
	
	public double fact(double n) {
		if(n==0||n==1) return 1;
		return fact(n-1.0)*n;
	}
	
	public double calculate() {
		
		double tmp,sum,u,h;
		
		h = xv[1]  - xv[0];
		u = (targetx - xv[0])/h;
		sum = 0;
		tmp = 1;
		
		for(int i=0; i<points; i++) {
			
			sum += (tmp*table[0][i])/fact(i);
			tmp = tmp*(u-i);
		}
		return sum;
	}

}
