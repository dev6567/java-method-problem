import java.util.*;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int num,int div) {
        return new int[]{num%div,num/div};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int div=sc.nextInt();
        int[] res=findRemainderAndQuotient(num,div);
        System.out.println("Remainder: "+res[0]+", Quotient: "+res[1]);
    }
}
