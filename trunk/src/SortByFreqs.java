import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class SortByFreqs {
	public String[] sort(String[] data) { 
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
		            Integer v1 = map.get(obj1);
		            Integer v2 = map.get(obj2);
		            if (v1 == v2)
		            	return ((String)obj1).compareTo((String)obj2);
		            return v2.compareTo(v1);
		        }
		    });
		String[] res = new String[keys.size()];
		keys.toArray(res);
		return res;
	}
}
