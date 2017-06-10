package dataStructures;
import java.util.*;
public class JavaSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> subArray = new ArrayList<Integer>();
        int counter = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i =0; i<n; i++){
			arr[i] = sc.nextInt();			
		}
		for(int i=0; i<n;i++){
			int sum = 0;
			for(int j=i; j<n; j++){
				sum = sum + arr[j];
				subArray.add(sum);
			}
		}
		for(int sum: subArray){
			if(sum <0)
				counter++;			
		}
		System.out.println(counter);		
	}

}
