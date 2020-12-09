package array;

public class MaxAndMinElement {
    public static void main(String[] args)
    {
        int[] arr = {4,2,8,10,1};
        int max = arr[0];
        int min = arr[1];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Max element = " + max);
        System.out.println("Min element = " + min);
    }
}
