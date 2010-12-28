import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class ClassScores {
	public int[] findMode(int[] scores) {
		int duplicate = 0;
		HashMap<Integer, Integer> score_map = new HashMap<Integer, Integer>();
		for (int score: scores){
			if (score_map.containsKey(score)) {
				score_map.put(score, score_map.get(score) + 1);
				int times = score_map.get(score); 
				if (times > duplicate)
					duplicate = times;
			} else
				score_map.put(score, 1);
		}
		ArrayList<Integer> results = new ArrayList<Integer>();
		for (int key: score_map.keySet()) {
			if (score_map.get(key) >= duplicate)
				results.add(key);
		}
		Collections.sort(results);
		int[] res = new int[results.size()];
		for (int i = 0; i < results.size(); i++)
			res[i] = results.get(i);
		return res;
	}
}
