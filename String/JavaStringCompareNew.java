package String;
import java.util.*;
public class JavaStringCompareNew {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         String S = sc.next();
         int k = sc.nextInt();
         ArrayList<String> subString = new ArrayList<String>();
         for (int i = 0; i< (S.length()- k)+1 ;i++){
        	subString.add(S.substring(i,i+k));        	
         }
         Collections.sort(subString);        
         System.out.println(subString.get(0));
         System.out.println(subString.get(subString.size()-1));
	}

}
