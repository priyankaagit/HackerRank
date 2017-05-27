import java.util.*;

public class JavaEndOfFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		do {
			s = sc.nextLine();
			System.out.println(i + " " + s);
			i++;
		} while (s != null);

	}

}
