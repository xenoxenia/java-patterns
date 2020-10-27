package com.company.java15;

public class CollectionG {
    int[] arr = new int[] {2, 7, 9, 15, 3};
    int size = 5;


    CollectionG(int[] arr, int size){
        setArr(arr);
        setSize(size);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void add(int k){ //k - new elem
        int newsize = size+1;
        int[] arrcopy = new int[newsize];
        for(int i = 0; i<newsize-1; i++){
            arrcopy[i] = arr[i];
        }
        arrcopy[newsize-1] = k;

        arr = new int[newsize];
        System.arraycopy(arrcopy, 0, arr, 0, newsize);
        size = newsize;
        setSize(size);
        setArr(arr);

        for (int i = 0; i <newsize; i++) {
            System.out.println(arr[i]);
        }
    }

    public void del(){
        int newsize = size-1;
        int[] arrcopy = new int[newsize];
        for (int i = 0; i <newsize; i++) {
            arrcopy[i] = arr[i];
        }
        arr = new int[newsize];
        System.arraycopy(arrcopy, 0, arr, 0, newsize);
        size = newsize;
        setSize(size);
        setArr(arr);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public void indSearch(int ind){
        if((ind>size--)||(ind<0)){
            System.out.println("Индекс неверный");
        }
        else{
            System.out.println(arr[ind]);
        }
    }

    public void elemSearch(int elem){
        for (int i = 0; i <size; i++) {
            if(arr[i] == elem) {
                System.out.println(i);
            }
        }
    }

    public void searchMax(){
        int max = arr[0];

        for (int i = 0; i <size; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void searchMin(){
        int min = arr[0];

        for (int i = 0; i <size; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public void searchAverg(){
        double av = 0;
        for (int i = 0; i < size; i++) {
            av+=arr[i];
        }
        av/=size;
        System.out.println(av);
    }

}
