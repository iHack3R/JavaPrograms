class xcopy
{
public static void main(String[] args)
	{
	int mcr=50;
	xcopy x=new xcopy();
	int y=x.go(mcr);
	System.out.println(mcr+" "+y);
	}
int go(int lcm)
	{
	lcm=lcm/2;
	return lcm;
	}
}