
public class HuffmanDecoding {
	private class Node {
		Node left, right;
		boolean isLeaf = false;
		char ch;
		public Node() {
			left = right = null;
		}
	}
	
	Node root;
	int counter = 0;
	
	public void buildTree(Node parent, String code, int i) {
		if (i == code.length()) {
			parent.isLeaf = true;
			parent.ch = (char) (65 + counter);
			counter++;
			return;
		}
		
		if (code.charAt(i) == '0') {
			if (parent.left == null) {
				parent.left = new Node();
			}
			buildTree(parent.left, code, ++i);
			return;
		}
		if (code.charAt(i) == '1') {
			if (parent.right == null) {
				parent.right = new Node();
			}
			buildTree(parent.right, code, ++i);
			return;
		}
	}
	
	public String decode(String archive, String[] dictionary) { 
		root = new Node();
		String res = "";
		for (String code: dictionary) {
			buildTree(root, code, 0);
		}
		Node temp = root;
		for (int i = 0 ; i< archive.length(); i++) {
			if (archive.charAt(i) == '0')
				temp = temp.left;
			else
				temp = temp.right;
			
			if (temp.isLeaf) {
				res += temp.ch;
				temp = root;
			}
		}
		return res;
	}
}
