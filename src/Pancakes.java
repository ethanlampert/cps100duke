

public class Pancakes {
	public int minutesNeeded(int numCakes, int capacity) {
		// TODO: fill in code here
		if (capacity >= numCakes)
			return numCakes * 5;
		if (numCakes * 2 % capacity == 0)
			return numCakes * 2 / capacity * 5;
		else
			return numCakes * 2 / capacity * 5 + 5;
	}

	/**
	 * @param args
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pancakes test = new Pancakes();
		System.out.println(test.minutesNeeded(0, 4));
		System.out.println(test.minutesNeeded(2, 2));
		System.out.println(test.minutesNeeded(3, 2));
	}*/
}
