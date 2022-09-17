import java.io.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Server2 
{
	public static void main(String[] args) throws Exception
	{
	
	ServerSocket ss=new ServerSocket(888);
	 Socket s=ss.accept();
	PrintStream p=new PrintStream(s.getOutputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String str,str2;
			while((str=br.readLine())!=null)// read from client ...
			{
				System.out.println(str);
				str2=kb.readLine();
				p.println(str2);// send to the client
			}
		}
	}

}
