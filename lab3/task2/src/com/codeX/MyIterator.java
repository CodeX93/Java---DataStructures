package com.codeX;

public class MyIterator <T>{
    int index;

    MyArrayList<T> obj = new MyArrayList<>();

    MyIterator(MyArrayList <T> obj)
    {
        index = 0;

        this.obj = obj;
    }

    boolean hasNext()
    {
        if (index < obj.size) {
            return true;
        }
        return false;
    }

    T next()
    {
        return obj.get(index++);
    }

    void resetIndex()
    {
        index = 0;
    }


}

