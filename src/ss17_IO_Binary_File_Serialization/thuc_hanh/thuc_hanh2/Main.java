package ss17_IO_Binary_File_Serialization.thuc_hanh.thuc_hanh2;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromfile(String path) {
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nguyễn Văn A", "USA"));
        students.add(new Student(2, "Nguyễn Văn B", "USA"));
        students.add(new Student(3, "Nguyễn Văn C", "Việt Nam"));
        students.add(new Student(4, "Nguyễn Văn D", "USA"));
        students.add(new Student(5, "Nguyễn Văn G", "Việt Nam"));
        students.add(new Student(6,"Nguyễn Văn E ","Viêt Nam"));
        writeToFile("student.txt", students);
        List<Student> students1 = readDataFromfile("student.txt");
        for (Student student : students1) {
            System.out.println(student);
        }
    }
}
