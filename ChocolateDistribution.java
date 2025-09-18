import java.util.*;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int n,int m) {
        return new int[]{n%m,n/m};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] res=findRemainderAndQuotient(n,m);
        System.out.println("Each child gets: "+res[1]+", Remaining: "+res[0]);
    }
}
