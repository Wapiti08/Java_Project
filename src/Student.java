public class Student extends Person{
//    // Define the class
//    // define the attributes
//    private String name;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    private int age;
//
//    public Student() {
//        System.out.println("方法构造");
//    }
//    public Student(String name) {
//        this.name = name;
//        System.out.println("方法重载");
//    }

//    private String name="child";

    public void study() {
        System.out.println("学生嫁到");
    }

    public void GetStudentName() {
//        String name = "local";
        System.out.println(super.getName());
    }

}
