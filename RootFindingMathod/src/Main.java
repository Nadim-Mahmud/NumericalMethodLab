
public class Main {

    public static void main(String[] args) {
        
        Bisection BS = new Bisection();
       // IterationMathod it = new IterationMathod();
        SecantMathod sc = new SecantMathod();
       // NewtonRapson nr = new NewtonRapson();
        
        System.out.println("Root : " + BS.bisection());
        System.out.println("Number of iteration : " + BS.getIteration());
        
        System.out.println("\n\nIteration Mathod-->");
       // System.out.println("Root : " + it.iteration());
        
        System.out.println("\n\nSecant Mathod-->");
        System.out.println("Root : " + sc.secant());
        
        System.out.println("\n\nNewtonRapson Mathod-->");
       // System.out.println("Root : " + nr.newton());
    }
}
