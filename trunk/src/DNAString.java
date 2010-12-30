public class DNAString {
	public int minChanges(int maxPeriod, String[] dna) {
		String s = "";
		for (int i = 0; i < dna.length; i++) {
			s += dna[i];
		}
		String look = "ACGT";
		int ret = Integer.MAX_VALUE;
		for (int p = 1; p <= maxPeriod; p++) {
			int tmp = 0;
			for (int i = 0; i < p; i++) {
				int[] cnt = new int[4];
				int tot = 0;
				for (int j = i; j < s.length(); j += p) {
					cnt[look.indexOf(s.charAt(j))]++;
					tot++;
				}
				int cur = Integer.MAX_VALUE;
				for (int j = 0; j < cnt.length; j++) {
					cur = Math.min(cur, tot - cnt[j]);
				}
				tmp += cur;
			}
			ret = Math.min(ret, tmp);
		}
		return ret;
	}
}
