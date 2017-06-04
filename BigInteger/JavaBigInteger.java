package BigInteger;
import java.util.*;
import java.math.*;
public class JavaBigInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BigInteger num1 = sc.nextBigInteger();
		BigInteger num2 = sc.nextBigInteger();
		System.out.println(num1.add(num2));
		System.out.println(num1.multiply(num2));
		
		
	}

}
