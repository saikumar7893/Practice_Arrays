
import java.util.*;
class Frequency 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements without duplicates");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the value of m");
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int ele:a)
        {
            hm.put(ele,0);
        }
        for(int ele:b)
        {
            if(hm.containsKey(ele))
            {
                hm.put(ele,hm.get(ele)+1);
            }
        }
        for(int ele:a)
        {
            if(hm.containsKey(ele))
            {
                System.out.println("Frequency of"+ele+":"+hm.get(ele));
            }
        }
        
    }
}
