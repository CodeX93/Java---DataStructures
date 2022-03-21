public class Main {

    public static void main(String[] args) {

CountryDataBase cdb1=new CountryDataBase("NYC","USA",3000000,1);
        CountryDataBase cdb2=new CountryDataBase("DC","USA",30000,2);
        CountryDataBase cdb3=new CountryDataBase("Miami","USA",200000,3);
        CountryDataBase cdb4=new CountryDataBase("Dehli","India",32000,4);
        CountryDataBase cdb5=new CountryDataBase("Islamabad","Pakistan",2230000,5);

    BinarySearchTree bst=new BinarySearchTree();
        bst.insert(cdb1);
        bst.insert(cdb2);
        bst.insert(cdb3);
        bst.insert(cdb4);
        bst.insert(cdb5);


//bst.preorder();
bst.retrieveCountry("USA");
bst.deletionByPop(3000000);
        bst.retrieveCountry("USA");




    }
}
