

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ScoreIt {
    public int maxPoints(int[] toss) {
        // fill in code here
    	HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    	for (int i = 0 ; i < 5; i++) {
        	if (m.containsKey(toss[i]))
        		m.put(toss[i], m.get(toss[i]) + toss[i]);
        	else
        		m.put(toss[i], toss[i]);
    	}
    	// First we're getting values array  
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.addAll(m.values());
        // and sorting it (in reverse order) 
        Collections.sort(values, Collections.reverseOrder());
    	return values.get(0);
   }
	/**
	 * @param args

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreIt test = new ScoreIt();
		int[] input = { 2, 2, 3, 5, 4 };
		System.out.println(test.maxPoints(input));
		int[] input2 = { 6, 4, 1, 1, 3 };
		System.out.println(test.maxPoints(input2));
		int[] input3 = { 5, 3, 5, 3, 3 }; 
		System.out.println(test.maxPoints(input3));

	}
	 */
}
