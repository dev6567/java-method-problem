import java.util.*;

public class MinMax {
    public static int[] findSmallestAndLargest(int a,int b,int c) {
        int min=Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        return new int[]{min,max};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] res=findSmallestAndLargest(a,b,c);
        System.out.println("Smallest: "+res[0]+", Largest: "+res[1]);
    }
}
