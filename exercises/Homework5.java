class Monitor{
private int monitorSize;
private String color;
private int power;

Monitor()
{
    this.turnOn();
    this.monitorSize = 24;
    this.color = "Black";
    this.power = 45;
}

void turnOn()
{
    System.out.println("Turning on the monitor");
}
void printInfo()
{
    System.out.println("The Spec of the monitor");
    System.out.println("  Size: " + this.monitorSize + " inch");
    System.out.println("  Color: " + this.color);
    System.out.println("  Power: " + this.power + "W");
}

}

class Computer{
private String cpu;
private int memory;
private int hdd;
private String color;
private int power;

Computer()
{
    this.turnOn();
    this.cpu = "Core i7";
    this.memory = 16;
    this.hdd = 2;
    this.color = "White";
    this.power = 500;
}

void turnOn()
{
    System.out.println("Turning on the computer");
}

void printInfo()
{
    System.out.println("The Spec of the computer");
    System.out.println("  CPU: " + this.cpu);
    System.out.println("  Memory: " + this.memory + "GB");
    System.out.println("  HDD: " + this.hdd + "TB");
    System.out.println("  Color: " + this.color);
    System.out.println("  Power: " + this.power + "W");

}

}

class PersonalComputer{
private Monitor m_monitor;
private Computer m_computer;

PersonalComputer()
{
    this.m_computer = new Computer();
    this.m_monitor = new Monitor();

    this.m_computer.printInfo();
    this.m_monitor.printInfo();
}

}

void main() {
    PersonalComputer computer = new PersonalComputer();
}