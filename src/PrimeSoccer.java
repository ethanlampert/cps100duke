
// http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm422
public class PrimeSoccer {
	public double getProbability(int skillOfTeamA, int skillOfTeamB) {
		int[] primes = { 2, 3, 5, 7, 11, 13, 17 };
		int[] permut = { 153, 816, 8568, 31824, 31824, 8568, 18 };

		double sA = skillOfTeamA / 100.0;
		double sB = skillOfTeamB / 100.0;

		double probA = 0;
		double probB = 0;

		for (int i = 0; i < primes.length; i++) {
			probA += Math.pow(sA, primes[i])
					* Math.pow((1.0 - sA), (18 - primes[i])) * permut[i];
			probB += Math.pow(sB, primes[i])
					* Math.pow((1.0 - sB), (18 - primes[i])) * permut[i];
		}

		probA = 1.0 - probA;
		probB = 1.0 - probB;

		return 1.0 - (probA * probB);
	}
}
