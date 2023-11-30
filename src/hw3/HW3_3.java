package hw3;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HW3_3 {
	/*
	 * 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
	 * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇 的號碼與總數
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("阿文不想要的數字(輸入1~9):");
		int undesiredNumber = scanner.nextInt();

		if (undesiredNumber < 1 || undesiredNumber > 9) {
			System.out.println("這個輸入不在範圍內，請輸入1~9之間的數字");
			return;
		}
		// 進階挑戰
		Set<Integer> randomSavedNumber = generateNumbers(undesiredNumber);

		System.out.println("可選擇的號碼:");

		int totalNumbers = 0;

		for (int i = 1; i <= 49; i++) {
			if (containsDigit(i, undesiredNumber)) {
				continue;
			}
			System.out.print(i + " ");
			totalNumbers++;
		}
		System.out.println("\n總數:" + totalNumbers);
		
		// 進階挑戰
		System.out.println("隨機印出6個號碼且不得重複:\n" + randomSavedNumber);
	}

	// 進階挑戰
	private static Set<Integer> generateNumbers(int undesiredNumber) {
		Set<Integer> randomSavedNumber = new HashSet<>();
		Random random = new Random();

		while (randomSavedNumber.size() < 6) {
			int Number = random.nextInt(49) + 1;

			if (containsDigit(Number, undesiredNumber)) {
				continue;
			}
			randomSavedNumber.add(Number);
		}

		return randomSavedNumber;
	}
	

	private static boolean containsDigit(int number, int digit) {
		while (number > 0) {
			if (number % 10 == digit) {
				return true;
			}
			number /= 10;
		}
		return false;
	}
	
	
	/*
	 public static void main(String[] args) {
        // 初始化 ArrayList
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            lottoNumbers.add(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("阿文不想要的數字(1~9):");

        String input = sc.nextLine();

        String[] unRangesArray = input.split(" ");

        for (String unRange : unRangesArray) {
            int unNumber = Integer.parseInt(unRange);
            lottoNumbers.removeIf(number -> number % 10 == unNumber || number / 10 == unNumber);
        }

        System.out.print("阿文可以選的號碼:");

        for (int number : lottoNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n總數:" + lottoNumbers.size());
        
        sc.close();
    }
	 */
	
}