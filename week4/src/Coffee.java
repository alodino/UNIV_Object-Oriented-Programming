public class Coffee {
    String origin = "N/A";
    String grade = "N/A";
    Integer degreeOfRoast = 0;

    Coffee(String org, String grd){
        this.origin = org;
        this.grade = grd;
    }

    private String fullName()
    {
        return (this.origin + " " + this.grade);
    }

    public void roast(int deg)
    {
        System.out.println("roasting ... " + this.fullName());
        this.degreeOfRoast = deg;
    }

    public void grind()
    {
        System.out.println("grinding ... degree of roast is " + this.degreeOfRoast);
    }

    public void brew()
    {
        System.out.println("brewed   ... " + this.fullName());
    }

}
