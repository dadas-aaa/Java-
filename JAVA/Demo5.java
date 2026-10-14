import java.util.Scanner;

public class Demo5 {
    //游戏人物血条
    public static void main(String[] args) {
        //初始200点血
        int life = 200;
        //受到x点伤害
        Scanner sc = new Scanner(System.in);
        System.out.println("受到的伤害为");
        int hurt = sc.nextInt();
        life = life - hurt;
        if (life<=1) {
            life = 1;
        }
        System.out.println("当前人物的血量是"+life);
        //治疗生命
        System.out.println("受到的治疗为");
        int add = sc.nextInt();
        life = life + add;
        if (life>=200) {
            life = 200;
        }
        System.out.println("当前人物的血量是"+life);

    }
}
