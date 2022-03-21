public class BinarySearchTree {

Node <AccountDataBase> root;

    void insert( AccountDataBase key)
    {
        Node<AccountDataBase> temp = new Node<>(key);
        if(root==null){root=temp;}
        else{
            Node<AccountDataBase> temp2=root;
            while(temp2!=null) {
                if (temp2.key.getAccountID()>key.getAccountID()){
                    if (temp2.left == null) {
                        temp2.left = temp;
                        break;
                    }
                    else {  temp2 = temp2.left; }
                }
                if(temp2.key.getAccountID() == key.getAccountID()) {
                    System.out.println("Element Found in Tree!\nCannot Inserted.");
                    break;
                }
                else {
                    if (temp2.right == null) {
                        temp2.right = temp;
                        break;
                    } else {    temp2 = temp2.right;    }
                }
            }
        }
    }
    void inorder()
    {inorderRec(root);}

    void inorderRec(Node<AccountDataBase> root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("Account ID:\t"+root.key.getAccountID());
            System.out.println("First Name:\t"+root.key.getFirstName());
            System.out.println("Last Name:\t"+root.key.getLastName());
            System.out.println("Balance:\t"+root.key.getBalance());
            System.out.println("\n----");
            inorderRec(root.right);
        }
    }
    void preorder() {preorderRec(root);}

    void preorderRec(Node<AccountDataBase> root)
    {
        if (root != null) {
            System.out.println("Account ID:\t"+root.key.getAccountID());
            System.out.println("First Name:\t"+root.key.getFirstName());
            System.out.println("Last Name:\t"+root.key.getLastName());
            System.out.println("Balance:\t"+root.key.getBalance());
            System.out.println("\n----");
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }
    void postorder()
    {postorderRec(root);}

    void postorderRec(Node<AccountDataBase> root)
    {
        if (root != null) {
            inorderRec(root.left);
            inorderRec(root.right);
            System.out.println("Account ID:\t"+root.key.getAccountID());
            System.out.println("First Name:\t"+root.key.getFirstName());
            System.out.println("Last Name:\t"+root.key.getLastName());
            System.out.println("Balance:\t"+root.key.getBalance());
            System.out.println("\n----");
        }
    }
}
