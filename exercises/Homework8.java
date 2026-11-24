import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Homework8 {
    public static void main(String[] args)
    {
        Map<String, String> accounts = new HashMap<String, String>();
        accounts.put("myId", "myPass");
        accounts.put("myId2", "myPass2");
        accounts.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            if (!accounts.containsKey(id))
            {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.print("password : ");
            String password = sc.nextLine().trim();

            if (accounts.get(id).equals(password))
            {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }

            System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            System.out.println();
        }
    }
}
