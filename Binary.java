class Binary
{
    public static void main(String [] args)
    {
        int arr[] = { 1,2,3,4,5,6,7,8};
        int li=0;
        int hi = arr.length-1;
        int mi = (li+hi)/2;
        int item=4;

        while(li<=hi)
        {
            if(arr[mi]== item)
            {
                System.out.println(mi);
                break;
            }
            else if( mi<item)
            {
                li= mi+1;
            }
            else
            {
                hi= mi-1;
            }
            mi=(li+hi)/2;
        }
        if(li>hi)
        {
            System.out.println("Not int the list");
        }
    }    
}