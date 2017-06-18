package exceptionHandling;
import java.util.*;
public class JavaExceptionHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Integer x = Integer.MIN_VALUE;
		Integer y = Integer.MIN_VALUE;
		
		try{
			x = sc.nextInt();
			y = sc.nextInt();
			Integer z = x/y;
			System.out.println(z);
		}catch(Exception e){
			if( x instanceof Integer || y instanceof Integer)
				if(y == 0){
					System.out.println("java.lang.ArithmeticException: / by zero");					
				}
				else{
				System.out.println("java.util.InputMismatchException");
				}
		}
		
		
	}

}
