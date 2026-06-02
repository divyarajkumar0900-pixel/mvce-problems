 public class missingNumSeq
{
    public static void main(String[] args)
    {
        int sum=0;
        int[] arr={1,2,3,5 };
        int n=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(arr[i]>n)
            {
                n=arr[i];
            }

        }
        int expect=n*((n+1)/2);
        int diff=expect-sum;
        System.err.println(diff);
    }
}