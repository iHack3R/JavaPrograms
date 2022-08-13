import java.util.*;

public class Order
{
	public static void main(String[] args)
	{
		ArrayList<String> nams = new ArrayList<String>();
		nams.add("Udit");
		nams.add("Rahul");
		nams.add("Sachin");
		String[] names = {"Zoe", "Alison", "David"};
		double[] lengths = {120.0, 0.5, 0.0, 999.0, 77.3};
		Collections.sort(nams);
		System.out.println(nams);
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		Arrays.sort(lengths);
        	System.out.println(Arrays.toString(lengths));
	}
}