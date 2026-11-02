/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Person {
    private String name;
    private String phone;

    public Person(String n, String ph) {
        name = n;
        phone = ph;
    }
    public String getName() { return name; }
    public String getPhoneNumber() { return phone; }
    public String toString() {
        return "Name: " + name + " Phone: " + phone;
    }
}