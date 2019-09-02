class Bubble
{
    public static void main(String [] args)
    {
        int arr[] = {2,3,1,4};
        int temp=0;
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j]> arr[j+1])
                {
                    temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
                if(count==0)
                {
                    break;
                }
        }
            for(int c:arr)
            {
                System.out.print(c+ " ");
            }
    }
}