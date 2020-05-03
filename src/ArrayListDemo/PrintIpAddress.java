package ArrayListDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintIpAddress {

	public static void main(String[] args) throws IOException {
		
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("Local host IP Address is "+ip);
	}

}
