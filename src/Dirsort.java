import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Dirsort {
	public String[] sort(String[] dirs) { 
		Comparator<String> cmp = new Comparator<String>()
		{
		    public int compare( String x, String y )
		    {
		    	String[] x_parts = x.split("/");
		    	String[] y_parts = y.split("/");
		    	
		    	if (x_parts.length != y_parts.length)
		    		return x_parts.length - y_parts.length;
		    	for (int i=1; i < x_parts.length; i++) {
		    		if (!x_parts[i].equals(y_parts[i])) {
		    			return x_parts[i].compareTo(y_parts[i]);
		    		}
		    	}
		        return 0;
		    }
		};
		List list = Arrays.asList(dirs);
		Collections.sort(list, cmp);
		String[] res = new String[list.size()];
		list.toArray(res);
		return res;
	}
	
	public static void main(String[] args) {
		Dirsort test = new Dirsort();
		String[] dirs = {"/a/a/b/", "/a/a/a/"};
		test.sort(dirs);
	}
}
