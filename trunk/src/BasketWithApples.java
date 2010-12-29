import java.util.Arrays;


public class BasketWithApples {
    public int removeExcess(int[] apples) {
        // fill in code here
    	Arrays.sort(apples);
    	int length = apples.length;
    	for (int i = 0; i < length; i++) {
    		apples[i] = apples[i] * (length - i);
    	}
    	Arrays.sort(apples);
    	return apples[length-1];
  }
}
