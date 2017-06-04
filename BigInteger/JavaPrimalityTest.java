package BigInteger;
import java.util.*;
import java.math.*;
public class JavaPrimalityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		sc.close();
		boolean isPrime = n.isProbablePrime(1);
		if(isPrime){
			System.out.println("prime");
		}	
		else{
			System.out.println("not prime");
		}					
	}
}
