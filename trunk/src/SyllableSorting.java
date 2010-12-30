import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SyllableSorting {
	class Word implements Comparable<Word> {
		String[] orig;
		String[] sorted;
		String text;

		Word(String text) {
			this.text = text;
			List<String> list = new ArrayList<String>();
			while (text.length() > 0) {
				String temp = "";
				while (isConsonant(text.charAt(0))) {
					temp += text.charAt(0);
					text = text.substring(1);
				}
				while (text.length() > 0 && !isConsonant(text.charAt(0))) {
					temp += text.charAt(0);
					text = text.substring(1);
				}
				list.add(temp);
			}
			orig = list.toArray(new String[0]);
			sorted = list.toArray(new String[0]);
			Arrays.sort(sorted);
		}

		public int compareTo(Word w) {
			for (int i = 0; i < w.sorted.length && i < sorted.length; i++) {
				if (!w.sorted[i].equals(sorted[i]))
					return sorted[i].compareTo(w.sorted[i]);
			}
			if (sorted.length != w.sorted.length)
				return sorted.length - w.sorted.length;
			for (int i = 0; i < w.orig.length && i < orig.length; i++) {
				if (!w.orig[i].equals(orig[i]))
					return orig[i].compareTo(w.orig[i]);
			}
			return 0;
		}
	}

	static final String vow = "aeiou";

	boolean isConsonant(char ch) {
		return vow.indexOf(ch) == -1;
	}

	public String[] sortWords(String[] words) {
		int n = words.length;
		Word[] w = new Word[n];
		for (int i = 0; i < n; i++)
			w[i] = new Word(words[i]);
		Arrays.sort(w);
		for (int i = 0; i < n; i++)
			words[i] = w[i].text;
		return words;
	}
}
