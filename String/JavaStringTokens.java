package String;
import java.util.*;
public class JavaStringTokens {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		if(!scan.hasNext()) {
            System.out.println(0);
            return;
        }
        String s = scan.nextLine();   
        scan.close();
        s.trim();
        if (s.length()>400000){
            return ;
        }else if (s.length()==0){
            System.out.println(0);
            return ;
        }else{

	        System.out.println("String lenght " + s.length());
	        for(int i = 0; i<s.length();i++){
	        	int ascii = (int)s.charAt(i);        	
	        	if(!((ascii >=65 && ascii <= 90) || (ascii >=97 && ascii <=122))){        		
	        		char t = s.charAt(i);
	        		s = s.replace(t,' ');        		      		
	        	}                        	        
	        }        
	        String[] token = s.split(" +");        
	        ArrayList<String> newToken = new ArrayList<String>();      
	        for(int i=0; i<token.length;i++){
	        	if(!(token[i].isEmpty())){
	        		newToken.add(token[i]);       		         		      		
	        	}        	
	        }
	        System.out.println(newToken.size()); 
	        for(String t: newToken){
	        	System.out.println(t);
	        }
		}
     }		
}
