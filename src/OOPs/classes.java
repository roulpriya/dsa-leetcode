package OOPs;

public class classes  {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student priya = new Student();
        System.out.println(priya.rno);
        System.out.println(priya.name);
        System.out.println(priya.marks);
    }
    static class Student {
        int rno;
        String name;
        float marks;
//this initia
        Student () {
            this.rno = 13;
            this.name = "Priya";
            this.marks = 12;
        }
    }
}
