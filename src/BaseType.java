
public class BaseType {
	private static String str = "123";
	private static Double mDouble;
	private int[]  array = new int[100];
	public static void main(String[] args) {
		double mDouble = getDouble(str);
		System.out.println(getDouble(str));
	}

	
	public static Double getDouble(String str){
		return Double.parseDouble(str);
	}
}

