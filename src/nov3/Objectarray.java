package nov3;

public class Objectarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object x[] = new Object[5];
		x[0] = "Hello";
		x[1] = 100;
		x[2] = 987.98;
		x[3] = true;
		x[4] = 'r';
		for(Object each : x) {
			System.out.println(each);
		}
	}

}
