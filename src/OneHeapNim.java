
public class OneHeapNim {
    public int makeMove (int numObjects)
    {
        // TODO: fill in code here
    	if (numObjects%3 == 1 || numObjects % 3 == 2)
    		return numObjects % 3;
    	else 
    		return 0;
    }
}
