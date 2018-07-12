package com.sort.algorithm.sample;

public class MaoPao {
    public static  void bubbleSort(int[] arr,int n){
        boolean flag;
        for (int i = 1; i < n; i++) {
            flag = false;
            for (int j = 0; j < n-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag =true;
                }
            }
            if(!flag)break;
        }
    }

    public static void selectSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args){
//        int[] arr = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6};
//        bubbleSort(arr, arr.length);
//        //9,8,7,6,5,4,3,2,1,0,
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+",");
//        }

        int[] arr = {3, 1, 5, 7, 2, 4, 9, 6};
        selectSort(arr, arr.length);

        //1,2,3,4,5,6,7,9,
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
