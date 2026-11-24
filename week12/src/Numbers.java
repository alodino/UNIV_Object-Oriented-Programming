import java.util.ArrayList;

class Numbers {

    private ArrayList<Integer> list = new ArrayList<Integer>();
    private int min;
    private int max;

    public Numbers(int min, int max)
    {
        this.min = min;
        this.max = max;
    }

    public void setUp ()
    {
        for (int x = min; x <= max; x++)
        {
            if ((x % 4 == 0) && (x % 5 != 0))
            {
                list.add(x);
            }
        }
    }

    public int sumUp()
    {
        int sum = 0;

        for (int i : list)
        {
            System.out.println(i);
            sum += i;
        }

        return sum;
    }
}

void main()
{
    Numbers n = new Numbers(1, 100);
    n.setUp();
    n.sumUp();
}
