import java.util.ArrayList;
import java.util.HashMap;


public class IsomorphicWords {
	public boolean compare2words(String word1, String word2) {
		if (word1.length() != word2.length())
		return false;
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		ArrayList<Character> replaced = new ArrayList<Character>();
		for (int i = 0; i < word1.length(); i++) {
			if (map.containsKey(word1.charAt(i))){
				if (map.get(word1.charAt(i)) != word2.charAt(i))
					return false;
			} else {
				if (replaced.contains(word2.charAt(i)))
						return false;
				
				replaced.add(word2.charAt(i));	
				map.put(word1.charAt(i), word2.charAt(i));
			}
				
				
		}
		return true;
	}
	public int countPairs(String[] words) { 
		int count = 0;
		for (int i = 0; i < words.length-1; i++) {
			for (int j = i+1; j < words.length; j++) {
				if (compare2words(words[i], words[j]))
					count++;
			}
		}
		return count;
	}
}
