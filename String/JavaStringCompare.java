package String;
import java.util.*;
public class JavaStringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String ans;			
		if(A.compareTo(B) >0)
			ans = "Yes";
		else
			ans = "No";		
		A = A.substring(0,1).toUpperCase() + A.substring(1);
		B = B.substring(0,1).toUpperCase() + B.substring(1);
		System.out.println(A.length()+B.length());
		System.out.println(ans);
		System.out.println(A + " " + B);
		
		
		

	}

}
/*	ArrayList<String> sortS = new ArrayList<String>();
sortS.add(A);
sortS.add(B);
Collections.sort(sortS);
if (sortS.indexOf(A)>sortS.indexOf(B))
	ans = "Yes";
else 
	ans = "No";
*/