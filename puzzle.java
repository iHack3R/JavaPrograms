public class puzzle
{
public static void main(String[] args)
	{
	puzzled[]obs=new puzzled[6];
	int y=1;
	int x=0;
	int result=0;
	while(x<6)
		{
		obs[x]=new puzzled();
		obs[x].ivar=y;
		y=y*10;
		x=x+1;
		}
	x=6;
	while(x>0)
		{
		x=x-1;
		result=result + obs[x].doStuff(x);
		}
	System.out.println("result "+result);
	}
}
class puzzled
{
int ivar;
public int doStuff(int factor)
	{
	if(ivar>100)
		{
		return ivar*factor;
		}
	else
		{
		return ivar*(5-factor);
		}
	}
}