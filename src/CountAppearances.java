
public class CountAppearances {
    public int numberTimesAppear(int number, int digit) {
        // fill in code here
    	int times = 0;
    	int num_temp = number;
    	while (num_temp > 0) {
    		if (num_temp%10 == digit)
    			times++;
    		num_temp /= 10;
    	}
    	return times;
    }
}
