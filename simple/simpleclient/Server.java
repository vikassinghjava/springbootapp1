import java.awt.Frame;
import java.awt.event.*;
import java.net.*;
import java.awt.*;
import java.io.*;
public class Server extends Frame implements ActionListener,Runnable  {
ServerSocket s;
Socket s1;
List l;
TextField t;
Button b1,b2;
BufferedReader br;
BufferedWriter bw;
public Server(String m)
{
 super(m);
 setSize(300,300);
 setLocation(0,0);
 this.setLayout(null);
 l=new List();
 l.setBounds(50,50,170,170);
 add(l);
 t=new TextField();
 t.setBounds(50,230,40,30);
 add(t);
 b1=new Button("send");
 b1.setBounds(155,230,40,30);
 add(b1);
 b2=new Button("exit");
 b2.setBounds(200,230,40,30);
 add(b2);
 setBackground(Color.YELLOW);
 b1.addActionListener(this);
 b2.addActionListener(this);
 setVisible(true);
 {
	 try
	 {
		 s=new ServerSocket(100);
		 s1=s.accept();
		 br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
		bw= new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
		bw.write("Hello");
		bw.newLine();
		bw.flush();
		Thread th;
		th=new Thread(this);
		th.start();
	 }catch(Exception e){}
 }
}
 public void actionPerformed(ActionEvent e)
 {
	 if(e.getSource().equals(b2))
		 System.exit(0);
	 else{
		 try
		 {
			 bw.write(t.getText());
			 bw.newLine();
			 bw.flush();
			 t.setText("");
		 }catch(Exception m){}
	 }
 }
 public void run()
 {
	 try
	 {
		 s1.setSoTimeout(1);
	 }
 catch(Exception e)
 {}
 while(true)
 {
	try {
		l.addItem(br.readLine());
	}
	catch(Exception h){}
		 
 }
 }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Server("server progam");
	}

}
