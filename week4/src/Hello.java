public class Hello {
    String toWhom = "World";

    Hello(){
        System.out.println("기본 생성자");
    }
    Hello(String from){
        this.setWhom(from);
        System.out.println("문자 생성자 : " + from);
    }

    void setWhom(String whom)
    {
        this.toWhom = whom;
    }
    void sayHello()
    {
        System.out.println("Hello " + toWhom);
    }
}
