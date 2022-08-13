import java.io.*;

public class Box implements Serializable
{
	private int width;
	private int height;
	
	public void setWidth(int w)
	{
		width=w;
	}
	public void setHeight(int h)
	{
		height=h;
	}
	public static void main(String[] args)
	{
		Box myBox = new Box();
		myBox.setWidth(50);
		myBox.setHeight(25);

		try
		{
			File myFile = new File("SaveData.sav");
			FileOutputStream fos = new FileOutputStream(myFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(myBox);
			oos.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}