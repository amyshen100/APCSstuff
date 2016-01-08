
public class Powers 
{
	public static void main(String[] args)
	{
		int x = 4;
		int y = 3;
		int a = 5;
		int b = 6;
		int c = -2;
		int d = 8;
		printPowersof2(x, y);
		printPowersof2(a, b);
		printPowersof2(c, d);
	}
	public static void printPowersof2(int base, int power)
	{
		int value = 1;
		for (int i = 0; i<= power; i++)
		{
			System.out.print(value + " ");
			value = base * value;
		}
		System.out.println();
	}

}
