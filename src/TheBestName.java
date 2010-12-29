import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TheBestName {
	public String[] sort(String[] names) { 
		Comparator<String> cmp = new Comparator<String>()
		{
		    public int compare( String x, String y )
		    {
		    	if (x.equals("JOHN"))
		    		return -99999;
		    	if (y.equals("JOHN"))
		    		return 99999;
		    	int x_weight = 0;
		    	int y_weight = 0;
		    	for (Character c: x.toCharArray()) {
		    		x_weight += c - 'A' + 1;
		    	}
		    	for (Character c: y.toCharArray()) {
		    		y_weight += c - 'A' + 1;
		    	}
		    	if (x_weight == y_weight)
		    		return x.compareTo(y);
		    	else 
		    		return y_weight - x_weight;
		    }
		};
		List list = Arrays.asList(names);
		Collections.sort(list, cmp);
		String[] res = new String[list.size()];
		list.toArray(res);
		return res;
	}
}
