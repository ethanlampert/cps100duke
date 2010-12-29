public class TextCompressor {
	public String longestRepeat(String sourceText) {
		// fill in code here
		int source_len = sourceText.length();
		if (source_len == 1)
			return sourceText;
		String res = "";
		String substr = "";
		int start = 0;
		int end = 0;
		int max_len = 0;
		int len = 0;

		while (start < source_len) {
			for (end = (source_len - start) / 2 + start; end > start; end--) {
				substr = sourceText.substring(start, end);
//				System.out.println(substr);
				if (sourceText.substring(end).contains(substr)) {
					len = substr.length();
					if (len > max_len) {
						max_len = len;
						res = substr;
					}
					break;
				}
			}
			start++;
		}
//		System.out.println(sourceText +" |res:"+ res);
		return res;
	}

}
