import java.util.ArrayList;
import java.util.Arrays;
import java.text.*;

public class CafeUtil {
	public int getStreakGoal(int numWeeks) {
		int sum = 0;
		for (int i = 0; i <= numWeeks; i++) {
			sum += i;
		}
		return sum;
	}
	
	public double getOrderTotal(double[] prices) {
		double sum = 0;
		for (double price : prices) {
			sum += price;
		}
		return sum;
	}
	
	public void displayMenu(ArrayList<String> menuItems) {
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.printf("%d: %s%n", i, menuItems.get(i));
		}
	}
	
	public void addCustomer(ArrayList<String> customers) {
		System.out.println("Please enter your name:");
		String userName = System.console().readLine();
		System.out.printf("Hello %s%n", userName);
		System.out.printf("There are %d people in front of you.%n", customers.size());
		customers.add(userName);
		System.out.println(customers);
	}

    static public String customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        return output;
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.printf("%s%n", product);
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.printf("%d - %s%n", i, customFormat("$###,###.00#", i * price - (0.5 * (i - 1))));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if(menuItems.size() != prices.size()) {
            return false;
        }

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s -- %s%n", i, menuItems.get(i), customFormat("$###,###.00#", prices.get(i)));
        }
        return true;
    }
}