package pl.katarzynawojtowicz.javatraining;

import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {

	public static void main(String[] args) {
		String[] answers = { "It is certain", "It is decidedly so", "Without a doubt", "Yes definitely",
				"You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes",
				"Reply hazy try again", "Ask again later", "Better not tell you now", "Cannot predict now",
				"Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no",
				"Outlook not so good", "Very doubtful" };
		System.out.println("Click 0 if You want know the answer ");
		Scanner input = new Scanner(System.in);
		int click = input.nextInt();

		if (click == 0) {
			Random r = new Random();
			int randomIndex = r.nextInt(answers.length - 1);
			System.out.println(answers[randomIndex]);

		}
		input.close();

	}

}
