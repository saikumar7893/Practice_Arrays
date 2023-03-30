import java.util.*;
class LongestPrime
{
     public static boolean isprime(int n)
       {
           if(n<=1)
           return false;
           
               for(int i=2;i<n/2;i++)
               {
                   if(n%i==0)
                   return false;
               }
                return true;
               
           }
           
     
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int maxprime=0;
        System.out.println("enter the n value");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array Elemeents");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(isprime(a[i]))
            {
                if(a[i]>maxprime)
                {
                    maxprime=a[i];
                }
            }
        }
        if(maxprime==0)
        System.out.println("No prime in the array");
        else
        System.out.println("Longest Prime is"+maxprime);
        
      
}
}
