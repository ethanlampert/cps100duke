import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ErdosNumber {
	public String[] calculateNumbers(String[] pubs) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashSet<String> set = new HashSet<String>();
		map.put("ERDOS", 0);
		int i = 0;

		while (i < pubs.length) {
			for (String pub : pubs) {
				String[] authors = pub.split(" ");
				int min = 999999;
				for (String author : authors) {
					set.add(author);
					if (map.containsKey(author) && map.get(author) < min)
						min = map.get(author);

				}
				if (min < 999999) {
					for (String author : authors) {
						if (!map.containsKey(author) || map.get(author) > min)
							map.put(author, min + 1);
					}
				}
			}
			i++;
		}

		ArrayList<String> res = new ArrayList<String>(set);
		Collections.sort(res);
		for (i = 0; i < res.size(); ++i) {
			if (map.containsKey(res.get(i))) {
				res.set(i, res.get(i) + " " + map.get(res.get(i)));
			}
		}
		return res.toArray(new String[res.size()]);
	}
}
