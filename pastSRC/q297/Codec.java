package q297;

import java.util.LinkedList;
import java.util.Queue;

import TreeNode.TreeNode;

public class Codec {


	// Encodes a tree to a single string.
	public static String serialize(TreeNode root) {
		if(root==null){
			return "null,";
		}
		String tmp=root.val+",";
		tmp+=serialize(root.left);
		tmp+=serialize(root.right);
		return tmp;
	}

	// Decodes your encoded data to tree.
	public static TreeNode deserialize(String data) {
		String[] node=data.split(",");
		Queue<String> q=new LinkedList<String>();
		for(int i=0;i<node.length;i++){
			q.add(node[i]);
		}
		
		return getDeserialize(q);
		
	}
	public static TreeNode getDeserialize(Queue<String> q){
		String tmp=q.poll();
		if(tmp.equals("null")){
			return null;
		}
		TreeNode head = new TreeNode(Integer.valueOf(tmp));
		head.left = getDeserialize(q);
		head.right = getDeserialize(q);
		return head;
		
		
	}
	
	
	
//	public static void main(String[] args) {
//		TreeNode a1 = new TreeNode(1);
//		TreeNode a2 = new TreeNode(2);
//		TreeNode a3 = null;
//		a1.left = a2;
//		a1.right = a3;
//	//	System.out.println(serialize(deserialize("")));
//		TreeNode a=deserialize("1,2,3");
//		System.out.println(serialize(a));
//	}

}
