class Insertion
{
    public static void main(String [] args)
    {
        int  arr[] = { 2,1,3,7,2,5,4,34};
        int temp;
        int j=0;
        for( int i=1; i< arr.length; i++)
      
            {
                j=i;
                temp= arr[i];
                while(j>0 && arr[j-1]> temp)
                {
                    arr[j]= arr[j-1];
                    j--;
                }
                arr[j]= temp;
            }
        for(int c: arr)
        {
            System.out.print(c+ " ");
        }
    }    
}