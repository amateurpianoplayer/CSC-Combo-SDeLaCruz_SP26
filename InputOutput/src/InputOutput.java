
/**
 * this is my notes for java input output
 * @author s02956711
 */

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// this is my Scanner it is how we get input from the
		// keyboard in this case
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name");
		String name = input.next();// next grabs up to the first whitespace
		// like tab, space, or enter
		System.out.println("Hello, " + name + ", how old are you? ");
		int age = input.nextInt();// nextInt grabs the next whole number
		System.out.println("Wow " + age + " is a good age!");

		System.out.println("Give me a real number");
		double num = input.nextDouble();// nextDouble grabs the next real number
		System.out.printf("Here is your real number:%.2f\n", num);
		System.out.println(name.charAt(0));// charAt() grabs whichever letter is at
//the index in parenthesis

//this clears the "New Line" left in the buffer from the Next command.
		input.nextLine();
		System.out.println("Enter a sentence");
//grabs and input until the enter key is pressed
		String sentence = input.nextLine();
		System.out.println(sentence);
	}

}
