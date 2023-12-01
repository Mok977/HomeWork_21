package hw4;

public class HW4_2 {
	/*
	 * 請建立一個字串,經過程式執行後,輸入結果是反過來的 例如String s = “Hello World”,執行結果即為dlroW olleH
	 * (提示:String方法,陣列)
	 */
	public static void main(String[] args) {
		String String = "Hello World";
		
		String reveresdString = reveres(String);
		System.out.println("反轉後: " + reveresdString);
	}
	
	private static String reveres(String string) {
		char[] charArray = string.toCharArray();

		int left = 0;
		int right = charArray.length - 1;

		while(left < right) {
			char temp = charArray[left]; 
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			left++;
			right--;
		}
		
		return new String(charArray);
	}
	
//	參考leetcode 344. Reverse String 思考方法 的雙指針解決
}
