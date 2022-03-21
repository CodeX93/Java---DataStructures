import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);

        BinarySearchTree tree=new BinarySearchTree();


        tree.insert(25);
        tree.insert(15);
        tree.insert(35);
        tree.insert(55);
        tree.insert(65);
        tree.insert(85);
        tree.insert(95);
        tree.insert(25);
        tree.insert(35);
        tree.insert(85);

;
       tree.printInorder(tree.root);
    }
}
