class me
{
	private int sis;
	public static void main(String[] args)
	{
		me c = new me();
		c.setValue(30);
		int x = c.getValue();
		c.test(x);
	}
	public void setValue(int s)
	{
		sis=s;
	}
	public int getValue()
	{
		return sis;
	}
	public void test(int x)
	{
		System.out.println("The value is " +x);
	}
}