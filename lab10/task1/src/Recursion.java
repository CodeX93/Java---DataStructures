import java.util.Stack;

public class Recursion {
    static Stack<Character> st=new Stack<>();

    int GCDFind(int num1, int num2) {

        if (num1 == num2) {
            return num1;
        } else if (num1 > num2) {
            num1 = num1 - num2;
            return GCDFind(num1, num2);
        } else if (num2 > num1) {
            num2 = num2 - num1;
            return GCDFind(num1, num2);
        } else
            return GCDFind(num1, num2);
    }

    public void reverseString(String str,int i) {


        if(i==str.length()){
            return ;
        }
        reverseString(str,i+1);
        if(str.charAt(i)!=' '){
            st.push(str.charAt(i));
        }
        else{
            System.out.print(" ");
            while(!st.empty()){
                char e=st.pop();
                System.out.print(e);
            }
        }
        if(i==0){
            System.out.print(" ");
            while(!st.empty()){
                char e=st.pop();
                System.out.print(e);
            }

        }


    }





//    public String reverseString(String str){

//        if (str == null) {
//            return null;
//        }
//        int idx = str.indexOf(' ');
//        if (idx == -1) {
//            return str;
//        }
//        else {
//            System.out.println(str.substring(0, 5));
//            System.out.println("----");
//        }
//        return reverseString(str.substring(idx + 1)) + ' ' + str.substring(0, idx);
//    }

    void elfish(boolean b1, boolean b2, boolean b3, String str, int ind) {

    if(b1 && b2 && b3){
        System.out.println("Its a Elfish");
        return;
    }
    else{
        if(ind<str.length()){

            if(str.charAt(ind)=='e' || str.charAt(ind)=='E'){
                b1=true;
            }
            if(str.charAt(ind)=='l' || str.charAt(ind)=='L'){
                b2=true;
            }
            if(str.charAt(ind)=='f' || str.charAt(ind)=='F'){
                b3=true;
            }
            ind++;
            elfish(b1,b2,b3,str,ind);
        }else System.out.println("NOT a ELFISH");
    }

    }


}//Recursion Class Ends Here...




