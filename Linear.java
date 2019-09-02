class Linear
{
    public static void main(String [] args)
    {
        int arr[] = {2,3,4,65,32,3,4,5};
        int item= 33;
        int temp=0;
        for(int i=0; i<arr.length;i++)
        {
            if(item==arr[i])
            {
                System.out.println(i);
                temp++;
            }
       
            }
            if(temp==0)
            {
                System.out.println("Not in the list:");
            }
        }
    }    
