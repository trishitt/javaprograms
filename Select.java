class Select
{
    public static void main(String [] args)
    {
        int arr[] = {2,1,3,5};
        int min;
        int temp=0;
        for(int i =0; i<arr.length; i++)
        {
            min=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]< arr[min])
                {
                  min=j;
                }
                temp = arr[i];
                arr[i]= arr[min];
                arr[min] = temp;
            }
        }
        for(int c: arr)
        {
            System.out.print(c+ " ");
        }
    }
}