import java.util.HashMap;

public class Alcohol {
	public String punish(String[] schedule) {
		// fill in body of this function
		int len = schedule.length;
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < len; i++) {
			if (m.containsKey(schedule[i])) {
				m.put(schedule[i], m.get(schedule[i]) + 1);
				if (m.get(schedule[i]) >= 3)
					return schedule[i];
			} else {
				m.put(schedule[i], 1);
			}
		}
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alcohol test = new Alcohol();
		String[] res = { "LSJUMB", "SAE", "SAE", "LSJUMB", "LSJUMB", "SAE",
				"AEP", "AEP", "AEP" };
		System.out.println(test.punish(res));
	}
}
