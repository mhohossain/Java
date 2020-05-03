package OopsConceptQuestion;

import java.util.Arrays;

public class SortEle {
     //0000,1111,222,
	public static void main(String[] args) {
		String x []= new String []{"0","1","0","1","0","1","0","2","2","2"};
		Arrays.sort(x);
		for(String i: x) {
			System.out.println(i);
		}
		

	}

}
