class Student {

    String name;
}

class Main {

    static void test(Student s) {

        s.name = "Rahul";

        s = new Student();

        s.name = "Amit";
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Om";

        test(student);

        System.out.println(student.name);
    }
}