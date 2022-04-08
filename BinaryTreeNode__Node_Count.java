package Binary_Trees;

public class BinaryTreeNode__Node_Count {
    public static int CountNode(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int LeftNodeCount = CountNode(root.left);
        int RightNodeCount = CountNode(root.right);
        return 1 + LeftNodeCount + RightNodeCount;
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
        BinaryTreeNode<Integer> rootLeftRight = new BinaryTreeNode<Integer>(6);
        BinaryTreeNode<Integer> rootRightLeft = new BinaryTreeNode<Integer>(7);
        rootLeft.left=rootLeftLeft;
        rootRight.right=rootRightRight;
        rootLeft.right=rootLeftRight;
        rootRight.left=rootRightLeft;
        System.out.print("Number of Nodes : " + CountNode(root));

    }
}
