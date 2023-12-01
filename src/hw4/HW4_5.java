package hw4;

import java.util.Scanner;

public class HW4_5 {
	/*
	 * 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天 例:輸入 1984 9 8
	 * 三個號碼後,程式會顯示「輸入的日期為該年第252天」 (提示1:Scanner,陣列) (提示2:需將閏年條件加入)
	 * (提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入年份:");
		int year = scanner.nextInt();
		System.out.println("請輸入月份:");
		int month = scanner.nextInt();
		System.out.println("請輸入日期:");
		int day = scanner.nextInt();

		if (!valid(year, month, day)) {
			System.out.println("輸入的日期無效!");
			return;
		}

		int dayOfyear = calculateDayOfYear(year, month, day);
		System.out.println("輸入的日期為該年第" + dayOfyear + "天");
	}

	private static boolean valid(int year, int month, int day) {
		if (year < 1 || month < 1 || month > 12 || day < 1) {
			return false;
		}
		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				return day <= 29;
			} else {
				return day <= 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return day <= 30;
		} else {
			return day <= 31;
		}
	}
	
	private static int calculateDayOfYear(int year, int month ,int day) {
		int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			daysInMonth[2] = 29;
		}
		
		int dayOfYear = 0;
		for(int i = 1; i < month; i++){
			dayOfYear += daysInMonth[i];
		}
		dayOfYear += day;
		
		return dayOfYear;
	}

}
