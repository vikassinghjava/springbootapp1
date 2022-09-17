import java.net.*;

public class UDPserver 
{
	public static void main(String[] args) throws Exception
	{
DatagramSocket ds=new DatagramSocket();
		
String str="india is good country with corrupted leaders and sadhu baba";
		
byte b[]=str.getBytes(); 
DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getLocalHost(),5000);
		
		
		ds.send(dp);
	}

}
