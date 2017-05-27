package String;
import java.util.*;
public class JavaStringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String R = new StringBuilder(A).reverse().toString();
		int c = 0;
		for(int i=0;i<A.length()/2;i++){			
			if (A.charAt(i) == A.charAt(A.length()-1-i)){
				c = c + 1;				
			}			
		}		
	     System.out.println((c == A.length()/2)?"Yes" : "No");
	     System.out.println(A.equals(R)? "Yes" : "No");
			
	}

}
