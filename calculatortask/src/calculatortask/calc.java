package calculatortask;

public class calc {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subtraction(int a, int b) {
		return b - a;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		return b / a;
	}

	public static void main(String[] args) {
		System.out.println(addition(5, 10));
		System.out.println(subtraction(5, 10));
		System.out.println(multiplication(5, 10));
		System.out.println(division(5, 10));
	}

}
