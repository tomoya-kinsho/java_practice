import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("英語の点数");
        int num1 = scan.nextInt();
        System.out.println("国語の点数");
        int num2 = scan.nextInt();
        System.out.println("数学の点数");
        int num3 = scan.nextInt();
        int avarage = (num1 + num2 + num3) / 3;
        System.out.println("平均点：" + avarage);

    }
}x
