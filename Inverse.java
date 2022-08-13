public   class sample
{
	public static void main(String[] args) throws IOException
	{
		int num = 12345;
		int arr[]= new int[5];
		for(int p=0; p<num; p++)
		{
			arr[p]=num%10;
			num=num/10;
			System.out.println("The number is" +arr[p]);
		}
	}
}