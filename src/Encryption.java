
public class Encryption {
	public String encrypt(String message){ 
		char[] map = new char[26];
		for (int i=0; i<26; i++)
			map[i] = '*';
			
		String res = "";
		int cnt = 0;
		char rep;
		for (Character ch:message.toCharArray()) {
			if (map[ch-'a']!='*')
				res += map[ch-'a'];
			else {
				rep = (char) ('a' + cnt);
				res += rep;
				map[ch-'a'] = rep;
				cnt++;
			}
				
		}
		return res;
	}
}
