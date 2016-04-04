package q114;

import TreeNode.*;
import java.util.*;
public class Solution {

	public void flatten(TreeNode root) {
		Stack<TreeNode> s=new Stack<TreeNode>();
		s.push(root);
		TreeNode next=null;
		while(!s.isEmpty()){
			TreeNode tmp=s.pop();
			if(tmp==null) continue;
			else {
				if(next==null) next=tmp;
				else{
					next.right=tmp;
					next.left=null;
					next=tmp;
				}
			}
			s.push(tmp.right);
			s.push(tmp.left);
			
		}		
	}

}
