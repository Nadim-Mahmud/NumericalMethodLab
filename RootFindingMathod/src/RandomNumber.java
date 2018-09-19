

public class RandomNumber {
	
	Equation eq = new Equation();
	
    public double positivRnd() {
        double rn;
        
        while(true) {
        	
           rn = Math.random()*10000000000.0;
           
           if(eq.equation(rn)>0) return rn;
           if(eq.equation(-rn)>0) return -rn;
        }
    }
    
    public double negetiveRnd() {
        double rn;
        
        while(true) {
        	
           rn = Math.random()*100000000.0;
           if(eq.equation(rn)<0.0) return rn;
           if(eq.equation(-rn)<0.0) return -rn;
        }
    }
}
