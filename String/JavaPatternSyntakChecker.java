package String;
import java.util.*;
import java.util.regex.*;

public class JavaPatternSyntakChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String pattern = in.nextLine();
	         testCases--;
	         try{
	        	 Pattern p = Pattern.compile(pattern); 
	        	 System.out.println("Valid");
	         }catch(PatternSyntaxException e) {
	        	 System.out.println("Invalid"); 
	         }	       	             
	      }       
	}
}
