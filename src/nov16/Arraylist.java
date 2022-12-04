package nov16;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//store string type data into arraylist class
		ArrayList<String>str= new ArrayList<String>();
		str.add("monday");
		str.add("tuesday");
		str.add("wednesday");
		str.add("thursday");
		str.add("friday");
		str.add("saturday");
		str.add("sunday");
		//print collection size
		System.out.println(str.size());
		//print specific position from list
		System.out.println(str.get(4));
		for(int i=0; i<str.size(); i++)
		{
			System.out.println(str.get(i));

		}
	}

}

