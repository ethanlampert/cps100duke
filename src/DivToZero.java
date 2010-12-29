

public class DivToZero {
    public int lastTwo(int num, int factor) {
		int base = num/100*100;
		int left = base%factor;
		if (left == 0)
			return 0;
		else
			return factor - left;
        // fill in code here
   }
	/**
	 * @param args

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivToZero test = new DivToZero();
		System.out.println(test.lastTwo(2000000000, 100));
		System.out.println(test.lastTwo(1000, 3));
		System.out.println(test.lastTwo(23442, 75));
		System.out.println(test.lastTwo(428392, 17));
		System.out.println(test.lastTwo(32442, 99));
	}
	 */
}
