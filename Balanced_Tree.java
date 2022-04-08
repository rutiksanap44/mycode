package Binary_Trees;
import Binary_Trees.Height_of_Tree;
public class Balanced_Tree {
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int Leftheight = height(root.left);
        int Rightheight = height(root.right);
        return 1+Math.max(Leftheight,Rightheight);
    }
    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int Leftheight = height(root.left);
        int Rightheight = height(root.right);
        if(Math.abs(Leftheight - Rightheight) >1){
            return false;
        }
        boolean Leftbalanced = isBalanced(root.left);
        boolean Rightbalanced = isBalanced(root.right);

        return Leftbalanced && Rightbalanced;

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
        BinaryTreeNode<Integer> rootRightRightRight = new BinaryTreeNode<Integer>(55);
        rootLeft.left=rootLeftLeft;
        rootRight.right=rootRightRight;
        rootRightRight.right=rootRightRightRight;
        System.out.println(isBalanced(root));
    }
}
