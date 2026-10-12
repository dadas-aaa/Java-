import java.util.Scanner;

public class Demo3 {
//时间转换
    public static void main(String[] args) {
        // int seconds = 3661; // 示例秒数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int allSeconds = seconds % 60;
        int second = allSeconds % 60;
        System.out.println("时间转换结果："+hours + "小时" + minutes + "分钟" + second + "秒");
    }
}
