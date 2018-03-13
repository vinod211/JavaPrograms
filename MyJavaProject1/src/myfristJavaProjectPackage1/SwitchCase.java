package myfristJavaProjectPackage1;

public class SwitchCase {
	int b = 2;

	public static void main(String[] args) {
		int b = 3, v = 5, result;

		int excute = 1;

		switch (excute)
		{
		case 1:
			result = b + v;
			System.out.println(result);

		case 2:
			result = b - v;
			System.out.println(result);
			
		case 3:
			result=b*v;
			System.out.println(result);
			break;
		}
	}
}
