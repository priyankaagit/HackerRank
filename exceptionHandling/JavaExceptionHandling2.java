package exceptionHandling;
import java.util.*;

class MyCalculator{
	String power(int n, int p){
		int result = 0;
		if( n<0 || p< 0)	
			return "java.lang.Exception: n and p should be non-negative";
		else{
			result = (int)Math.pow(n, p);
			return Integer.toString(result);
		}
							  				
	}
}

public class JavaExceptionHandling2 {

	public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
		   while ( in .hasNextInt()) {
			   int n = in .nextInt();
			   int p = in .nextInt();
			   MyCalculator my_calculator = new MyCalculator();
			   try {
			    System.out.println(my_calculator.power(n, p));
			   } catch (Exception e) {
			    System.out.println(e);
			   }
			  }
		
	}

}
