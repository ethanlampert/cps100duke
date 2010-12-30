import java.util.Arrays;
import java.util.List;

public class PositiveID {
	public int maximumFacts(String[] suspects) {
		int ans = 0;
		for (int i = 0; i < suspects.length; i++) {
			List charA = Arrays.asList(suspects[i].split(","));

			for (int j = i + 1; j < suspects.length; j++) {
				String[] charB = suspects[j].split(",");
				int common = 0;
				for (int k = 0; k < charB.length; k++) {
					if (charA.contains(charB[k]))
						common++;
				}
				if (common > ans)
					ans = common;
			}
		}
		return ans;
	}
}
