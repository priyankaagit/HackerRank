package dataStructures;
import java.util.*;
public class Java1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i<n; i++){
			int val = sc.nextInt();
			a[i] = val;
		}
		sc.close();
		for(int i = 0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
