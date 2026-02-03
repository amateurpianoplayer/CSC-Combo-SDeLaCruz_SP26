import java.util.Scanner;

public class DRT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int distance, rate, time;
		System.out.println("How many miles did you travel?");
		distance = input.nextInt();
		System.out.println("How fast were you travelling");
		rate = input.nextInt();

		time = distance / rate;
		System.out.println("You travelled " + rate + " miles and hours");

	}
}