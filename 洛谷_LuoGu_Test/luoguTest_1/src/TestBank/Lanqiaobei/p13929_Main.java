package TestBank.Lanqiaobei;

public class p13929_Main {
    public static void main(String[] args) {
        int ans = 0;
        for (int len=4; len<=10; len++)
        {
            int half = (len % 2 == 0) ? len/2 : len/2+1;
            // 10 --- 99
            int start = (int) Math.pow(10, half-1);
            int end = start * 10;
            for (int x=start; x<end; x++)
            {

            }
        }
    }
    public static boolean BigOrSmall(char[] arr) {
        boolean p = false;
        for (int i=0; i<Math.ceil(arr.length/2); i++)
        {
            p = arr[i] < arr[i+1];
            if (p==false) break;
        }
        return p;
    }
}
