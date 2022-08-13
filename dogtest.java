class dog
{
private int size;
public int getSize()
	{
	return size;
	}
public void setSize(int s)
	{
	size=s;
	}
void bark()
	{
	if(size>50)
		{
		System.out.println("Ruff Ruff");
		}
	else
		{
		System.out.println("Meow Meow");
		}
	}
}
class dogtest
{
public static void main(String[] args)
	{
	dog x=new dog();
	x.setSize(60);
	x.bark();
	}
}