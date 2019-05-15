package abc;

public class Student {
    int no;
    String name;

    Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void showInfo() {
        System.out.println(no + ":" + name);
    }
}
