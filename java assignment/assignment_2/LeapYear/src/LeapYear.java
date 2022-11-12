public class LeapYear {
    double year;
    boolean x=false;

    public LeapYear( double year) {
        this.year=year;
        if(this.year%400==0)
        {
            x=true;
        }
        else if(this.year%100==0&&this.year%400!=0)
        {
            x=false;
        }
        else if(this.year%100!=0&&this.year%4==0)
            x=true;



    }

    public boolean getYear() {
        return x;
    }
}
