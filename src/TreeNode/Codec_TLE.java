package TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import TreeNode.TreeNode;

public class Codec_TLE {


	// Encodes a tree to a single string.
	public static String serialize(TreeNode root) {
		String serializeTree = "";
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		TreeNode tmp = root;
		while (!q.isEmpty()) {
			tmp = q.poll();
			if (tmp != null) {
				serializeTree += tmp.val + ",";
				q.add(tmp.left);
				q.add(tmp.right);
			}
			if (tmp == null)
				serializeTree += "null,";
		}
		if (serializeTree.length() < 1)
			return null;
		if (serializeTree.length() > 5) {
			while (serializeTree.substring(serializeTree.length() - 5,
					serializeTree.length() - 1).equals("null")) {

				serializeTree = serializeTree.substring(0,
						serializeTree.length() - 5);
				if (serializeTree.length() < 5) break;
				
			}
		}

		return serializeTree.substring(0, serializeTree.length() - 1);

	}

	// Decodes your encoded data to tree.
	public static TreeNode deserialize(String data) {
		if (data.length() < 1)
			return null;
		TreeNode root = null;
		TreeNode tmp = null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int mark = 0;
		String num = "";
		int Node = 0;
		for (int i = 0; i < data.length(); i++) {
			if (tmp == null && !q.isEmpty()) {
				tmp = q.poll();
			}
			if (data.charAt(i) == ',') {
				if (num.equals("null")) {
					num = "";
					if (mark == 0) {
						mark++;
						continue;
					} else if (mark == 1) {
						mark--;
						tmp = q.poll();
						continue;
					}
				}
				Node = Integer.parseInt(num);
				num = "";
				if (root == null) {
					root = new TreeNode(Node);
					q.add(root);
				} else if (tmp != null) {
					if (mark == 0) {
						tmp.left = new TreeNode(Node);
						q.add(tmp.left);
						mark++;
						continue;
					}
					if (mark == 1) {
						tmp.right = new TreeNode(Node);
						q.add(tmp.right);
						mark--;
						tmp = q.poll();
						continue;
					}

				}
			} else {
				num += data.charAt(i);
				if (i + 1 == data.length()) {
					if (num.equals("null")) {
						if (mark == 0) {
							mark++;
							continue;
						} else if (mark == 1) {
							mark--;
							tmp = q.poll();
							continue;
						}
					}
					Node = Integer.parseInt(num);
					num = "";
					if (root == null) {
						root = new TreeNode(Node);
						q.add(root);
					} else if (tmp != null) {
						if (mark == 0) {
							tmp.left = new TreeNode(Node);
							q.add(tmp.left);
							mark++;
							continue;
						}
						if (mark == 1) {
							tmp.right = new TreeNode(Node);
							q.add(tmp.right);
							mark--;
							tmp = q.poll();
							continue;
						}

					}
				}
			}

		}

		return root;

	}

//	public static void main(String[] args) {
//		TreeNode a1 = new TreeNode(1);
//		TreeNode a2 = new TreeNode(2);
//		TreeNode a3 = new TreeNode(3);
//		a1.left = a2;
//		a1.right = a3;
//		System.out.println(serialize(deserialize("1")));
//		// TreeNode a=deserialize(serialize(a1));
//		// System.out.println(serialize(a));
//	}

}
