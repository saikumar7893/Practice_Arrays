import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the n value");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array Elemeents");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println("The elements are"+a[i]);
        }
    }
}
