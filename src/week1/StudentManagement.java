package week1;

import com.sun.deploy.panel.DeleteFilesDialog;

import javax.xml.bind.SchemaOutputResolver;

public class StudentManagement {
    Student[] students= new Student[100];
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:kiem tra hai sinh vien co cung lop hay khong
        //return false; // xóa dòng này sau khi cài đặt
        if(s1.getGroup().equals(s2.getGroup())) {
            return true;
        }

        return false;
    }

    void studentsByGroup() {
        // TODO:

        System.out.println();
    }

    void removeStudent(String id) {
        Student s= new Student();
        if(s.getId()== id){
        }
    }

    public static void main(String[] args) {
        // TODO: Thong tin ban than

        Student s= new Student();
        s.setId("17020972");
        s.setName("Phuong");
        s.setGroup("K62 UET");
        s.setEmail("uet@vnu.vn");
        System.out.println("Ten Sinh Vien: " +s.getName());
        s.getInfo();
        /* Cau 8
        Student s = new Student();
        s.getInfo();

        Student s1 = new Student("phuong", "01", "phuong@gmail.com");
        s1.setGroup("K62 UET");
        s1.getInfo();

        Student s2 = new Student(s1);
        s2.getInfo();
        */
//      Student s = new Student();
//      s.getInfo();
        Student s1 = new Student("abc", "01", "abc@gmail.com");
        s1.setGroup("INT22041");
        s1.getInfo();
        Student s2 = new Student("def", "02", "def@gmail.com");
        s2.setGroup("INT22041");
        s2.getInfo();
        Student s3 = new Student("xyz", "03", "xyz@gmail.com");
        s3.setGroup("INT22042");
        s3.getInfo();
        StudentManagement management = new StudentManagement();
        System.out.println("Sinh vien s1 vs sinh vien s2 cung lop: " +management.sameGroup(s1, s2));
        System.out.println("Sinh vien s2 vs sinh vien s3 cung lop: " +management.sameGroup(s2, s3));
        System.out.println("Sinh vien s1 vs sinh vien s3 cung lop: " +management.sameGroup(s1, s3));




    }
}
