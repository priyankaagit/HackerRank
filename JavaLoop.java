import java.util.*;

public class JavaLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N >= 2 && N <= 20) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(N + "X" + i + "=" + N * i);
			}
		} else
			System.out
					.println("Please enter the number in the range 2<= n <=20");

	}

}
