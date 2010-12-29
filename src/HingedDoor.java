
public class HingedDoor {
    public int numSwings(int initialAngle, int reduction) {
        // fill in code here
    	int num_swing = 0;
    	float x = initialAngle;
    	while (x > 5) {
    		num_swing++;
    		x = x / reduction;
    	}
    	return num_swing;
    }
}
