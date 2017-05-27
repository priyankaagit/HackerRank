package String;
import java.util.*;
public class JavaAnagrams {
	
	 static boolean isAnagram(String a, String b) {
		 HashMap<Character,Integer> map1 = new HashMap<Character, Integer>();
		 HashMap<Character,Integer> map2 = new HashMap<Character, Integer>();
		 a = a.toLowerCase();
		 b = b.toLowerCase();
		 for(int i = 0; i<a.length();i++){
			 map1.put(a.charAt(i),(map1.containsKey(a.charAt(i)))? map1.get(a.charAt(i))+1: 1);
		 }		 
		 for(int i = 0; i<b.length();i++){
			 map2.put(b.charAt(i),(map2.containsKey(b.charAt(i)))? map2.get(b.charAt(i))+1: 1);
		 }
		 if (map1.equals(map2))
			 return true;		      
		 else 
			 return false;
	 }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
