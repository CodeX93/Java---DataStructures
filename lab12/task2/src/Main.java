public class Main {

    public static void main(String[] args) {

        AccountDataBase adb1=new AccountDataBase(0,6274,"James","Jhonson", 415.56);
        AccountDataBase adb2=new AccountDataBase(1,2843,"Marcus","Wilson", 9217.23);
        AccountDataBase adb3=new AccountDataBase(2,4892,"Maureen","Albright", 51462.56);
        AccountDataBase adb4=new AccountDataBase(3,8337,"Debra","Douglas", 27.26);
//        AccountDataBase adb5=new AccountDataBase(4,9532,"James","Jhonson", 415.56);
//        AccountDataBase adb6=new AccountDataBase(5,3165,"John","Carlson", 1496.24);
//        AccountDataBase adb7=new AccountDataBase(6,1892,"Mary","Smith", 918.26);
//        AccountDataBase adb8=new AccountDataBase(7,3924,"Simon","Becker", 386.85);
//        AccountDataBase adb9=new AccountDataBase(8,6023,"John","Edgar", 9.65);
//        AccountDataBase adb10=new AccountDataBase(9,5290,"George","Truman", 16110.68);
//        AccountDataBase adb11=new AccountDataBase(10,8529,"Ellen","Fairchild", 86.77);
//        AccountDataBase adb12=new AccountDataBase(11,1144,"Donald","Williams", 4114.26);

    BinarySearchTree bst=new BinarySearchTree();
        bst.insert(adb1);
        bst.insert(adb2);
        bst.insert(adb3);
        bst.insert(adb4);
//        bst.insert(adb5);
//        bst.insert(adb6);
//        bst.insert(adb7);
//        bst.insert(adb8);
//        bst.insert(adb9);
//        bst.insert(adb10);
//        bst.insert(adb11);
//        bst.insert(adb12);

        System.out.println("\nPreOrder");
      bst.preorder();
        System.out.println("\nInOrder");
        bst.inorder();
        System.out.println("\nPreOrder");
        bst.postorder();
        System.out.println("\n");




    }
}
