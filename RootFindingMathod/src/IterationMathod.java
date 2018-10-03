import java.util.Scanner;

public class IterationMathod {
	
	public int i,j,k,l;
	public static int cn;
	public double st,in,tmp,tolerance = .0001;
	
	Equation eq = new Equation();
	
	public double iteration() {
		
		System.out.println("\nEnter Initial guess : ");
		Scanner sc = new Scanner(System.in);
		
		in = sc.nextDouble();
		sc.close();
		
		tmp = 100.0;
		cn = 0;
		
		while(tmp>tolerance) {
		
			st = eq.eqIteration(in);
			//System.out.println(st);
			tmp = Math.abs((in-st));
			in = st;
			cn++;
		}
		return st;
	}
}
