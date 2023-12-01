package hw4;

import java.util.Scanner;

public class HW4_4 {
	
	public static void main(String[] args) {
		/*
		 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個
		 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000
		 * 就顯示「有錢可借的 員工編號: 25 19 27 共 3 人!」
		 */

		int[][] employees = { 
				{ 25, 2500 },
				{ 32, 800 },
				{ 8, 500 },
				{ 19, 1000 },
				{ 27, 1200 }
				};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入欲借的金額:");
		int borrowAmount = scanner.nextInt();
		
		int count = 0;
		StringBuilder result = new StringBuilder("可借員工編號:");
		
		for(int i = 0; i < employees.length; i++) {
			int employeeId = employees[i][0];
			int cash = employees[i][1];
			
			if(cash >= borrowAmount) {
				result.append(employeeId).append(" ");
				count++;
			}
		}
		
		System.out.println(result.toString() + "共" + count + "人");
	}

}
