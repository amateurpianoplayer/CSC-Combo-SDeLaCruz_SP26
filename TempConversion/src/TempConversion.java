import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double f, k, c;

		System.out.println("What is the temperature in farenheit?");
		f = input.nextDouble();

		c = (f - 32) * 5 / 9;

		k = c + 273.15;

		System.out.printf("%.2f f is %.2f c and %.2f k", f, c, k);

	}

}
