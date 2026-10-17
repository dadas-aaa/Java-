public class TuXing_test {
    public static void main(String[] args) {
        //打印平行四边形
        for (int i=1; i<=3; i++) {
            for(int j=i; j<=2; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=5; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------");
        //打印梯形
        for (int i=1; i<=3; i++)
        {
            for(int j=i; j<=2; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=2*i+1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------");
        
        //打印菱形
        for (int i=1; i<=4; i++)
        {
            for(int j=i; j<=3; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=3; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=7-2*i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------");
        //空心菱形
        //打印空格行
        
        for (int i=1; i<=4; i++)
        {
            for (int j=i; j<=3; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++)
            {
                if (k==1 || k==2*i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //打印下半部分
        for (int i=1; i<=3; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=7-2*i; k++)
            {
                if (k==1 || k==7-2*i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
