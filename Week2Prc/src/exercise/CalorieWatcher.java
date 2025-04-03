package exercise;
import java.util.Scanner;

public class CalorieWatcher {

	public static void main(String[] args) {
		System.out.println("Enter the number of cookies eaten");
		Scanner sc = new Scanner(System.in);
		int cookie = sc.nextInt();
		
		if (cookie >= 0) {
			float consume = cookie / 40 * 10;
			float total = consume * 300;
			System.out.println("You cosume " + total + " when you ate " + cookie + " cookies");// TODO Auto-generated method stub
		} else {
			System.out.println("Invalid cookie number");
		}
		
		sc.close();
	
	}

}
