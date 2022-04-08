package Binary_Trees;
public class Remove_Leaf_Node {
    public static BinaryTreeNode<Integer> RemoveLeaf(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            return null;
        }
        root.left = RemoveLeaf(root.left);
        root.right = RemoveLeaf(root.right);
        return root;
    }
    public static void printTree(BinaryTreeNode<Integer> root){
        System.out.println(root.data);
        if(root.left!=null) {
            printTree(root.left);
        }
        if(root.right!=null){
            printTree(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        // for the connection of rootLeft and rootRight with  parent root that is root.
        root.left=rootLeft;
        root.right=rootRight;

        //to make new sub-roots of rootLeft and rootRight.
        BinaryTreeNode<Integer> rootLeftLeft = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> rootRightRight = new BinaryTreeNode<Integer>(5);
        rootLeft.left=rootLeftLeft;
        rootRight.right=rootRightRight;
        RemoveLeaf(root);
        printTree(root);
    }

}
