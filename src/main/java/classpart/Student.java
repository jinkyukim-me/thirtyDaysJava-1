package classpart;

public class Student {

    public int studentId;
    public String studentName;
    public String address;

    public Student(String name) {
        studentName = name;
    }


    public Student(int id, String name) {
        studentId = id;
        studentName = name;
        address = "주소 없음";
    }

    public void showStudentInfo() {
//        System.out.println(studentName + "," + address);
        System.out.println("이름: " + studentName);
        System.out.println("주소: " + address);
        System.out.println("ID: " + studentId);
    }

    public String getStudentName() {
        return studentName;
    }

}
