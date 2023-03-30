import java.util.*;
class Sorting
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
     Arrays.sort(a);
      System.out.println("Elements in Ascending  Order");
     for(int i=0;i<n;i++)
     {
         System.out.println(a[i]);
     }
     
     for(int i=0;i<a.length-1;i++)
     {
         for(int j=i+1;j<a.length;j++)
         {
             if(a[i]<a[j])
             {
                 int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
     }
     System.out.println("Elements in descending Order");
     for(int i=0;i<n;i++)
     {
         System.out.println(a[i]);
     }
    }
}
