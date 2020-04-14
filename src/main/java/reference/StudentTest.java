package reference;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student(2020, "김자바");
        studentLee.setKoreaSubject("국어", 90);
        studentLee.setMathSubject("수학", 88);

        Student studentKim = new Student(3030, "박파이썬");
        studentKim.setKoreaSubject("국어", 77);
        studentKim.setMathSubject("수학", 94);

        studentLee.showStudentScore();
        studentKim.showStudentScore();


    }
}
