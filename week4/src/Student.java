public class Student {
    String name = "N.A";
    double grade = 0.0;
    int payGrade = 1;

    Student(String nm, double grd, int pay){
        this.name = nm;
        this.grade = grd;
        this.payGrade = pay;
    }

    public boolean basePass(){
        return ((this.grade >= 3.5) && (this.payGrade <= 5));
    }

    public boolean isBetter(Student other)
    {
        boolean winner = false;

        if (this.grade > other.grade)
        {
            winner = true;
        }
        else if (this.grade == other.grade)
        {
            if (this.payGrade < other.payGrade) {
                winner = true;
            }
        }

        return winner;
    }

    public String introduce(){
        return ("이름: " + this.name + "\n학점: " + this.grade + "\n분위: " + this.payGrade);
    }
}
