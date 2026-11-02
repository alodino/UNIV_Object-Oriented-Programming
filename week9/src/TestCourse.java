/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestCourse {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("김복동", "GB112", "bk32@ac.kr");
        Course oo1 = new Course(lecturer, "GB111");
        Student s1 = new Student("202011111", "jsl");
        Student s2 = new Student("202011112", "bdk");
        Student s3 = new Student("202011112", "cho");

        oo1.enroll(s1);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s2);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s3);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.drop(s2);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.printEnrolled();
    }
}