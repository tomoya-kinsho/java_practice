import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("一つ目の整数を入力してください");
        int num1 = scan.nextInt();
        System.out.println("2つ目の整数を入力してください");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
