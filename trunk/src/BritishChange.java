
public class BritishChange {
    public int[] coins(int pence) {
        // fill in code here
    	int[] arr = {0, 0, 0};
    	arr[0] = (pence / 240);
    	arr[1] = (pence%240)/12;
    	arr[2] = pence%12;
    	
    	return arr;
  }
}
