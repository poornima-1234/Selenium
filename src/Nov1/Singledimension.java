package Nov1;

public class Singledimension {
	public static void main(String[] args) {
		int x[]=new int [6];
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x[3] = 400;
		x[4] = 500;
		x[5] = 600;
		System.out.println(x.length);
		System.out.println(x[5]);
		for(int each:x) {
			System.out.println(each);
		}

	}

}
