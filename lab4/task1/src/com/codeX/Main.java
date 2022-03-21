package com.codeX;

public class Main {

    public static void main(String[] args) {
	// write your code here

Sorting sort=new Sorting();

        int array[][] = new int[][]  {
                new int[] {32, 30, 39 ,34,37,37,35,33},
                new int[] {50, 48, 54, 59, 47, 49,52,51,55,53,57,58},
                new int[] {3, 5,6,9,12}
        };

array[0] = sort.InsertionSort(array[0]);
array[1]=sort.SelectionSort(array[1]);
array[2]=sort.BubbleSort(array[2]);



for(int i=0;i< array.length;i++){
    for(int j : array[i]){
        System.out.print(j+" ");
    }
    System.out.println();
}


}



}
