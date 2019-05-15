public class Lesson8_1 {
    public static void main(String[] args) {
        double result = warizan(2.111, 4.2222);
        String years = makeDate(1994, 10, 23);
        boolean gouhi = gouhi(80);
        boolean uruu = uruu(1994);
        int[] array = { 1, 4, 3, 3, 3 };
        int sum = sum(array);
        String[] test = solution(234);
        System.out.println(result);
        System.out.println(years);
        System.out.println(gouhi);
        System.out.println(uruu);
        System.out.println(sum);


        System.out.println(test[0]);

    }

    static String[] solution(int x) {
        String str = Integer.toString(x);
        String [] str_array = str.split("");
        return str_array;
    }

    static double warizan(double a, double b) {
        double result = a / b;
        return result;
    }

    static String makeDate(int year, int mon, int days) {
        return year + "年" + mon + "月" + days + "日";
    }

    static boolean gouhi(int score) {
        if(score >= 70) {
            return true;
        } else {
            return false;
        }
    }

    static boolean uruu(int year) {
        if(year % 400 == 0) {
            return true;
        } else if (year % 100 != 0 && year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        return sum;
    }
}
