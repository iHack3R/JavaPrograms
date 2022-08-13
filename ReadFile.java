import java.io.*;

public class ReadFile
{
	public static void main(String[] args)
	{

		try
		{
			File myFile = new File("MyText.txt");
			FileReader fileRead = new FileReader(myFile);
			BufferedReader read = new BufferedReader(fileRead);

			String line = null;

			while((line=read.readLine())!=null)
			{
				System.out.println(line);
			}
			read.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}