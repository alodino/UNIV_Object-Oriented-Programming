import java.util.Map;
import java.util.HashMap;

class TestCountChars{
    String str;
    TestCountChars(String s)
    {
        this.str = s;
    }

    Map<Character, Integer> countChars()
    {
        Map<Character, Integer> out = new HashMap<Character, Integer>();
        char[] letters = str.toCharArray();

        for (char c : letters)
        {
            if (out.containsKey(c))
            {
                out.put(c, out.get(c) + 1);
            }
            else
            {
                out.put(c, 1);
            }
        }
        return out;
    }

    public static void main(String[] args)
    {
        TestCountChars t = new TestCountChars("Sangmyung University");
        Map<Character, Integer> c = t.countChars();
        System.out.println(c);
    }
}