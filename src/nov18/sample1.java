package nov18;

public class sample1 {
	//static global variables
	static int a,b,c;
	static double x,y,z;

	public static void addition()
	{
		a=98765;
		b=98;
		c=a+b;
		System.out.println(c);
	}
	public static void division()
	{
		x=878789;
		y=87;
		z=x/y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		//calling static method with class name
		sample1.division();
		sample1.addition();
	}

}



