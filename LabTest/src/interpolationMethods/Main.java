package interpolationMethods;

public class Main {

	public static void main(String[] args) {
		//To get ans make comment any one of them here i am using lagrange
		
		//NewtonsForwordInterpolation newton = new NewtonsForwordInterpolation();
		//System.out.println("Newtons forword difference interpolation : " + newton.calculate());
		
		System.out.println("Lagrange Interpoaltion : "+ new LagrangeInt().calculate());
	}

}
