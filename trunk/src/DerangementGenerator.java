import java.util.LinkedList;


public class DerangementGenerator {
    public void derangements(int[] a) {
        solve(a, new LinkedList<Integer>());
    }
    
    public void solve(int[] a, LinkedList<Integer> curr) {
        if (curr.size() == a.length)
            print(curr);
        else {
            for (int i = 0; i < a.length; i++) {
                if (!curr.contains(a[i]) && i != curr.size()) {
                    curr.addLast(a[i]); // O(1)
                    solve(a, curr);
                    curr.removeLast(); // O(1)
                }
            }
        }
    }

	private void print(LinkedList<Integer> curr) {
		// TODO Auto-generated method stub
		
	}


}
