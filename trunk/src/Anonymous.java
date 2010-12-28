import java.util.HashMap;

public class Anonymous {
	public int howMany(String[] headlines, String[] messages) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (String headline : headlines) {
			for (int i = 0; i < headline.length(); i++) {
				char lower = Character.toLowerCase(headline.charAt(i));
				if (map.containsKey(lower)) {
					map.put(lower, map.get(lower) + 1);
				} else
					map.put(lower, 1);
			}
		}
		
		int count = 0;
		for (String message : messages) {
			HashMap<Character, Integer> copy = (HashMap<Character, Integer>) map.clone();

			boolean complete = true;
			for (int i = 0; i < message.length(); i++) {
				if (message.charAt(i) == ' ' )
					continue;
				char lower = Character.toLowerCase(message.charAt(i));
				
				if (!copy.containsKey(lower)) {
					complete = false;
					break;
				} else {
					copy.put(lower, copy.get(lower) - 1);
					if (copy.get(lower) < 0) {
						complete = false;
						break;
					}
				}
			}
			if (complete)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Anonymous test = new Anonymous();
		String[] headlines = {"Earthquake in San Francisco ", " Burglary at musuem in Sweden ", " Poverty " };
		String[] messages = {"Give me my money back ", " I am the best coder ", " TOPCODER " };
		System.out.println(test.howMany(headlines, messages));
	}
}
