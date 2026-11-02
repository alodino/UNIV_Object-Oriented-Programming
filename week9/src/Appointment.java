/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.time.LocalDateTime;

class Appointment {
    private LocalDateTime time;
    private Person person;
    private Place place;

    Appointment(LocalDateTime time, Person person, Place place) {
        this.time = time;
        this.person = person;
        this.place = place;
    }
    public String toString() {
        return "DateTime: " + time.toString() + "\nPerson: "
                + person.toString() + "\nPlace: " + place.toString();
    }
}