package dataStructures;
import java.util.*;
public class JavaBitSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		BitSet B1 = new BitSet(n);
		BitSet B2 = new BitSet(n);
		for(int i = 0;i<n; i++){
			B1.set(i,false);
			B2.set(i,false);
		}
		for(int i = 0;i < m;i++){
			String operation = sc.next();
			int one = sc.nextInt();
			int two = sc.nextInt();
			if(operation.equals("AND")){
				if(one == 1){
					B2.and(B1);
				}else if (one == 2){
					B1.and(B2);
				}				
				System.out.println(B1 + " "+ B2);
			    System.out.println(B1.cardinality()+ " "+ B2.cardinality());	
			}
			else if(operation.equals("OR")){
				if(one == 1){
					B1.or(B2);
				}else if (one == 2){
					B2.or(B1);
				}
				System.out.println(B1 + " "+ B2);
				System.out.println(B1.cardinality()+ " "+ B2.cardinality());
			}
			else if (operation.equals("XOR")){
				if(one == 1){
					B2.xor(B1);
				}
				else if(one == 2){
					B1.xor(B2);
				}
				System.out.println(B1 + " "+ B2);
				System.out.println(B1.cardinality()+ " "+ B2.cardinality());
			}
			else if (operation.equals("SET")){
				if(one == 1){
					B1.set(two);
				}else if(one == 2){
					B2.set(two);
				}
				System.out.println(B1 + " "+ B2);
				System.out.println(B1.cardinality()+ " "+ B2.cardinality());
			}
			else if(operation.equals("FLIP")){
				if(one == 1){
					B1.flip(two);
				}else if(one == 2){
					B2.flip(two);
				}
				System.out.println(B1 + " "+ B2);
				System.out.println(B1.cardinality()+ " "+ B2.cardinality());
			}
		}

	}

}
