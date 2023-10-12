public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public void printPerson(){
        System.out.println(this);
    }

    public Person(String firstName, String lastName, int birthYear, int birthMonth, int birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public String toString(){
        return "Vezetéknév: " + lastName + "\nKeresztnév: " + firstName + "\nSzületési dátum: "
                + birthYear + ". " + birthMonth + ". " + birthDay + ".";
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        if(birthMonth > 12 || birthMonth < 1) return;
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        if(birthDay > 31 || birthDay < 1) return;
        if((birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 11) && birthDay > 30) return;
        if(birthMonth == 2 && birthYear % 4 == 0 && birthDay > 29) return;
        if(birthMonth == 2 && birthDay > 28) return;
        this.birthDay = birthDay;
    }
}
