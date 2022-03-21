

import java.util.ArrayList;

public class BinarySearchTree {
    Node<CountryDataBase> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node<CountryDataBase> getRoot() {
        return root;
    }

    public void setRoot(Node<CountryDataBase> root) {
        this.root = root;
    }

    public void insert(CountryDataBase val)
    {
        Node<CountryDataBase> temp = new Node<CountryDataBase>(val);

        if (root == null)
        {
            root = temp;
        }
        else
        {
            Node<CountryDataBase> curr = root;
            while (curr != null)
            {
                if(val.getId() < (curr.key.getId()) )
                {
                    if(curr.left == null)
                    {
                        curr.left = temp;
                        break;
                    }
                    else {
                        curr = curr.left;
                    }
                }
                else if(val.getId() == (curr.key.getId()))
                {
                    System.out.println("This item already exists");
                    break;
                }
                else
                {
                    if(curr.right == null)
                    {
                        curr.right=temp;
                        break;
                    }
                    else {
                        curr = curr.right;
                    }
                }
            }
        }
    }

    public void inOrder(Node<City> tempRoot)
    {
        if (tempRoot == null)
        {
            return;
        }

        inOrder(tempRoot.left);
        System.out.print(tempRoot.key+" ");
        inOrder(tempRoot.right);
    }

    public void preOrder(Node<CountryDataBase> tempRoot)
    {
        if (tempRoot == null)
        {
            return;
        }

        tempRoot.key.display();
        System.out.println();
        preOrder(tempRoot.left);
        preOrder(tempRoot.right);
    }

    public void postOrder(Node<CountryDataBase> tempRoot)
    {
        if (tempRoot == null)
        {
            return;
        }
        postOrder(tempRoot.left);
        postOrder(tempRoot.right);
        System.out.print(tempRoot.key+" ");
    }

    public void deleteNode(CountryDataBase val)
    {
        Node<CountryDataBase> curr = root;

        if(root.key.getId() == val.getId()) {

            if(root.left != null && root.right == null)
            {
                root = root.left;
            }
            else if (root.left == null && root.right != null)
            {
                root = root.right;
            }
            else if (root.left == null && root.right == null)
            {
                root = null;
            }
            else {
                Node<City> temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                temp.left = root.left;
                root = root.right;
            }
        }
        else {
            while (curr != null) {
                if (val.getId() > (curr.key.getId())) {
                    if (curr.right != null && curr.right.key == val) {
                        if (curr.right.right != null && curr.right.left == null) {
                            curr.right = curr.right.right;
                            break;
                        } else if (curr.right.right == null && curr.right.left == null) {
                            curr.right = null;
                            break;
                        } else if (curr.right.right == null && curr.right.left != null) {
                            curr.right = curr.right.left;
                            break;
                        } else {
                            Node<CountryDataBase> temp = curr.right.right;
                            while (temp.left != null) {
                                temp = temp.left;
                            }
                            temp.left = curr.right.left;
                            curr.right = curr.right.right;
                            break;
                        }
                    } else {
                        curr = curr.right;
                    }
                }
                else if (val.getId() < (curr.key.getId()))
                {
                    if (curr.left != null && curr.left.key == val) {
                        if (curr.left.right != null && curr.left.left == null) {
                            curr.left = curr.left.right;
                            break;
                        } else if (curr.left.right == null && curr.left.left == null) {
                            curr.left = null;
                            break;
                        } else if (curr.left.right == null && curr.left.left != null) {
                            curr.left = curr.left.left;
                            break;
                        } else {
                            Node<CountryDataBase> temp = curr.left.right;
                            while (temp.left != null) {
                                temp = temp.left;
                            }
                            temp.left = curr.left.left;
                            curr.left = curr.left.right;
                            break;
                        }
                    } else {
                        curr = curr.left;
                    }
                }
            }
        }
    }

    public ArrayList<CountryDataBase> retrieveCountryTemp(Node<CountryDataBase> tempRoot, ArrayList<CountryDataBase> arrayList,String nameOfcountry)
    {
        if (tempRoot == null)
        {
            return arrayList;
        }

        if(tempRoot.key.getNameCountry().equals(nameOfcountry))
        {
            arrayList.add(tempRoot.key);
        }
        retrieveCountryTemp(tempRoot.left,arrayList,nameOfcountry);
        retrieveCountryTemp(tempRoot.right,arrayList,nameOfcountry);

        return arrayList;
    }

    public void retrieveCountry(String nameOfCountry) {
        ArrayList<CountryDataBase> arrayList = new ArrayList<>();
        arrayList = retrieveCountryTemp(root,arrayList,nameOfCountry);

        for (CountryDataBase i: arrayList) {
            i.display();
            System.out.println();
        }

    }

    public ArrayList<CountryDataBase> retrievePopTemp(Node<CountryDataBase> tempRoot, ArrayList<CountryDataBase> arrayList,int population)
    {
        if (tempRoot == null)
        {
            return arrayList;
        }

        if(tempRoot.key.getPopulation() == population)
        {
            arrayList.add(tempRoot.key);
        }
        retrievePopTemp(tempRoot.left,arrayList,population);
        retrievePopTemp(tempRoot.right,arrayList,population);


        return arrayList;
    }



    public void deletionByPop(int population)
    {
        ArrayList<CountryDataBase> arrayList = new ArrayList<>();
        arrayList = retrievePopTemp(root,arrayList,population);

        for (CountryDataBase i: arrayList) {
            deleteNode(i);
        }
    }



}
