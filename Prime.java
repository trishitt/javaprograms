import java.util.*;
class Prime
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a no to check prime no:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f= true;
        
        for(int i=2; i<n;i++)
        {
            if(n%i==0)
            f= false;
            break;
        }
        if(f)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}