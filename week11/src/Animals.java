interface IAnimal
{
public String getName();
default String getSound()
{
    return "squeak!";
}

}

class Pig implements IAnimal{
    public String getName()
    {
        return "Pig";
    }
    public String getSound()
    {
        return "oink";
    }
}

class Cow implements IAnimal{
    @Override
    public String getName() {
         return "Cow";
    }

    @Override
    public String getSound() {
        return "moo";
    }
}

class Chinchillas implements IAnimal{
    @Override
    public String getName()
    {
        return "Chinchillas";
    }
}

class Guinea implements IAnimal{
    @Override
    public String getName()
    {
        return "Guinea";
    }
}

class Hamster implements IAnimal{
    @Override
    public String getName()
    {
        return "Hamster";
    }
}

class Hare implements IAnimal{
    @Override
    public String getName()
    {
        return "Hare";
    }
}

public class Animals {
}
