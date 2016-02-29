package q226;
//import q297.Codec_TLE;
import TreeNode.TreeNode;
public class Solution {


	public static TreeNode invertTree(TreeNode root) {
		if(root==null) return root;
		TreeNode tmp=null;
		tmp=root.left;
		root.left=root.right;
		root.right=tmp;
		if(root.left!=null) invertTree(root.left);
		if(root.right!=null) invertTree(root.right);
		return root;
		
	}

//	public static void main(String[] args) {
//		
//		TreeNode root=Codec_TLE.deserialize("1,null,2,3");
//		root=invertTree(root);
//		System.out.println(Codec_TLE.serialize(root));
//		
//	}

}
