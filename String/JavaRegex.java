package String;
import java.util.*;
public class JavaRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
		
	}
	
	public static class MyRegex{
		
		String pattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]).(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]).(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]).(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		
		
	}

}


