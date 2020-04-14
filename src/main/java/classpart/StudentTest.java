package classpart;

public class StudentTest {

    public static void main(String[] args) {

        Student studentKim = new Student(20202020,"김파이썬");
//        studentKim.studentName = "김코딩";
//        studentKim.address = "서울";
//        studentKim.studentId = 20208888;

        studentKim.showStudentInfo();
        System.out.println(studentKim.getStudentName());
        System.out.println();


        Student studentLee = new Student("김구라");
//        studentLee.studentName = "이자바";
//        studentLee.address = "경기도";
//        studentLee.studentId = 20207777;

        studentLee.showStudentInfo();
        System.out.println(studentLee.getStudentName());
        System.out.println();
    }
}
