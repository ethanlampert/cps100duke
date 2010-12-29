
public class TippingWaiters {
    public int possiblePayments(int bill, int cash) {
        // fill in code here
    	int ways = 0;
    	int total_bill_lower = (int) ((float)bill /19 * 20) - 20;
    	while (total_bill_lower % 5 != 0 || 
    			total_bill_lower - bill < 0.05 * total_bill_lower) {
    		total_bill_lower = total_bill_lower + 1;
    	}
    	int total_bill_upper = (int) ((float)bill/9*10) + 10;
    	while (total_bill_upper % 5 != 0 || 
    			total_bill_upper - bill > 0.1 * total_bill_upper) {
    		total_bill_upper = total_bill_upper - 1;
    	}
//   	System.out.println(bill + " " + cash + " lower:"+total_bill_lower + " upper:" + total_bill_upper);
    	if (cash < total_bill_lower) 
    		return 0;
    	if (total_bill_upper < total_bill_lower)
    		return 0;
    	for (int i = total_bill_lower; i <= total_bill_upper; i += 5) {
    		if (i > cash)
    			break;
    		ways++;
    	}
    	return ways;
    }
    
	public static void main(String[] args) {
    	TippingWaiters test = new TippingWaiters();
    	System.out.println(test.possiblePayments(4, 100));
    	System.out.println(test.possiblePayments(23, 100));
    	System.out.println(test.possiblePayments(23, 24));
    	System.out.println(test.possiblePayments(220, 239));
    	System.out.println(test.possiblePayments(1234567, 12345678));
    	System.out.println(test.possiblePayments(1880000000, 1980000000));
    	System.out.println(test.possiblePayments(171000000, 179999999));
    	System.out.println(test.possiblePayments(855, 179999999));
    }
}
