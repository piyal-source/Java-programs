package array;

// Use modified merge sort if you want to maintain the sequence

public class SeperateNegativeNos {
    public static void main(String[] args)
    {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int left = 0;
        int right = arr.length - 1;
        printArr(arr, right+1);
        rearrange(arr, left, right);
        printArr(arr, right+1);
    }

    static void rearrange(int[] arr, int left, int right)
    {
        while(left < right)
        {
            if(arr[left]<0 && arr[right]<0)
            {
                left++;
            }
            else if(arr[left]<0 && arr[right]>=0)
            {
                left++;
                right--;
            }
            else if(arr[left]>=0 && arr[right]<0)
            {
                swap(arr, left, right);
                left++;
                right--;
            }
            else
            {
                right--;
            }
        }
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArr(int[] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
