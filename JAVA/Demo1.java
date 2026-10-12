import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) { 
        //计算BMI值
        Scanner sc = new Scanner(System.in);       
        System.out.println("请输入你的体重");
        double weight = sc.nextDouble();
        System.out.println("请输入你的身高");
        double high = sc.nextDouble();
        double BMI = weight / (high * high);
        System.out.printf("你的BMI值为%.2f", BMI);

        
    }
}