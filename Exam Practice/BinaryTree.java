class BinaryTree {
    //class to represent a binary search tree
    TreeNode root;
    BinaryTree(){
        root = null;
    }
    BinaryTree(TreeNode x){
        root = x;
    }
    TreeNode insert(TreeNode root, TreeNode n){
        if(root == null)
            root = n;
        else if( root.val > n.val)
            root = insert(root.left, n);
        else if( root.val<n.val)
            root = insert(root.right, n);
        return root;
    }
    void traversePreorder(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            traversePreorder(root.left);
            traversePreorder(root.right);
        }
    }
    int count(TreeNode root){
        if(root == null)
            return 0;
        else {
            return 1+count(root.left)+count(root.right);
        }
    }
    boolean search(TreeNode root, int val){
        boolean found = false;
        if(root!=null){
            if(root.val>val)
                found = search(root.left, val);
            else if (root.val<val)
                found = search( root.right, val);
            else
                found = true;
        }
        return found;
    }
            
