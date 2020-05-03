package ArrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		//ArrayList with generic
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("MdHossain");
		obj1.add("Araf");
		obj1.add("Ara");
		obj1.add("Ani");
		
		for(String vari: obj1) {//its inhence for loop
			System.out.println(vari);
		}
		
	}

}
