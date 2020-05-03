package ArrayListDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\ara\\Test.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Selenium with Java");
		bw.write("Java with Selenium");
		System.out.println("Finished.....");
		bw.close();
		

	}

}
