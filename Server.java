

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
	public static void main(String[] args) throws Exception 
	{
				ServerSocket ss=new ServerSocket(8888);
				Socket s=ss.accept();
				PrintStream out=new PrintStream(s.getOutputStream());
				out.println("Hello from server side!!");
				ss.close();
				s.close();
				out.close();
	}
}
