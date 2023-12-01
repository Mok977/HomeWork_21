package hw4;

import java.util.Arrays;

public class HW4_6 {
//	班上有8位同學,他們進行了6次考試結果如下:
//	請算出每位同學考最高分的次數，二維陣列
	public static void main(String[] args) {
	
	// 二維陣列，迴圈解法
		int[][] scores = { 
				{ 10, 37, 100, 77, 98, 90 },
				{ 35, 75, 70, 95, 70, 80 },
				{ 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 },
				{ 90, 64, 75, 60, 75, 50 },
				{ 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 },
				{ 70, 95, 90, 89, 90, 75 }
				};

		int[] maxCount = new int[scores.length];

		for (int i = 0; i < scores[0].length; i++) {
			int maxScore = Integer.MIN_VALUE;

			for (int j = 0; j < scores.length; j++) {
				if (scores[j][i] > maxScore) {
					maxScore = scores[j][i];
				}
			}

			for (int j = 0; j < scores.length; j++) {
				if (scores[j][i] == maxScore) {
					maxCount[j]++;
				}
			}
		}
		for (int i = 0; i < maxCount.length; i++) {
			System.out.println((i + 1) + "號考最高分的次數為:" + maxCount[i] + "次");
		}

	 
		
	/*
	 // stream API解法
		int[][] scores = { 
				{ 10, 37, 100, 77, 98, 90 },
				{ 35, 75, 70, 95, 70, 80 },
				{ 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 },
				{ 90, 64, 75, 60, 75, 50 },
				{ 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 },
				{ 70, 95, 90, 89, 90, 75 }
				};
		
		int[] maxCount = new int[scores.length];

		for(int i = 0; i < scores[0].length; i++) {
			int finalI = i;
			int maxScore = Arrays.stream(scores)
					.mapToInt(row -> row[finalI])
					.max()
					.orElseThrow();
			
			for(int j = 0; j < scores.length; j++) {
				if(scores[j][i] == maxScore) {
					maxCount[j]++;
				}
			}
		}
		for(int i = 0; i < maxCount.length; i++) {
			System.out.println((i + 1) + "號考到最高分的次數為:" + maxCount[i] + "次");
		}
	 */

	}

}
