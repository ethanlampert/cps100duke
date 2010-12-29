
public class RunLengthEncode {
    public String encode(String input)
    {
         // TODO fill in code here
    	int length = input.length();
    	if (length < 1)
    		return "";
    	String res = "";
    	char repeated;
    	int i = 0;
    	int count = 0;
    	int start = 0;
    	while(i < length){
    		start = i;
    		repeated = input.charAt(i);
    		while (i < length && input.charAt(i) == repeated) {
    			count++;
    			i++;
    		}
    		if (count >= 10) {
    			res += "/" + Integer.toString(count) + repeated;
    		} else if (count >= 5)
    			res += "/0" + Integer.toString(count) + repeated;
    		else {
    			res += input.substring(start, i);
    		}
    		count = 0;
    		
    		
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunLengthEncode test = new RunLengthEncode();
		
		System.out.println(test.encode("aaaaa"));

	}
}
