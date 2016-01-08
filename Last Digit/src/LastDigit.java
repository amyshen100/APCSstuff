public class LastDigit {
	public static void main(String[] args)
	{
		int x = -295;
		lastDigit(x);
	}
	public static void lastDigit(int value)
	{
		value = Math.abs(value);
		int secondValue = value / 10;
		int finalValue = value - (secondValue * 10);
		System.out.println(finalValue);
	}

}
