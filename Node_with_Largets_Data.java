package Binary_Trees;
public class Node_with_Largets_Data {
    public static int Largest_Node(BinaryTreeNode<Integer> root){
        if(root ==  null){
            return -1;
        }
        int LargestLeft = Largest_Node(root.left);
        int LargestRight = Largest_Node(root.right);
        return Math.max(root.data,Math.max(LargestLeft,LargestRight));
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        // for the connection of rootLeft and rootRight with parent root that is root.
        root.left=rootLeft;
        root.right=rootRight;

        //to make new sub-roots of rootLeft and rootRight.
        BinaryTreeNode<Integer> rootLeftLeft = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> rootRightRight = new BinaryTreeNode<Integer>(5);
        rootLeft.left=rootLeftLeft;
        rootRight.right=rootRightRight;
        System.out.print(Largest_Node(root));
    }
}
