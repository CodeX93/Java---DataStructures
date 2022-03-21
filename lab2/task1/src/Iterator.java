public class Iterator<T> {


        T [] obj;

        Iterator(T []obj){
            this.obj=obj;
        }

public <T> boolean hasNext(T[]obj) {
Boolean flag=false;
    for (T list : obj) {
        if (list == null) {
            flag=true;
            return flag;
        }
    }
    return flag;
}  //hasNext Function Ends Here...

}





