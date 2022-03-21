public class Node <T> {
    T key;
    Node left, right;

    public Node(T item)
    {
        this.key = item;
        this.left = this.right = null;
    }
}
