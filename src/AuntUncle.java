import java.util.ArrayList;
import java.util.Collections;


public class AuntUncle {
    public String[] list(String[] parents, String target) {
        // fill in code here
    	ArrayList<String> results = new ArrayList<String>();
    	String[] res = {};
    	ArrayList<String> grand_parents = new ArrayList<String>();
    	int len_par = parents.length;
    	String par1, par2;
    	par1 = par2 = null;
    	for (int i = 0; i< len_par; i++) {
    		String[] parts = parents[i].split(" ");
    		if (parts[2].equals(target)) {
    			par1 = parts[0];
    			par2 = parts[1];
    			break;
    		}
    	}
    	if (par1 == null || par2 == null)
    		return res;
    	for (int i = 0; i< len_par; i++) {
    		String[] parts = parents[i].split(" ");
    		if (parts[2].equals(par1) || parts[2].equals(par2)) {
    			grand_parents.add(parts[0]);
    			grand_parents.add(parts[1]);
    		}
    	}
    	for (int i = 0; i< len_par; i++) {
    		String[] parts = parents[i].split(" ");
    		if (grand_parents.contains(parts[0]) || grand_parents.contains(parts[1])) {
    			if (!parts[2].equals(par1) &&
    					!parts[2].equals(par2) &&
    					!parts[2].equals(target) )
    			results.add(parts[2]);
    		}
    	}
    	Collections.sort(results); 
    	String str [] = new String [results.size ()];
    	results.toArray (str);
    	return str;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuntUncle test = new AuntUncle();
		String[] parents = {"A B E", "C D F", "E F G", "A P Z", "B P Y", "C P X", "D P W", 
		           "A B V", "B C U", "A C T", "B D S", "A D R", "B C Q"};
		String target = "G";
		String[] res = test.list(parents, target);
		for ( String str: res)
		System.out.print(str+ " ");
	}
}
