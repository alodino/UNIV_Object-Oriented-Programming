class HelloFrench extends Hello {
    public HelloFrench(String toWhom) { super(toWhom); }
    @Override
    public void sayHello() { System.out.println("Bonjour " + getWhom()); }
}

class HelloSpanish extends Hello {
    public HelloSpanish(String toWhom) { super(toWhom); }
    @Override
    public void sayHello() {
        System.out.println("Hola a todos " + getWhom());
    }
}

class HelloKorean extends Hello {
    public HelloKorean(String toWhom) { super(toWhom); }
    @Override
    public void sayHello() {
        System.out.println("안녕하세요 " + getWhom());
    }
}