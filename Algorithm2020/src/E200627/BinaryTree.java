package E200627;

import java.util.*;

public class BinaryTree {
	static int index=0;
    public static int[][] solution(int[][] nodeinfo) {
		int[][] answer = new int[2][nodeinfo.length];
        
		Node[] nodeArr = new Node[nodeinfo.length];
		for (int i = 0; i < nodeinfo.length; i++) {
			nodeArr[i] = new Node(nodeinfo[i][0], nodeinfo[i][1], i + 1); // createNode
		}

		Arrays.sort(nodeArr, new Comparator<Node>() {
			public int compare(Node n1, Node n2) {
				return n2.y == n1.y ? n1.x - n2.x : n2.y - n1.y;  // Sort Node(y가 높고, x가 작은 순으로 정렬)
			}
		});
        
		Node root = nodeArr[0];
		for (int i = 1; i < nodeArr.length; i++) {
			insertNode(root, nodeArr[i]);
		}
		
		preOrder(root, answer);
        index=0;
		postOrder(root, answer);
		
		return answer;
	}
    
    public static  void insertNode(Node root, Node insertNode) {
        if (root.x > insertNode.x) {
            if (root.left == null) {
                root.left = insertNode;
            } else {
                insertNode(root.left, insertNode);
            }
        } else {
            if (root.right == null) {
                root.right = insertNode;
            } else {
                insertNode(root.right, insertNode);
            }
        }
    }

	public static void preOrder(Node root, int[][] answer) {
		if (root != null) {
            answer[0][index++] = root.val;
            preOrder(root.left, answer);
            preOrder(root.right, answer);
        }
		
	}
	
	public static void postOrder(Node root, int[][] answer) {
		if (root != null) {
            postOrder(root.left, answer);
            postOrder(root.right, answer);
            answer[1][index++] = root.val;
        }
	}

	public static class Node {
		int x;
		int y;
		int val;
		Node left = null;
		Node right = null;

		public Node(int x, int y, int val) {
			this.x = x;
			this.y = y;
			this.val = val;
		}
	}
}