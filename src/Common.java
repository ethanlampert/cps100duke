
public class Common {
    public int count (String a, String b) {
        // TODO: fill in code here
    	int len_a = a.length();
    	int len_b = b.length();
    	int[] alphabet1 = new int [256];
    	int[] alphabet2 = new int [256];
    	for (int i=0; i < 256; i++) {
    		alphabet1[i] = 0;
    		alphabet2[i] = 0;
    	}
    	for (int i = 0 ; i < len_a; i++) {
    		alphabet1[(int)(a.charAt(i))] += 1;
    	}
    	int count = 0;
    	for (int i = 0; i < len_b; i++) {
    		alphabet2[(int)(b.charAt(i))] += 1;

    	}
    	for (int i=0; i < 256; i++)
    		if (alphabet1[i] > 0 && alphabet2[i] > 0) {
    			count += Math.min(alphabet1[i], alphabet2[i]);
    		}
    	return count;
     }
}
