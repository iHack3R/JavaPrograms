class ReverseOrder
{
	public static void main(String[] args)
	{
		int num = 12345;
		String numAsString = new Integer(num).toString();
		for(int i=numAsString.length(); i>0; --i)
		{
			System.out.print(numAsString.charAt(i-1));
		}
	}
}