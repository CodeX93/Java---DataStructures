import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree bst=new BinarySearchTree();
        Scanner sc=new Scanner(System.in);



        bst.insert(56);
        bst.insert(16);
        bst.insert(76);
        bst.insert(46);
        bst.insert(6);
        bst.insert(61);
        bst.insert(10);
        bst.insert(96);
int choice;
do {
    System.out.println("1.\tDisplay Inorder");
    System.out.println("2.\tDisplay Preorder");
    System.out.println("3.\tDisplay Postorder");
    choice = sc.nextInt();


    if(choice==1){
    bst.inorder();
    System.out.println("");}
    if(choice==2){
    bst.preorder();
    System.out.println("");}
    if(choice==3){
    bst.postorder();
        System.out.println("");}

}while(choice>=0 && choice<=3);

    }
}
