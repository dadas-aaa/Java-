import java.util.Scanner;

public class maishuiPromblem {
    public static void main(String[] args) {
        int allPoeple, sum, m, type;
        int k = 0;
        sum = 0;
        Scanner sc = new Scanner(System.in);
        //总人数
        allPoeple = sc.nextInt();
        //k>m时要买的水的数量
        m = sc.nextInt();
        type = sc.nextInt();
        //定义ti
        int[] ti = new int[allPoeple];
        //定义pi
        int[] pi = new int[allPoeple];
        for(int i=0; i<allPoeple; i++)
        {
            ti[i] = sc.nextInt();
        }
        for(int i=0; i<allPoeple; i++)
        {
            pi[i] = sc.nextInt();
        }
        for(int i=0; i<allPoeple; i++){
            if (ti[i]==1 && pi[i]==1){
                k++;

            }
        }
        if (k>=m){
            sum = m + allPoeple - k;
        }
        else {
            sum = allPoeple;
        }
        System.out.println(sum);

    }

}
