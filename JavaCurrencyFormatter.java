import java.text.NumberFormat;
import java.util.*;

public class JavaCurrencyFormatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale INDIA = new Locale("en","IN","Rs");
        double payment1 = Double.parseDouble(String.format("%.2f",payment));
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment1);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment1);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment1);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment1);
        // Write your code here.
       
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

	}

}
