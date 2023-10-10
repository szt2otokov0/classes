public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate(){
        System.out.println(this);
    }

    public boolean isCorrectDate(){
        if(year < 0) return false;
        if(month < 1 || month > 12) return false;
        if(day > 31 || day < 1) return false;
        if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) return false;
        if(month == 2 && year % 4 == 0 && day > 29) return false;
        return month != 2 || day <= 28;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year + ". " + month + ". " + day + ".";
    }
}
