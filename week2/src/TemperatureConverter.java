import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("[1] 화씨 -> 섭씨\n" +
                         "[2] 섭씨 -> 화씨\n");

        var validFlag = false;
        while (!validFlag)
        {
            System.out.print("변환 종류 : ");
            var input = sc.nextInt();
            if (input == 1)
            {
                validFlag = true;
                System.out.println("[1] 화씨 -> 섭씨");
                System.out.print("화씨 온도를 입력하세요 : ");

                float fahrenheit = sc.nextFloat();
                float celsius = (5f/9f) * (fahrenheit-32f);

                System.out.printf("입력된 온도 : %.1f\n", fahrenheit);
                System.out.printf("변환된 온도 : %.1f\n", celsius);
            }
            else if (input == 2)
            {
                validFlag = true;
                System.out.println("[2] 섭씨 -> 화씨");
                System.out.print("섭씨 온도를 입력하세요 : ");

                float celsius = sc.nextFloat();
                float fahrenheit = celsius * (9f/5f) + 32f;

                System.out.printf("입력된 온도 : %.1f\n", celsius);
                System.out.printf("변환된 온도 : %.1f\n", fahrenheit);
            }
            else
            {
                System.out.println("잘못된 입력입니다. 다시 입력하세요");
            }
        }



    }
}
