package reference;

public class Student {

    int studentID;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int id, String name) {

        studentID = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showStudentScore() {
        int total = korea.score + math.score;
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
    }

    /*
    이렇게 클래스를 만드는 것은 좋은 설계는 아님
    학생 클래스인지 과목 클래스인지 성격이 모호
     */
//    int koreaScore;
//    int mathScore;
//    int engScore;
//
//    String koreaName;
//    String mathName;
//    String engName;
}
