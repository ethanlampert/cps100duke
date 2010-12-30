import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ServiceNames {
	public String[] makeList(String[] services) {
		Map<String, TreeSet<String>> map = new TreeMap<String, TreeSet<String>>();
		for (String s : services) {
			String[] parts = s.split(" ");
			for (int i = 1; i < parts.length; i++) {
				TreeSet<String> set;
				if (!map.containsKey(parts[i])) {
					set = new TreeSet<String>();
				} else {
					set = map.get(parts[i]);
				}
				set.add(parts[0]);
				map.put(parts[i], set);
			}
		}
		String[] res = new String[map.size()];
		int i = 0;
		for (Entry<String, TreeSet<String>> e : map.entrySet()) {
			String value = "";
			for (String x : e.getValue())
				value += x + ", ";
			res[i++] = e.getKey() + " ==> "
					+ value.substring(0, value.length() - 2);
		}
		return res;
	}

	public static void main(String[] args) {
		String[] s = { "BLAST Genome Annotation Sensitivity", "PING",
				"X Annotation" };
		ServiceNames t = new ServiceNames();
		String[] res = t.makeList(s);
		for (int i = 0; i < res.length; i++) {
			System.out.println("res:" + res[i]);
		}
	}
}
