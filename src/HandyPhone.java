public class HandyPhone extends Phone{
    String mailAdress;

    void mail(String to) {
        System.out.println(mailAdress + "から" + to + "へ電話しました");
    }
}
