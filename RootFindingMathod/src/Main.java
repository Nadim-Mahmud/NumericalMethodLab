

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Bisection BS = new Bisection();
        IterationMathod it = new IterationMathod();
       // double ans = ;
        
        System.out.println("Root : " + BS.bisection());
        System.out.println("Number of iteration : " + BS.getIteration());
        
        System.out.println("\n\nIteration Mathod-->");
        System.out.println("Root : " + it.iteration());
    }
}
