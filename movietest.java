class movie
{
String title;
String genre;
double rating;
void playmovie()
	{
	System.out.println("Now Playing");
	}
}
class movietest
{
public static void main (String[] args)
	{
	movie one=new movie();
	one.title="Terminator";
	one.genre="Action";
	one.rating=9.5;
	movie two=new movie();
	two.title="Avatar";
	two.genre="Adventure";
	two.rating=9.0;
	two.playmovie();
	}
}