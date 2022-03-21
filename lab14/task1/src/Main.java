public class Main {

    public static void main(String[] args) {
	// write your code here

        BinarySearchTree tree=new BinarySearchTree();
       tree.insert(45);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);
        tree.insert(75);
        tree.insert(55);
        tree.insert(75);
        tree.insert(35);

       tree.printInorder(tree.root);
        tree.delete(35);
        System.out.println("");
        tree.printInorder(tree.root);



    }
}
