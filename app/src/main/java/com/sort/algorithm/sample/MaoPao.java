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

    public static void insertSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static  void shellSort(int arr[],int length){
        int temp = 0;
        int incre = length;

        while(true){
            incre = incre /2;
            //对分组进行遍历
            for (int i=0;i<incre;i++){
                //插入排序
                for (int j=i+incre;j<length;j+=incre){
                    for (int k=j;k>i;k-=incre){
                        if(arr[k]<arr[k-incre]){
                            temp = arr[k];
                            arr[k] = arr[k-incre];
                            arr[k-incre] = temp;
                        }else{
                            break;
                        }
                    }
                }
            }
            //无法分组，表示排序结束
            if(incre == 1){
                break;
            }
        }
    }

    public static void quicksort(int a[], int left, int right) {
        int i, j, t, temp;

        if (left > right)
            return;

        temp = a[left]; //存基准数
        i = left;
        j = right;

        while (i != j) {
            //先从右边开始找
            while (a[j] >= temp && i < j)
                j--;
            //再从左边开始找
            while (a[i] <= temp && i < j)
                i++;
            //交换两个数在数组中的位置
            if (i < j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        //基准数归位
        a[left] = a[i];
        a[i] = temp;

        quicksort(a, left, i - 1);//继续处理左边的
        quicksort(a, i + 1, right);//继续处理右边的
    }

    public static  void sort(int[] keys, int bucketNum) {
        int len = keys.length;
        int[] bucket = new int[bucketNum];
        //初始化每个桶
        for (int i = 0; i < bucketNum; i++) {
            bucket[i] = 0;
        }
        //为每个数添加到对应桶
        for (int i = 0; i < len; i++) {
            bucket[keys[i]]++;
        }
        //遍历数组，即为结果
        for (int i = 0; i < bucketNum; i++) {
            for (int j = 1; j <= bucket[i]; j++) {
                System.out.print(i + ",");
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

//        int[] arr = {3, 1, 5, 7, 2, 4, 9, 6};
//        selectSort(arr, arr.length);
//
//        //1,2,3,4,5,6,7,9,
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }

//        int[] arr = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6};
//        insertSort(arr, arr.length);
//
//        //0,1,2,3,4,5,6,7,8,9,
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }


//        int[] arr = {3, 1, 5, 7, 2, 4, 9, 6, 8, 10};
//        shellSort(arr, arr.length);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }


//        int arr[] = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6};
//        quicksort(arr, 0, arr.length-1);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }

        int[] a = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6, 9, 10, 9, 13, 14, 15, 11, 12, 17, 16, 19};
        sort(a, 20);


    }
}
