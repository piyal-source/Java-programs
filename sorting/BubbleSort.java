package sorting;

import java.util.Scanner;

// O(n^2)

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
    }

    public static void bubbleSort(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            boolean isSorted = true;
            for (int j=0; j<n-1-i; j++) {
                if(arr[j+1] < arr[j]) {
                    swap(arr, j, j+1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        printArr(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr) {
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}
