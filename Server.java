import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket serverSock = new ServerSocket(4242);
			while(true)
			{
				Socket s = serverSock.accept();
				PrintWriter writer = new PrintWriter(s.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	private String getAdvice()
	{
		int random = (int) (Math.random()*adviceList.length);
		return adviceList[random];
	}
}