package hw2;

public class HW2 {
	public static void main(String[] agrs) {
		// Test99
		// for + while迴圈
		System.out.println("for + while");
		for(int i = 1; i <= 9; i++) {	
			int j = 1; 
			while(j <= 9) { // 給 while 下條件
				System.out.println(i + "*" + j + "=" + i * j + "\t");
				j++;	
			}
			System.out.println();
		}
		
		 System.out.println("===================================================================");
		
		// for + do while
		System.out.println("for + do while");
		for(int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.println(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
		
		 System.out.println("===================================================================");
		
		// while + do while
		System.out.println("while + do while");
		int a = 1;
		while(a <= 9) {
			int b = 1;
			do {
				System.out.println(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while(b <= 9);
			a++;
			System.out.println();
		}
		
		 System.out.println("===================================================================");

		
		// even 1 ~ 1000 求總和
		 int sum = 0;
		 for(int i = 2; i <= 1000; i += 2) {
			 sum += i;
		 }
		 System.out.println("\n1到1000的偶數總和:" + sum);
		
		 // sum = 0
		 // i = 2, sum = 0
		 // sum = sum + i, i = i + 2
		 // i = 4, sum = 2
		 
		 System.out.println("===================================================================");


		 // 1 ~ 10 連乘積 10! 用 for 迴圈
		 int sum2 = 1;
		 for(int i = 1; i <= 10; i++) {
			 sum2 *= i;
		 }
		 System.out.println("for迴圈的10!=" + sum2);
		 
		 System.out.println("===================================================================");
		 
		 // 10! 用 while 迴圈
		 int sum3 = 1, x = 1;
		 while(x <= 10) {
			 sum3 *= x;
			 x++;
		 }
		 System.out.println("While迴圈的10!=" + sum3);
		 
		 System.out.println("===================================================================");
		 
		 // 1 4 9 16 25 36 49 64 81 100 平方數
		 System.out.print("印出1-10平方數: ");
		 for(int i = 1; i <= 10; i++) {
			 int square = i * i;
			 System.out.print(square);
			 if(i < 10) {
				 System.out.print(", ");
			 }
		 }
		  System.out.println();
		  
		  System.out.println("===================================================================");

		  
		 // 1~49 去除掉有4的個位數和十位數，可以選擇的數字有哪些?總共有幾個?
		 System.out.print("可以選的數字:");
		 int count = 0;
		 for(int i = 1; i <= 49; i++) {
			 int ones = i % 10;
			 int tens = (i / 10) % 10;
			 if(ones != 4 && tens != 4) {
				 System.out.print(" " + i);
				 count++;
			 }
		 }
		 System.out.println("\n可選的總共有:" + count + "個");
		 
		 System.out.println("===================================================================");
		 
		 // 10 * 10 
		 for(int i = 10; i >= 1; i--) {
			 for(int j = 1; j <= i; j++) {
				 System.out.print(j + " ");
			 }
			 System.out.println();
		 }
		 
		 // i = 10, j = 1, 1 <= 10
		 // j++, j一路加到j = 11, 11 <= 10, 跳出內迴圈
		 // i--, i = 9
		 
		 System.out.println("===================================================================");

		 // A BB CCC DDDD 以此類推到 FFFFFF
		 // 'A' unicode: \u0041, 'B':\u0042 ....以此類推所以用 char 來做
		 
		 char current = 'A';
		 for(int i = 1; i <= 6; i++) {
			 for(int j = 1; j <= i; j++) {
				 System.out.print(current);
			 }
			 System.out.println();
			 current++;
		 }
		 
		 System.out.println("===================================================================");
		 
		 // 練習.01
		 for(int i = 1; i <= 6; i++) {
			 for(int j = 1; j < i ; j++) {
				 System.out.print(" ");
			 }
			 
			 for(int k = i; k <= 6; k++) {
				 System.out.print(k);
			 }
			 System.out.println();
		 }
		
		 // i = 1,  j = 1 , j < i,所以j第一行沒有列印
		 // k = 1, 2, 3, 4, 5, 6, 7, k <= 6,跳出小迴圈
		 // i = 2,
		 
		 System.out.println("===================================================================");
		 
		 // 練習.02
		 for(int i = 1; i <= 6; i++) {
			 for(int j = 6; j > i; j--) {
				 System.out.print(" ");
			 }
			 for(int k = 1; k <= i; k++) {
				 System.out.print(k);
			 }
			 System.out.println();
		 }
		 
		 System.out.println("===================================================================");
		 
		 // 練習.03
		 int row = 6;
		 for(int i = 1; i <= row; i++) {
			 for(int j = 1; j <= row - i; j++) {
				 System.out.print(" ");
			 }
			 
			 for(int k = 1; k <= i; k++) {
				 System.out.print(k);
			 }
			 
			 for(int n = i - 1; n >= 1; n--) {
				 System.out.print(n);
			 }
			 System.out.println();
		 }
		 
		 // i = 1
		 // j = 1, 1 <= (6-1); -> j <= 5 的空格
		 // k = 1, 1 <= 1; -> k 印出 1
		 // n = 1 - 1, 0 >= 1; -> n第一圈不打印
		 // n--, n = -1
		 // i = 2
		 // j = 2, 2 <= (6-2); -> j <= 4 個空格
		 // k = 2, 2 <= 2; -> k 印出 1, 2
		 // n = (-1) - 1, -2 >= 1; -> n 印出 1
		 
	}
}	


