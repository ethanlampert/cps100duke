import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Aaagmnrs {
	public String[] anagrams(String[] phrases) { // fill in code
		Map<String, String> map = new HashMap<String, String>();
		for (String phrase : phrases) {
			char[] content = phrase.replace(" ", "").toLowerCase()
					.toCharArray();
			Arrays.sort(content);
			String key = new String(content);
			if (!map.containsKey(key)) {
				map.put(key, phrase);
			}
		}
		ArrayList<String> res = new ArrayList<String>();
		for (String str : map.values()) {
			res.add(str);
		}
		String[] results = new String[res.size()];
		res.toArray(results);
		return results;
	}

	public static void main(String[] args) {
		Aaagmnrs test = new Aaagmnrs();
		String[] input = { "Aaagmnrs", "TopCoder", "anagrams", "Drop Cote" };
		String[] res = test.anagrams(input);
		for (String s : res) {
			System.out.println(s);
		}
	}
}
