package dataStructures;
import java.util.*;
public class JavaMap {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> directory = new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
	    in.nextLine();
	    
	    for(int i=0;i<n;i++)
	    {
	       String name=in.nextLine();
	       int phone=in.nextInt();
	       directory.put(name,phone);
	       in.nextLine();
	       
	    }
	    while(in.hasNext())
	    {
	       String s=in.nextLine();	       
	       if(directory.get(s)!=null){
	    	   int qNum = directory.get(s);
	    	   System.out.println(s+"="+qNum);
	       }
	       else
	    	   System.out.println("Not found");
	    }
	    

	}

}
