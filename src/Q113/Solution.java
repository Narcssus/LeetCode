package Q113;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x) {
		val = x;
	}

}

public class Solution {
	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		List<Integer> tmp =new ArrayList<Integer>();
		GetPath(root, sum, ans, tmp);
		return ans;
	}
	
	
	public static void GetPath(TreeNode root, int sum,List<List<Integer>> ans,List<Integer> tmp){
		if(root!=null){
			sum-=root.val;
			tmp.add(root.val);
			if(sum==0&&root.right==null&&root.left==null) {
				ans.add(tmp);
				tmp=new ArrayList<Integer>();
			}
			else if(sum<0){
				sum+=root.val;
				tmp.remove(tmp.size()-1);
			}
			
		}
		
		if(root!=null&&root.left!=null) GetPath(root.left,sum,ans,tmp);
		if(root!=null&&root.right!=null) GetPath(root.right,sum,ans,tmp);
	}
	
	public static void main(String[] args){
		
		TreeNode a=new TreeNode(1);
		TreeNode b=new TreeNode(2);
		TreeNode c=new TreeNode(3);
		a.left=b;
		a.right=c;
		List<List<Integer>> ans=pathSum(a,1);
		System.out.println(ans.toString());
		
	}
	
	
}
