
public class TriangleArea {
	public static void main(String[] args)
	{
		double x = 8;
		double y = 5.2;
		double z = 7.1;
		triangleArea(x, y, z);
	}
	public static void triangleArea(double first, double second, double third)
	{
		double s = (first + second + third) / 2.0;
		double area = Math.sqrt(s * (s - first) * (s - second) * (s - third));
		System.out.println(area);
	}
}
