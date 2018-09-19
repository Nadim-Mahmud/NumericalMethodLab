

public class Bisection {
	
	Equation eq = new Equation();
	
	public int cn ;
	
	public int getIteration() {
		return cn ;
	}

    public double bisection() {
   
        double mid=0,a,b,tollerence = 0.0001;
        
        RandomNumber rn = new RandomNumber();
        
        a = rn.positivRnd();
        b = rn.negetiveRnd();
        cn = 0;
       
         while(true) {

        	 cn ++;
             mid = (a+b)/2.0;
                 
             System.out.println("upper : "+a+" Lower : "+ b + " Mid : "+mid+" Tolerence : "+Math.abs(a-b));
                 
             if(Math.abs(eq.equation(mid)-0.0)<=tollerence) break;
             if(eq.equation(mid)<0) b = mid;
             else a = mid;
         }
         return mid;
    }

}
