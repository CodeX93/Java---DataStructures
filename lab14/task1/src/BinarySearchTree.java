 class BinarySearchTree
{
    Node root;

    // default value for root node is 9
    BinarySearchTree()
    {
        this.root = new Node(0);
    }

    BinarySearchTree(int rootValue)
    {
        this.root = new Node(rootValue);
    }

    int getHeight(Node node)
    {
        if (node == null)
            return 0;

        return node.height;
    }

    void updateHeight(Node node)
    {
        if (node == null) return;

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }


    Node rotateRight(Node node)
    {
        if (node == null) return node;

        Node beta  = node.left;

        Node t2  = beta.right;

        beta.right = node;
        node.left = t2;

        // we first need to update the height of node because height of beta uses height of node
        updateHeight(node);

        // now we update height of beta
        updateHeight(beta);

        return beta;
    }


    Node rotateLeft(Node node)
    {
        if (node == null) return node;

        Node beta  = node.right;
        Node t2  = beta.left;

        beta.left = node;
        node.right = t2;

        // we first need to update the height of node because height of beta uses height of node
        updateHeight(node);

        // now we update height of beta
        updateHeight(beta);

        return beta;
    }


    int getBalance(Node node)
    {
        if (node == null)
        {
            return 0;
        }
        int balance;

        balance = getHeight(node.left) - getHeight(node.right);

        return balance;
    }


    int getMinValue(Node node)
    {
        // though this case should not be hit ever for the usecase this function is employed for
        if (node == null) return Integer.MIN_VALUE;

        // if this is the left-most node
        if (node.left == null) return node.data;

        return getMinValue(node.left);
    }


    private Node delete(Node node, int key)
    {
        // if empty tree
        if (node == null) return null;

        if (key < node.data)
        {
            node.left = delete(node.left, key);
        }
        else if (key > node.data)
        {
            node.right = delete(node.right, key);
        }

        else // key to be deleted is equal to node data
        {
            // one child/no child case
            if (node.left == null)
            {
                node = node.right;
            }
            else if (node.right == null)
            {
                node = node.left;
            }

            // two children case
            // copy value of inorder successor into current node and delete inorder successor
            // since right sub-tree would be modified, update node.right
            else
            {
                int inorderSuccessorValue = getMinValue(node.right);
                node.data = inorderSuccessorValue;
                node.right = delete(node.right, inorderSuccessorValue);
            }
        }

        // if there was only one node in the tree which got deleted above return null
        if (node == null)
        {
            return null;
        }

        // update the height of the node
        updateHeight(node);

        // check the balance at this node and perform rotations accordingly
        int balance = getBalance(node);

        if (balance > 1) // indicates either left-left or left-right case
        {
            if (getBalance(node.left) >= 0) // confirms left-left case
            {
                node = rotateRight(node);
            }
            else // confirms left-right case
            {
                node.left = rotateLeft(node.left);
                node = rotateRight(node);
            }
        }

        else if (balance < -1) // indicates either right-right or right-left case
        {
            if (getBalance(node.right) <= 0) // confirms right-right case
            {
                node = rotateLeft(node);
            }
            else // confirms right-left case
            {
                node.right = rotateRight(node.right);
                node = rotateLeft(node);
            }
        }
        return node;
    }


    private Node insert(Node node, int key)
    {
        // do usual BST insertion first
        if (node == null)
        {
            return new Node(key);
        }

        if (key < node.data)
        {
            node.left = insert(node.left, key);
        }
        else if (key > node.data)
        {
            node.right = insert(node.right, key);
        }
        else
        {
            return node;
        }

        // now update the height of the node
        updateHeight(node);

        // check the balance at this node and perform rotations accordingly
        int balance = getBalance(node);

        if (balance > 1) // indicates either left-left or left-right case
        {
            if (key < node.left.data) // confirms left-left case
            {
                node = rotateRight(node);
            }
            else // confirms left-right case
            {
                node.left = rotateLeft(node.left);
                node = rotateRight(node);
            }
        }

        else if (balance < -1) // indicates either right-right or right-left case
        {
            if (key > node.right.data) // confirms right-right case
            {
                node = rotateLeft(node);
            }
            else // confirms right-left case
            {
                node.right = rotateRight(node.right);
                node = rotateLeft(node);
            }
        }
        return node;
    }


    public void insert(int key)
    {
        root = insert(this.root, key);
        return;
    }


    public void delete(int key)
    {
        root = delete(this.root, key);
        return;
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        printInorder(node.right);
    }
}