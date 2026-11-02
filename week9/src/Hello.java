/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
package com.my.hello;

class Hello { // public이 없음에 주의
    String toWhom = "world";

    public Hello() { }
    public Hello(String toWhom) { this.toWhom = toWhom; }
    public void sayHello() { System.out.printf("hello %s!", toWhom); }
}