package hw4;

public class HW4_3 {

	public static void main(String[] args) {
		/*
		 * 有個字串陣列如下 (八大行星): {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”,
		 * “uranus”, “neptune”} 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) (提示:字元比對,String方法)
		 */

		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int Vowels = countVowels(planets);

		System.out.println("陣列裡面共有" + Vowels + "個母音");
	}

	private static int countVowels(String[] strings) {
		int count = 0;

		for (String str : strings) {
			String planets = str;
			for (int i = 0; i < planets.length(); i++) {
				char curChar = planets.charAt(i);
				switch (curChar) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
				}
			}
		}
		return count;
	}
}
