package sorting;

// Average case - O(nlogn)
// Worst case - When array is sorted - O(n^2)

public class QuickSort {
    public static void main(String[] args)
    {
        int[] arr = {4,2,8,1,10,5};
        int start = 0;
        int end = arr.length-1;
        printArray(arr, end+1);
        quickSort(arr, start, end);
        printArray(arr, end+1);
    }

    static void quickSort(int[] arr, int start, int end)
    {
        if(start<end)
        {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }

    static int partition(int[] arr, int start, int end)
    {
        int i = start - 1;
        int pivot = arr[end];
        for (int j=start; j< end; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return i+1;
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
