import java.util.Map;
import java.util.HashMap;


public class SimpleWordGame {
	public int points(String[] player, String[] dictionary) { 
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		for (String word:dictionary) {
			dict.put(word, 1);
		}
		int res = 0;
		for (String item: player) {
			if (dict.containsKey(item) && dict.get(item) == 1) {
				res += item.length() * item.length();
				dict.put(item, 2);
			}
		}
		return res;
	}
}
