package week1;

public class Student {
    // TODO: khai báo các thuộc tính cho Student
    private String name, id, email, group;

    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return name;
    }
    public String getId (){
        return id;
    }
    public String getEmail (){
        return email;
    }
    public String getGroup (){
        return  group;
    }
    public void setName (String n){
        this.name = n;
    }
    public void setId (String sid) {
        this.id  = sid;
    }
    public  void setEmail (String em){
        this.email = em;
    }
    public  void  setGroup (String nhom) {
        this.group = nhom;
    }





    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.email = "uet@vnu.edu.vn";
        this.group = "“INT22041";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.email = em;
        group = "INT2207";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.email = s.email;
        this.name = s.name;
        this.group = s.group;
        this.id = s.id;
    }

    public void getInfo() {
        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getGroup());
        System.out.println(this.getEmail());
    }
}
