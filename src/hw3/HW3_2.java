package hw3;

import java.util.Random;
import java.util.Scanner;

public class HW3_2 {
	/*
	 * 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
	 */
	public static void main(String[] args) {
		/*
		 * Creates a new random number generator using a single long seed. The seed is
		 * the initial value of the internal state of the pseudorandom number generator
		 * which is maintained by method next(int). Implementation Requirements: The
		 * invocation new Random(seed) is equivalent to: Random rnd = new Random();
		 * rnd.setSeed(seed);
		 */
		Random random = new Random();
//		int randomNumber = random.nextInt(10);
		int randomNumber = random.nextInt(100);

		System.out.println("猜數字!隨機產生0~100，猜猜出現的是哪一個數字?");

		Scanner sc = new Scanner(System.in);
		int guessNumber;

		while (true) {

			System.out.print("輸入你猜的數字：");

			/*
			 * Returns true if the next token in this scanner's input can be interpreted as
			 * an int value in the default radix using the nextInt() method. The scanner
			 * does not advance past any input. Returns: true if and only if this scanner's
			 * next token is a valid int value
			 */
			while (!sc.hasNextInt()) {
				System.out.println("請輸入整數");
				System.out.println("輸入你猜的數字：");
				sc.next();
			}

			guessNumber = sc.nextInt();

			if (guessNumber < 0 || guessNumber > 100) {
				System.out.println("請輸入0~100之間的數字~");
			} else if (guessNumber < randomNumber) {
				System.out.println("數字太小了再試一次");
			} else if (guessNumber > randomNumber) {
				System.out.println("數字太大了再試一次");
			} else {
				System.out.println("猜對了!");
				break;
			}
		}

		sc.close();

	}
}
