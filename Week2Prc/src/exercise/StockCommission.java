package exercise;
import java.util.Scanner;

public class StockCommission {

	public static void main(String[] args) {
		System.out.println("Enter the share price");
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		System.out.println("Enter number of shares");
		double shares = sc.nextDouble();
		double cost = price * shares;
		double commission = cost * 0.0425;
		double total = cost + commission;
		
		System.out.println("stock cost : " + cost + "\nCommission: " + commission + "\nTotal: " + total);// TODO Auto-generated method stub

	}

}
