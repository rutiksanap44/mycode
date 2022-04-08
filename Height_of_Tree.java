package Binary_Trees;

public class Height_of_Tree {
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int Leftheight = height(root.left);
        int Rightheight = height(root.right);
        return 1+Math.max(Leftheight,Rightheight);
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
        System.out.println(height(root));
    }
}
