package dataStructures;
import java.util.*;
public class JavaList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		for(int i = 0;i<n;i++){
			list.add(scan.nextInt());
		}
        int q = scan.nextInt();
        for (int i = 0;i<q;i++){
        	String query = scan.next();
        	if(query.equals("Insert")){
        		int x = scan.nextInt();
        		int y = scan.nextInt();
        		list.add(x,y);
        	}
        	else if(query.equals("Delete")){
        		list.remove(scan.nextInt());
        	}
        }
        scan.close();
        
        for(int m: list){
        	System.out.print(m+ " ");
        }

	}

}
