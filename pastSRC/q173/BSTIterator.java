package q173;

import java.util.Stack;

import TreeNode.TreeNode;

public class BSTIterator {
	
	private Stack<TreeNode> s=new Stack<TreeNode>();
	private void PushAll(TreeNode root){
		while(root!=null){
			s.push(root);
			root=root.left;
		}
	}
	public BSTIterator(TreeNode root) {
		PushAll(root);
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !s.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode tmp=s.pop();
		PushAll(tmp.right);
		return tmp.val;
	}
}
