package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		try {
			System.out.println("請輸入 x 的值:");
			int x = scanner.nextInt();
			
			System.out.println("請輸入 y 的值:");
			int y = scanner.nextInt();
			
			int result = calculator.powerXY(x, y);
			System.out.println("計算結果:" + result);
			
		} catch (CalException e){
			System.out.println(e.getMessage());
			
		} catch(InputMismatchException e) {
			System.out.println("輸入格式不正確");
		} finally {
			scanner.close();
		}
	} 

}
