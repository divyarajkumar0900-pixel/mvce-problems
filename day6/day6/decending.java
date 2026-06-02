public class decending
{
    public static void main(String[] args)
    {
        int[] arr={10 , 28 ,89 ,57};
        
        for(int i=0;i<arr.length/2;i++)
        {
            int i2=arr.length-i-1;
            int temp=arr[i2];
            arr[i2]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }
        
        
        
        
    }
}