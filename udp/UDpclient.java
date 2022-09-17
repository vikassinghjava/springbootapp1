import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDpclient      
{
	public static void main(String[] args) throws Exception 
	{
            DatagramSocket ds=new DatagramSocket(5000);
             byte b[]=new byte[1024];
       DatagramPacket dp=new DatagramPacket(b,b.length);
       
       ds.receive(dp);
        String r=new String(dp.getData());
	System.out.println(r.trim());
	}

}
