import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree tree=new BinarySearchTree();
        Scanner sc=new Scanner(System.in);



        tree.insert(45);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);
        tree.insert(65);
        tree.insert(95);





int choice;
do {
    System.out.println("1.\tFind Height of Tree");
    System.out.println("2.\tCheck if Tree is Balanced");
    System.out.println("3.\tExit");
    choice = sc.nextInt();


    if(choice==1){
        System.out.println("The height of the Tree is: "+tree.getHeight(tree.root));
    System.out.println("");}
    if(choice==2){
        System.out.println(tree.isBalance(tree.root));
    System.out.println("");}
    if(choice==3){
        System.out.println("Program Ended");
        System.exit(0);
    }

}while(choice>=0 && choice<=3);

    }
}
