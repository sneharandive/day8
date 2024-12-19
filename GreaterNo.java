package day8;

public class GreaterNo {

	public static int Greater (int num1, int num2) {
		if(num1> num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static void main(String[] args) {
		System.out.print("Greater number is "+Greater(20,29));
	}
}
