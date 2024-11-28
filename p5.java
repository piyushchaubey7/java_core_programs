import java.util.Arrays;
public class p5
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        int rotations = 2; // Number of rotations

        System.out.println("Original Array: " + Arrays.toString(array));
        leftRotate(array, rotations);
        System.out.println("Array after " + rotations + " left rotations: " + Arrays.toString(array));
    }

    public static void leftRotate(int[] arr, int d)
    {
        int n = arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

