package Binary_Trees;
import java.util.ArrayList;
public class Root_to_Node_Path_in_Binary_Tree {
    public static ArrayList<Integer> RootToNodePath(BinaryTreeNode<Integer> root,int x){
        if(root == null){
            return null;
        }
        if(root.data == x){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = RootToNodePath(root.left,x);
        if(leftOutput!=null){
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = RootToNodePath(root.right,x);
        if(rightOutput!=null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(3);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(8);
        // for the connection of rootLeft and rootRight with  parent root that is root.
        root.left = rootLeft;
        root.right = rootRight;
        //to make new sub-roots of rootLeft and rootRight.
        BinaryTreeNode<Integer> rootleftleft = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeftright = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> rootRightleft = new BinaryTreeNode<Integer>(7);
        BinaryTreeNode<Integer> rootRightRight = new BinaryTreeNode<Integer>(9);
        rootLeft.left = rootleftleft;
        rootLeft.right = rootLeftright;
        rootRight.right = rootRightRight;
        rootRight.left = rootRightleft;
        System.out.println(RootToNodePath(root,7));
    }
}
