import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintIpAddress {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println(ip);

	}

}
