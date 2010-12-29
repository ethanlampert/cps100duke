
public class Birthday {
    public String getNext(String date, String[] birthdays) {
        // you write this function 
    	int length = birthdays.length;
    	int today = Integer.parseInt(date.substring(0,2)) * 31 +
    		Integer.parseInt(date.substring(3, 5));
    	String next = "";
    	int delta = 99999;
    	for ( int i =0; i < length; i++) {
    		String temp = birthdays[i].substring(0, 5);
    		int current = Integer.parseInt(temp.substring(0,2)) * 31 +
    					Integer.parseInt(temp.substring(3, 5));	
    		int d = current - today;
    		if (d < 0)
    			d += 12*31;
    		if (d < delta) {
    			next = temp;
    			delta = d;
    		}
    	}
    	return next;
   }
}
