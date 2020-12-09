package array;
import java.util.*;

public class UnionIntersectionOfSortedArr {
    public static void main(String[] args)
    {
        int arr1[] = {1, 3, 4, 5, 7, 8};
        int arr2[] = {2, 3, 5, 6};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0, j=0;
        int[] union = new int[n1+n2];
        int countUnion = 0;
        int[] intersection = new int[Math.min(n1,n2)];
        int countIntersection = 0;
        while(i<n1 || j<n2)
        {
            if(i == n1)
            {
                union[countUnion++] = arr2[j++];
            }
            else if(j == n2){
                union[countUnion++] = arr1[i++];
            }
            else
            {
                if(arr1[i] == arr2[j])
                {
                    union[countUnion++] = arr1[i];
                    intersection[countIntersection++] = arr1[i];
                    i++;
                    j++;
                }
                else if(arr1[i] < arr2[j])
                {
                    union[countUnion++] = arr1[i++];
                }
                else
                {
                    union[countUnion++] = arr2[j++];
                }
            }
        }
        System.out.print("Union = ");
        printArr(union, countUnion);
        System.out.print("Intersection = ");
        printArr(intersection, countIntersection);
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
