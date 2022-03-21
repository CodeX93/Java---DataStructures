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


public int getHeight(Node root) {
    int lDepth, rDepth;
    if (root == null)
        return -1;
    else {
        //compute the depth of each subtree
        //Find Max Height of Left Tree
        lDepth = getHeight(root.left);
        System.out.println(lDepth);
        //Find Max Height of Right Tree
        rDepth = getHeight(root.right);
        System.out.println(rDepth);

        /* Return the  larger Height */
        if (lDepth > rDepth)
            return (lDepth+1 );
        if (rDepth > lDepth)
            return (rDepth+1 );
        if (rDepth == lDepth) return (lDepth +1 );
    }
    return lDepth;
}

public boolean isBalance(Node node){

    int lh; /* for height of left subtree */

    int rh; /* for height of right subtree */

    /* If tree is empty then return true */
    if (node == null)
        return true;

    /* Get the height of left and right sub trees */
    lh = getHeight(node.left);
    rh = getHeight(node.right);

    if (Math.abs(lh - rh) <= 1 && isBalance(node.left) &&isBalance(node.right))
        return true;

    /* If we reach here then tree is not height-balanced */
    return false;
}


}






