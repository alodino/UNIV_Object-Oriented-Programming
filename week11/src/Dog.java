public class Dog implements Cloneable{
    int age;
    String name;
    String breed;

    public Dog(int age, String name, String breed)
    {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public String getName()  { return this.name; }
    public int getAge() { return this.age; }
    public String getBreed() { return this.breed; }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Dog dog = (Dog) super.clone();

        dog.age = age;
        dog.name = name;
        dog.breed = breed;

        return dog;
    }
}
