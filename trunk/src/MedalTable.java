import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MedalTable {
	class Country implements Comparable {
		String name;
		int gold, silver, bronze;

		Country(String name, int gold, int silver, int bronze) {
			this.name = new String(name);
			this.gold = gold;
			this.silver = silver;
			this.bronze = bronze;
		}

		public int compareTo(Object o) {
			Country c = (Country) o;
			if (gold != c.gold)
				return c.gold - gold;
			if (silver != c.silver)
				return c.silver - silver;
			if (bronze != c.bronze)
				return c.bronze - bronze;
			return name.compareTo(c.name);
		}

		public String toString() {
			return name + " " + gold + " " + silver + " " + bronze;
		}
	}

	public String[] generate(String[] results) {
		ArrayList al = new ArrayList();
		for (int i = 0; i < results.length; i++) {
			StringTokenizer st = new StringTokenizer(results[i]);
			while (st.hasMoreTokens()) {
				String name = st.nextToken();
				if (!al.contains(name))
					al.add(name);
			}
		}

		Country[] cc = new Country[al.size()];
		for (int i = 0; i < al.size(); i++) {
			String name = (String) al.get(i);
			cc[i] = new Country(name, 0, 0, 0);
		}

		for (int i = 0; i < results.length; i++) {
			StringTokenizer st = new StringTokenizer(results[i]);
			int curr = 0;
			while (st.hasMoreTokens()) {
				String name = st.nextToken();
				int idx = al.indexOf(name);
				if (curr == 0)
					cc[idx].gold++;
				if (curr == 1)
					cc[idx].silver++;
				if (curr == 2)
					cc[idx].bronze++;
				curr++;
			}
		}
		Arrays.sort(cc);
		String[] r = new String[al.size()];
		for (int i = 0; i < al.size(); i++) {
			r[i] = cc[i].toString();
		}
		return r;
	}

}
