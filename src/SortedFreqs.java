import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class SortedFreqs {
	public int[] freqs(String[] data) { 
		final HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String str: data) {
			if (map.containsKey(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
		}
		List keys = new ArrayList();
		keys.addAll(map.keySet());
		Collections.sort(keys, new Comparator() {
		        public int compare(Object obj1, Object obj2) {
		            	return ((String)obj1).compareTo((String)obj2);
		        }
		    });
		int[] res = new int[keys.size()];
		for (int i = 0; i < keys.size(); i++)
			res[i] = map.get(keys.get(i));
		return res;
	}
}
