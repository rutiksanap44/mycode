package Binary_Trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Level_Wise_Input {
    public static BinaryTreeNode<Integer> LevelWiseInput(){
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChild.add(root);

        while(!pendingChild.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChild.poll();
            System.out.println("Enter th left child of " + front.data);
            int left = s.nextInt();
            if(left !=-1){
                BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<Integer>(left);
                front.left = leftchild;
                pendingChild.add(leftchild);
            }

            System.out.println("Enter the right child of " + front.data);
            int right = s.nextInt();
            if(right !=-1){
                BinaryTreeNode<Integer> rightchild = new BinaryTreeNode<Integer>(right);
                front.right=rightchild;
                pendingChild.add(rightchild);
            }
        }
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
        BinaryTreeNode<Integer> root = LevelWiseInput();
        printDetailed(root);

    }
}
