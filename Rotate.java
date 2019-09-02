class Rotate
{
    public static void main(String [] args)
    {
    int arr[] = {2,3,4,5,6,1};
    int temp;
    int x=arr.length;
    for(int i=0; i<2; i++)
        {
            temp= arr[i];

                for(int j=0; j<x-1; j++)
                {
                    arr[j]= arr[j+1];
                }
            arr[x-1]= temp;
        }
      
        for(int c: arr)
        {
            System.out.print(c + " ");
        }
    }
}
