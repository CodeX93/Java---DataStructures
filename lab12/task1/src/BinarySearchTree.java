public class BinarySearchTree<T extends Comparable> {

Node root;

    void insert(T key)

    {root = insertRec(root, key);}

     Node insertRec(Node root, T key)
    {
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        if (key.compareTo(root.key)<0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key)>0)
            root.right = insertRec(root.right, key);
        else if (key.compareTo(root.key)==0) {
            System.out.println(root.key+" Repeated nodes Found in the Tree\nInsertion Not Possible");
        }
        return root;
    }

    void inorder()
    {inorderRec(root);}

    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key+", ");
            inorderRec(root.right);
        }
    }
    void preorder()
    {preorderRec(root);}

    void preorderRec(Node root)
    {
        if (root != null) {
            System.out.print(root.key+", ");
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }
    void postorder()
    {postorderRec(root);}

    void postorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            inorderRec(root.right);
            System.out.println(root.key+", ");
        }
    }





}
