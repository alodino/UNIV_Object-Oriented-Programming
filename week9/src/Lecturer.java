/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Lecturer {
    private String email;
    private String name;
    private String room;

    public Lecturer(String name, String room, String email) {
        this.room = room;
        this.name = name;
        this.email = email;
    }
    public String getEmail() { return email; }
    public String getName() { return name; }
    public String getRoom() { return room; }
}