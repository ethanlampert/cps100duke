import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CirclesCountry {
	public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) { 
		Set<Integer> tmp1 = null, tmp2;
		Set<Integer> s1 = new TreeSet<Integer>();
		Set<Integer> s2 = new TreeSet<Integer>();
		for (int i =0; i<x.length; i++) {
			if ((x1-x[i])*(x1-x[i]) + (y1-y[i])*(y1-y[i]) < r[i]*r[i]) {
				s1.add(i);
			}
			if ((x2-x[i])*(x2-x[i]) + (y2-y[i])*(y2-y[i]) < r[i]*r[i])
				s2.add(i);
			tmp1 = new TreeSet<Integer>(s1);
			tmp1.addAll(s2);
			tmp2 = new TreeSet<Integer>(s1);
			tmp2.retainAll(s2);
			// symDifference = union - intersection
			
			tmp1.removeAll(tmp2);
		}
		return tmp1.size();
	}
}
