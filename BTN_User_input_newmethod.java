package Binary_Trees;
import java.util.*;
public class BTN_User_input_newmethod {
    public static BinaryTreeNode<Integer> takingInputbetter(boolean isRoot,int parentData,boolean isLeft){
        if(isRoot) {
            System.out.println("Enter the Root");
        }
        else{
            if(isLeft){
                System.out.println("Enter the left Node");
            }
            else{
                System.out.println("Enter the right Node");
            }
        }
        Scanner s=new Scanner(System.in);
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
        BinaryTreeNode<Integer> rootleft = takingInputbetter(false,rootdata,true);
        BinaryTreeNode<Integer> rootright = takingInputbetter(false,rootdata,false);
        root.left=rootleft;
        root.right=rootright;
        return root;
    }
    public static void printDetailed(BinaryTreeNode<Integer> root)
    {
        if(root==null){
            return;
        }
        System.out.print(root.data + " : ");
        if(root.left!=null){
            System.out.print(" L" + root.left.data + " , ");
        }
        if(root.right!=null){
            System.out.print(" R" + root.right.data );
        }
        System.out.println();
        printDetailed(root.left);
        printDetailed(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takingInputbetter(true ,0,false);
        printDetailed(root);
    }
}
