class Char
{
public static void main(String [] args)
{
    char ch= 'a';
    int num=26;
    for(int i=0; i<=num ; i++)
    {
        int alphabet = 65;
        for(int j=0; j<=i; j++)
        {
            System.out.print((char) (alphabet + j) + " ");
            
        }
        System.out.println();
    }
}
}