import java.util.HashMap;


public class FamilyTree {
	HashMap<String, Person> map = new HashMap<String, Person>();
	private class Person {
		int weight;
		String gender;
		String name;
		Person par1;
		Person par2;
		Person(String name, String gender) {
			this.name = name;
			this.gender = gender;
		}
	}
	
	public boolean validate_gender(String name, String gender) {
		if (map.containsKey(name)) {
			if (map.get(name).gender == "") 
				map.get(name).gender = gender;
			else if (map.get(name).gender != gender)
				return false;
				
		} else {
			map.put(name, new Person(name, gender));
		}
		return true;
	}
	public int firstBad(String[] data){ 
		
		int res = -1;
		for (int i=0; i < data.length; i++) {
			String[] segs = data[i].split(" ");
			String name = segs[0];
			String other = segs[1];
			if (other.equals("f") || other.equals("m")) {
				if (!validate_gender(name, other))
					return i;
			} else {
				if (!add_other(name, other))
					return i;
			}
		}
		return res;
	}
	private boolean add_other(String name, String other) {
		// TODO Auto-generated method stub
		if (name.equals(other))
			return false;
		
		if (!map.containsKey(name))
			map.put(name, new Person(name, ""));
		if (!map.containsKey(other))
			map.put(name, new Person(other, ""));
		
		Person one = map.get(name);
		Person par = map.get(other);
		if (one.par1 == null)
			one.par1 = par;
		else if (one.par1.name == other)
			one.par2 = par;
		//else if 
		return false;
	}
}
