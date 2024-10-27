import java.util.*;
public class frame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        int total_cost=(n+m+n+m)*x;
        System.out.println(total_cost);
    }
}
