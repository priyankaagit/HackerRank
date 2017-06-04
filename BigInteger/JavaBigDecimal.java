package BigInteger;
import java.util.*;
import java.math.*;
public class JavaBigDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	      	sc.close();
	      	
	      	//Arrays.sort(s);
	      	Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
	      	    @Override
	      	    public int compare(String a1, String a2) {
	      	    	BigDecimal a = null;
	      	    	BigDecimal b = null;
	      	    	int val = 0;
	      	        if(a1!=null && a2 != null){
	      	        a = new BigDecimal(a1);
	      	        b = new BigDecimal(a2);
	      	        val = a.compareTo(b);
	      	        }
	      	        return val;
	      	    }
	      	}));
	      	
	      	
	      	for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	}

}
