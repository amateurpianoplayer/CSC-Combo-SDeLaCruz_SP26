import java.util.Scanner;
/**
 * 
 * This is my Magic Eightball project
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
