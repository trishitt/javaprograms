class Swapnos
{
    public static void main(String [] args)
    {
        int a=10;
        int b= 11;

        a = a*b; // a= a+b;
        b= a/b; // b= a-b;
        a= a/b; // a= a-b;

        System.out.println(a +" " +b);
    }
}