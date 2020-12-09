package array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        printArr(arr,size);
        for(int i=0; i<size/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }
        System.out.println();
        printArr(arr,size);
    }

    static void printArr(int[] arr, int size)
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
