class drumkit
{
boolean topHat=true;
boolean snare=true;
void playsnare()
	{
	System.out.println("bang bang ba-boog");
	}
void playtophat()
	{
	System.out.println("ding ding da-ding");
	}
}
class drumkittestdrive
{
public static void main(String[] args)
	{
	drumkit d=new drumkit();
	d.playsnare();
	d.snare=false;
	if(d.snare==true)
		{
		d.playsnare();
		}
	d.playtophat();
	}
}