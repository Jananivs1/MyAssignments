package week1.assignments;

public class FindEvenNumbers {
	public static void main(String[] args) {
		int maxRange = 10;
		for (int i = 1; i <=maxRange; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}
}
