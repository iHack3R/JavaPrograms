import java.util.*;

public class ArrayL
{
	public static void main(String[] args)
	{
		ArrayList<String> nums = new ArrayList<String>(Arrays.asList("One", "Two", "Three"));
		System.out.println(nums);
		ArrayList<String> num = new ArrayList<String>();
		num.clear();
		num.add("Ek");
		num.add("Do");
		num.add("Teen");
		System.out.println(num);
		num.set(0,"Uno");
		num.set(1,"Dos");
		num.set(2,"Tres");
		System.out.println(num);
	}
}