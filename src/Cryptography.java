
public class Cryptography {
	public long encrypt(int[] numbers) { 
		int min = numbers[0];
		long product = 1;
		for (int num: numbers) {
			if (num < min)
				min = num;
			product *= num;
		}
		
		return product/min*(min+1);
	}
}
