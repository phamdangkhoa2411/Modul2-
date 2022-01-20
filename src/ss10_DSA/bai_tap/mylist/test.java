package ss10_DSA.bai_tap.mylist;

import ss10_DSA.bai_tap.mylist.Arraylistmodel.Student;


public class test {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Student a = new Student(1, " Truong_Cow");
        Student b = new Student(2, " Khoa_Winner");
        Student c = new Student(3, " Phuong_Cong_tua");
        Student d = new Student(4, " Hien_Dan");
        Student e = new Student(5, " Hai_Spring");



        student.add(a);
        student.add(b);
        student.add(c);
        student.add(d);
        student.add(e);
        for (int i = 0; i < student.getSize(); i++) {
            System.out.println(student.elements[i]);
        }

    }
}
