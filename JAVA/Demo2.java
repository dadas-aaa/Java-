import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数");
        int number = sc.nextInt();
        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;
        System.out.printf("百位数为%d,十位数为%d,个位数为%d", a, b, c);

    }
}
