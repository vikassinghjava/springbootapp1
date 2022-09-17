 import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;
public class Client2 
{

	public static void main(String[] args) throws Exception
	{
		
		Socket s=new Socket("localhost",888);
		DataOutputStream data=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
		String str,str1;
		while(!(str=kb.readLine()).equals("exit"))
		{
			data.writeBytes(str+"\n"); 
			str1=br.readLine();
			System.out.println(str1);
		}
		br.close();
		kb.close();
		data.close();
	}

}
