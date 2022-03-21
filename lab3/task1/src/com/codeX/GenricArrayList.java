 package com.codeX;

 import java.util.Arrays;

 public class GenricArrayList<T> {

    int size;
    private T[] array;


    public GenricArrayList() {

        array = (T[]) new Object[10];
        size = 0;
    }

    public boolean add(T element) {
        if (size >= array.length) {
            // make a bigger array and copy over the elements
            T[] bigger = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;


        }
        array[size] = element;
        size++;
        return true;
    }


    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }
     public int indexOf(Object target) {

         return 0;
     }




     public boolean remove(Object obj) {
         int index = indexOf(obj);
         if (index == -1) {
             return false;
         }
         remove(index);
         return true;
     }


     public void remove(int index) {

         array[index]= null;
         size--;

         if(index <size ) {
             array[index] = null;
             for(int i = index ; i < size-1; i++)
             {
                 array[i] = array[i+1];
             }
             array[size-1] = null;
         }

     }

     }


