public class Main {

    public static void  printNumbers(int num){
       if(num==1000){return;}
       else{
           int sumEven,sumOdd;
           sumEven=(num/100)+(num%10);
           sumOdd=(num/10)%10;
           if(sumEven==sumOdd){
               System.out.print(num+", ");
           }
           printNumbers(num+1);
       }
    }

    public static void triangle(int [] arr,int size) {

        if (size == 0) {
            return;
        } else {

            int[] temp = new int[size - 1];

            for(int i=0; i<size-1;i++){

                temp[i]=arr[i]+arr[i+1];
            }

            triangle(temp,size-1);
        }

        for(int i=0; i< arr.length; i++)
        System.out.print(arr[i] +", ");
        System.out.println("");
    }

    public static void AlphaCombi(String str, int l, int r) {

        {
            if (l == r)
                System.out.println(str);

            else {
                System.out.println("");
                for (int i = l; i <= r; i++) {
                    str = swap(str, l, i);
                    AlphaCombi(str, l + 1, r);
                    str = swap(str, l, i);
                }
            }
        }
    }
        public static String swap(String a, int i, int j)
        {
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i] ;
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }






    public static void main(String[] args) {
	// write your code here
        System.out.print("\n------------Task1-------------------\n");
        printNumbers(100);

        System.out.print("\n------------Task2-------------------\n");

        String str="ABC";
        AlphaCombi(str,0,str.length()-1);

        System.out.print("\n------------Task3-------------------\n");

        int [] arr={3,4,5,66,22,3,1};
        triangle(arr,arr.length);


    }
}
