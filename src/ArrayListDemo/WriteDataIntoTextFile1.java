package ArrayListDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\ara\\Test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("12345");
		System.out.println("Finished..");
		bw.close();
		
	}

}
