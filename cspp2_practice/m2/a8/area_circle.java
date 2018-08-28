public class area_circle {
	static double pi()
	{
		double pi = 3.14;
		return pi;
	}
	static double Area(int r)
	{
		double area = pi() * r * r;
		return area; 
	}
	public static void main(String[] args) {
		double temp = Area(8);
		System.out.println(temp);
	}
}