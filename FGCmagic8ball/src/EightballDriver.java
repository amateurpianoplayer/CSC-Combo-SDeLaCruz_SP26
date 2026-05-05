import java.util.Scanner;
/**
 * 
 * This is my Magic Eightball final CS project
 * 
 * A Magic Eightball is a novelty toy that contains a d20 die on the inside that will display one of twenty answers when shaken. 10 are positive, 5 are neutral, and 5 are negative.
 * Using the "eightball.shake" method, a random answer from a string array is pulled from and displayed as the given answer. 
 * 
 * The function "Thinking" uses a "Thread.sleep" method which, when ran, will pause the thread thats currently running for X amount of time. After the time has passed, the thread becomes 
 * runnable again and continues execution based on the scheduling. (1000 units = 1 second)
 * 
 * @author Sydney De La Cruz 
 * @since 5/4/2026
 * 
 * 
 * 
 */
public class EightballDriver {

	public static void main(String[] args) throws InterruptedException {
		EightBall eightball = new EightBall();
		Scanner input = new Scanner(System.in);
		String again = "yes";
		while(again.charAt(0) == 'y') {
			again = again.toLowerCase();
			System.out.println("Please ask your question");
			input.next();
			thinking();
			System.out.println( eightball.shake());
			System.out.println("Would you like to ask a question?");
			input.nextLine();
			again = input.next();
		}
		System.out.println("Thank you for asking your questions!");
	}
	
	public static void thinking() throws InterruptedException {
		 for (int i = 0; i < 5; i++) {
	            System.out.print(".");
	           /**
	            * a static method that causes the current running thread to pause its execution for a certain amount of time
	            */
	            Thread.sleep(500); 
	        }
		 System.out.println();
	}

}
