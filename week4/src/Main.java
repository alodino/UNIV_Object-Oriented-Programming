void main()
{
//    Coffee kenya = new Coffee("kenya", "AA");
//    kenya.roast(60);
//    kenya.grind();
//    kenya.brew();
//
//    Coffee brazil = new Coffee("brazil", "BB");
//    brazil.roast(100);
//    brazil.grind();
//    brazil.brew();
//
//    Hello[] hArray = new Hello[3];
//    hArray[0] = new Hello();
//    hArray[1] = new Hello("홍길동");
//    hArray[2] = new Hello("허균");
//
//    hArray[0].sayHello();
//    hArray[1].sayHello();
//    hArray[2].sayHello();

//    Student kimks = new Student("김규상", 4.1, 3);
//    Student kimmj = new Student("김민재", 3.71, 5);
//    Student kimyh = new Student("김용하", 3.93, 7);
//
//    Student[] sArray = {kimks, kimmj, kimyh};
//
//    Student current = new Student("N/A", 0.0, 10);
//
//    for (Student cur : sArray)
//    {
//        if (!cur.basePass()) continue;
//        else if (cur.isBetter(current)) current = cur;
//    }
//
//    System.out.println("장학생 선발 완료\n" + current.introduce());

    Scanner input = new Scanner(System.in);

    String ticket = input.next();

    if (ticket.equals("prime"))
    {
        System.out.println("Prime Ticket : 50000 won");
    }
    else if (ticket.equals("standard"))
    {
        System.out.println("Standard Ticket : 10000 won");
    }
    else if (ticket.equals("economy"))
    {
        System.out.println("Economy Ticket : 5000 won");
    }
    else
    {
        System.out.println("Invalid Ticket");
    }

}
