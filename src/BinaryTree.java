package Tree;

class BinaryTree {
    TreeNode root;
    BinaryTree() {
        root = null;
    }
    BinaryTree( TreeNode x ) {
        root = x;
    }
    TreeNode insert ( TreeNode root, TreeNode x ) {
        // insert a value in the tree
        if(root == null) {
            root = x;
        }
        else if(root.data > x.data){
            root.left = insert(root.left,x);
        }
        else if(root.data < x.data){
            root.right = insert(root.right,x);
        }
        else {
            return root;
        }
    }
    int count( TreeNode root ){
        //count the number of nodes in the tree
        if(root == null){
            return 0;
        }
        else {
            int numberOfNodes = 1;
            numberOfNodes += count(root.left);
            numberOfNodes += count(root.right);
            return numberOfNodes;
        }
    }
    void traversePreorder(TreeNode root){
	//Preorder traversal
		if(root!=null){
			System.out.println(root.data+"--->");
			traversePreorder(root.left);
			traversePreorder(root.right);
		}
	}
	void traverseInorder(TreeNode root){
		//Inorder Traversal
		if(root!=null){
			traverseInorder(root.left);
			System.out.println(root.data+"--->");
			traverseInorder(root.right);
		}
	}
	void traversePostorder(TreeNode root){
		//PostOrder traversal
		if(root!=null){
			traversePostorder(root.left);
			traversePostorder(root.right);
			System.out.println(root.data+"---->");
		}
	}
	boolean search(TreeNode head, int val){
		/*
         * check if given value val is present in Tree
		 * whose root is head. 
         */ 
		boolean found = true;
		if(head!=null){
			if(val<head.data)
				found = search(head.left, val);
			else if(val>head.data)
				found = search(head.right,val);
			else
				found = true;
		}
		return found;
	}
	TreeNode delete(TreeNode head, int val){
		//Delete val from tree whose root is head
		if( head!=null ){
			if( head.data == val ){
				if( head.left == null && head.right == null )
					return null;
				else if( head.left == null )
					return head.right;
				else if( head.right == null )
					return head.left;
				else{
					TreeNode right1 = head.right;
					while( right1.left!=null )
						right1 = right1.left;
					return head.right;
				}
			}
			else if(head.data>val)
				head.left = delete(head.left, val);
			else
				head.right = delete(head.right, val);
		}
		return head;
	}
}
