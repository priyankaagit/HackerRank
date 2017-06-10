package dataStructures;
import java.util.*;
public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,ArrayList<Integer>> line = new HashMap<Integer,ArrayList<Integer>>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			int d = sc.nextInt();
			ArrayList<Integer> count = new ArrayList<Integer>();
			for(int j=1;j<=d;j++){
				count.add(sc.nextInt());			
			}
			line.put(i,count);
		}
		int q = sc.nextInt();
		int[][] arr = new int[q][2];
		for(int i=0;i<q;i++){
			for(int j=0;j<2;j++){
				arr[i][j] = sc.nextInt();
			}
		}				
		for(int i=0;i<q;i++){			
			ArrayList<Integer> query = line.get(arr[i][0]);
			int y = arr[i][1];
			if(query!=null && y<=query.size()){
				int x = query.get(y-1);			
				System.out.println(x);
			}
			else
				System.out.println("ERROR!");						
		}
	}
}
