import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class PartySeats {
	  public String[] seating(String[] a) {
	      List boys = new ArrayList(), girls = new ArrayList();
	      for (int i = 0; i < a.length; ++i) {
	          int x = a[i].indexOf(' ');
	          if (a[i].charAt(x+1) == 'b') // boy
	             boys.add(a[i].substring(0, x));
	          else
	             girls.add(a[i].substring(0, x));
	      }
	      Collections.sort(boys); Collections.sort(girls);
	      List r = new ArrayList();
	      r.add("HOST");
	      if (boys.size() != girls.size())
	         return new String[0];
	      if (boys.size() % 2 == 1) // is this right?
	         return new String[0];
	      Iterator b = boys.iterator(), g = girls.iterator();
	      for (int i = 0; i < boys.size() / 2; ++i) {
	         r.add(g.next());
	         r.add(b.next());
	      }
	      r.add("HOSTESS");
	      for (int i = 0; i < boys.size() / 2; ++i) {
	         r.add(b.next());
	         r.add(g.next());
	      }
	      return (String[])(r.toArray(new String[0]));
	   }
}
