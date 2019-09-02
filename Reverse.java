class Reverse
{
    public static void main(String [] args)
    {
        int num=65;
        int r=0;
        int sum=0;

        while(num>0)
        {
            r= num%10;
            sum= (sum*10)+r;
            num= num/10;
        }
        System.out.println(sum);
    }    
}