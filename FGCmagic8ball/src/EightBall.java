import java.util.Random;
/**
 * This is the EightBall class it has an array of responses and a random number generator
 */
public class EightBall {
	/**
	 * an array that contains a random assortment of answers that will be pulled from
	 */
	private String[] answers = {				
			"It is certain",
			"It is decidedly so",
			"Without a doubt",
			"Yes, definitely",
			"You may rely on it",
			"As I see it, yes",
			"Most likely",
			"Outlook good",
			"Yes",
			"Signs point to yes",
			"Reply hazy, try again",
			"Ask again later",
			"Better not tell you now",
			"Cannot predict now",
			"Concentrate and ask again",
			"Don't count on it",
			"My reply is no",
			"My sources say no",
			"Outlook not so good",
			"Very doubtful",
	};
	
	/**
	 * generates a random number
	 */
	private Random random = new Random();
	
	/**
	 * pulls the random number and chooses an answer from the array corresponding to the number
	 * @return
	 */
	public String shake() {
		int index = random.nextInt(answers.length);
		return answers[index];
	}
}
