
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client 
{
	public static void main(String[] args) throws Exception 
	{
			Socket s=new Socket("localhost",8888);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			s.close();
			br.close();
	}
}
