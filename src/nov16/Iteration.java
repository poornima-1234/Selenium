package nov16;

import java.util.ArrayList;
import java.util.Iterator;


public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//store car collection into arraylist
		ArrayList<String>cars = new ArrayList<String>();
		cars.add("Tata");
		cars.add("Mahindra");
		cars.add("Volvo");
		cars.add("Maruti");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Huundai");
		cars.add("jeep");
		System.out.println(cars.size());
		Iterator<String>x=cars.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}

	}

}
