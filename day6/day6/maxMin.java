public class maxMin
{
    public static void main(String[] args)
    {
        int[] arr = {10, 28, 89, 57};

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++)
        {

            if(arr[i] > max)
            {
                max = arr[i];
            }

            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}