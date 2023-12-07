package hw6;

public class Calculator {
	
	public int powerXY(int x, int y) throws CalException{
		if(x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		}
		
		if(y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}
		
		int result = 1;
		for(int i = 0; i < y; i++) {
			result *= x;
		}
		
		return result;
	}

}