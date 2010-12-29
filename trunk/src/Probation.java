import java.util.ArrayList;
import java.util.HashMap;


public class Probation {
    public String[] punish(String[] schedule) {
        // fill in body of this function
		int len = schedule.length;
		ArrayList<String> res = new ArrayList<String>();
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		HashMap<String, ArrayList<Integer>> seq = new HashMap<String, ArrayList<Integer>>();
		for (int i = 0; i < len; i++) {
			if (m.containsKey(schedule[i])) {
				m.put(schedule[i], m.get(schedule[i]) + 1);
				seq.get(schedule[i]).add(i);
				if (m.get(schedule[i]) >= 3) {
					if ((i - seq.get(schedule[i]).get(m.get(schedule[i])-3) < 5)
							&& !res.contains(schedule[i]))
						res.add(schedule[i]);
				}
			} else {
				m.put(schedule[i], 1);
				seq.put(schedule[i], new ArrayList());
				seq.get(schedule[i]).add(i);
			}
		}
		String[] str = new String[res.size()];
		res.toArray(str);
		return str;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Probation test = new Probation();
		String[] res = {"LSJUMB","SAE","AEP","SAE","LSJUMB",
				 "SAE","LSJUMB","AEP","AEP","LSJUMB"};
		String[] t = test.punish(res);
		for (String s: t)
		System.out.println(s);
		
		String[] res1 = {"A","B","C","B","A","B",
				 "C","B","A","B","D","D","D"};
		t = test.punish(res1);
		for (String s: t)
		System.out.print(s + " ");
	}
}
