package hw3;

import java.util.Scanner;

public class HW3_1 {
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形
	public static void main(String[] args) {
		Scanner triangle = new Scanner(System.in);

		System.out.print("請輸入第三個數字:");
		double side1 = triangle.nextDouble();
		double side2 = triangle.nextDouble();
		double side3 = triangle.nextDouble();

		triangle.close();

		if (isTriangle(side1, side2, side3)) {

			if (isEquilateral(side1, side2, side3)) {
				System.out.println("這是正三角形");

			} else if (isIsosceles(side1, side2, side3)) {
				System.out.println("這是等腰三角形");

			} else if (isRight(side1, side2, side3)) {
				System.out.println("這是直角三角形");

			} else {
				System.out.println("這是其他三角形");
			}

		} else {
			System.out.println("這不是三角形");
		}
	}

	// a + b > c AND a + c AND b AND b + c > a 這是三角形
	public static boolean isTriangle(double side1, double side2, double side3) {
		return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
	}

	// a = b = c 正三角形
	public static boolean isEquilateral(double side1, double side2, double side3) {
		return (side1 == side2) && (side2 == side3);
	}

	// a = b or a = c or b = c 等腰三角形
	public static boolean isIsosceles(double side1, double side2, double side3) {
		return (side1 == side2) || (side1 == side3) || (side2 == side3);
	}

	// a^2 + b^2 = c^2 直角三角形
	public static boolean isRight(double side1, double side2, double side3) {
		double[] sides = { side1, side2, side3 };
		java.util.Arrays.sort(sides);
		return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
	}

}
