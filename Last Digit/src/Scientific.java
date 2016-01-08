public class Scientific 
{
	public static void main(String[] args)
	{
		double x = 1.9;
		double y = -2;
		scientific(x, y);
	}
	public static void scientific(double base, double exp)
	{
		double value = base * (Math.pow(10, exp));
		System.out.println(value);
	}
}
