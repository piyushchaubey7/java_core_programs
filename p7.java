public class p7
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Elements at even positions:");

        for (int i = 1; i < array.length; i += 2)
        {
            System.out.print(array[i] + " ");
        }
    }
}
