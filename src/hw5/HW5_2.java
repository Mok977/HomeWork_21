package hw5;

import java.util.Random;

public class HW5_2 {
	public static void main(String[] args) {
//		請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
		randAvg();
	}

	public static void randAvg() {
		int[] numbers = new int[10];
		int sum = 0;
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			numbers[i] = random.nextInt(101);
			sum += numbers[i];
		}

		double avg = (double) sum / 10;

		System.out.println("生成亂數為:");
		for (int i = 0; i < 10; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.print("\n平均值為:" + avg);
	}

}
