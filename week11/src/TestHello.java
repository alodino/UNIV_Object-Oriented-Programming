class TestHello {
    public static void main(String[] args) {
        Hello[] hArray = new Hello[3];
        hArray[0] = new HelloFrench("js1");
        hArray[1] = new HelloSpanish("js2");
        hArray[2] = new HelloKorean("js3");
        for (Hello hello : hArray) { hello.sayHello(); }
    }
}