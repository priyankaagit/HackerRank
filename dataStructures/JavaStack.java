package dataStructures;
import java.util.*;
public class JavaStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Scanner sc = new Scanner(System.in);
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	            //Complete the code
	         Stack<Character> balanced = new Stack<Character>();
	         for(int i=0;i<input.length();i++){
	        	 Character newInput = input.charAt(i);	        	 
	        	 if(balanced.empty()){	        		 
		        	 balanced.push(newInput);		        	 
		         }
		         else{
		        	 Character peek = balanced.peek();
		        	 if( (peek == '{' && input.charAt(i) == '}')|| 
		        		 (peek == '(' && input.charAt(i) == ')') || 
		        		 (peek =='[' && input.charAt(i) == ']')){
		        		
		        		 balanced.pop();
		        	 }
		        	 else{
		        		 balanced.push(input.charAt(i));		        		 
		        	 }
		         }	        	 
	         }
	         if(balanced.empty()){
		    	  System.out.println("true");
		      }
		      else{
		    	  System.out.println("false");
		      }
	      }
	      sc.close();	      
	      
	}

}
