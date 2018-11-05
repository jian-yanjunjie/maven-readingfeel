package org;

public class qst {
    public static void main(String[] args) {
        System.out.println(sort(new int[]{1,3,44,15,24,26,14,17,19}));
    }

    public static int[] sort(int[] a){
        quicksort(a,0,a.length);
        return a;

    }
    public static void quicksort(int[] a,int low,int high){
        if(low>high){
            return;
        }
        int i = low;
        int j = high;
        int key = a[low];
        while(i < j){
            //从右向左
            while(a[j] > key){
                j--;
            }
            //从左向右
            while(a[i] < key){
                i++;
            }
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
        //i==j时，替换keyd到a[i]
        a[i] = key;
        //递归调用
        quicksort(a,0,i);
        quicksort(a,i+1,a.length);
    }
}
