package exercise;
import java.util.Scanner;

public class StockCommission {

	public static void main(String[] args) {
		System.out.println("Enter the share price");
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		if (price > 0 && price <= 500) {
			System.out.println("Enter number of shares");
			int shares = sc.nextInt();
			if (shares > 100 && shares < 100000) {
				double cost = price * shares;
				double commission = cost * 0.0425;
				double total = cost + commission;
		
				System.out.println("stock cost : " + cost + 
						"\nCommission: " + commission +
						"\nTotal: " + total);
			} else {
				System.out.println("Invalid shares input");
			}// TODO Auto-generated method stub
		} else {
			System.out.println("Invalid price input");
		}
		
		sc.close();
	}

}
