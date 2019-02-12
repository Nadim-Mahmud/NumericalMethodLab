package interpolationMethods;

public class Main {

	public static void main(String[] args) {
		
		NewtonsForwordInterpolation newton = new NewtonsForwordInterpolation();
		
		System.out.println("Newtons forword difference interpolation : " + newton.calculate());
	}

}
