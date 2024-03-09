package week1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num=10;
		int a =0;
		int b = 1; 
		for (int i = 1; i <=num; i++) {
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
		}
	}

}
