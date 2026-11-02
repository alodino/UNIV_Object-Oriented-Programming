/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Student {
    private String stNo;
    private String name;

    public Student(String stNo, String name) {
        this.stNo = stNo;
        this.name = name;
    }
    public String getStNo() { return stNo; }
    public String getName() { return name; }
    public String toString() {
        return "Name: " + name + ", Student Number: " + stNo;
    }
}