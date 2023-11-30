package hw1;

public class HW1 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12 , b = 6;
		int sum = a + b,product = a * b;
		
		System.out.println("12 + 6 = " + sum);
		System.out.println("12 * 6 = " + product);
		
		// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int totalEggs = 200, dozen = 12;
		int calculateDozen = totalEggs / dozen;
		int amount = totalEggs % dozen;
		
		System.out.println("200顆總共有" + calculateDozen + "打又餘" + amount +"顆");
		
		// calculate 256559 seconds, how many days,hours,minutes,seconds
		int totalSec = 256559, hrs = 24, mins = 60, secs = 60;
		int day =  secs * mins * hrs;
		int days = totalSec / day, remainingSecs = totalSec % day;
		
		int hour = mins * secs;
		int hours = remainingSecs / hour;
		remainingSecs %= hour;
		
		int min = remainingSecs / secs;
		remainingSecs %= min;
		
		int seconds = remainingSecs;
		
		System.out.println("256559秒為: " + days + "天" + hours + "小時" + min + "分" + seconds + "秒");	
	
		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double r = 5;
		double area = r * r * PI, perimeter = r * 2 * PI;
		System.out.println("半徑5的圓面積為:" + area + "圓周長為:" + perimeter);
		
		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		int money = 1_500_000;
		double rate = 0.02;
		double saving = money * (1 + rate); 
		for(int i = 1; i <= 10; i++) {
			saving *= (1 + rate);			
		}
		System.out.println("10年後本金加利息共有:" + (int)saving);
		
		/* 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		5 + 5
		5 + ‘5’
		5 + “5”
		並請用註解各別說明答案的產生原因
		*/
		// 為 int + int 的數字加總，因為數字在 java 裡面預設型別為 int
		System.out.println(5 + 5);
		// 為 int + chat 的組合，''為 char 用法，依Unicode編碼再換算十進位數值是53，53 + 5 = output 出 58
		System.out.println(5 + '5');
		// 為 int + String 的組合，""為 String 用法，依照java晉升的特性變成String型別
		System.out.println(5 + "5");
		
		
	}

}
