package hw5;

import java.util.Random;

public class HW5_5 {
	public static void main(String[] args) {
		String code = ranCode();
		System.out.println("生成的驗證碼\n" + code);
	}

	public static String ranCode() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		char[] charArray = characters.toCharArray();

		Random random = new Random();

		char[] codeArray = new char[8];

		for (int i = 0; i < 8; i++) {
			codeArray[i] = charArray[random.nextInt(charArray.length)];
		}
		return new String(codeArray);
	}

}
