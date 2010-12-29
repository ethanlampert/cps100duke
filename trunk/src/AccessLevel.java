
public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
    	// fill in code here
    	int length  = rights.length;
    	String result = "";
    	for (int i = 0; i < length; i++) {
    		if (rights[i] >= minPermission)
    			result += "A";
    		else
    			result += "D";
    	}
    	return result;
    }
}
