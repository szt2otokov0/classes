public class Main {
    public static void main(String[] args) {
        Person szemely = new Person("John","Doe",1956,1,20);
        szemely.printPerson();
        Date ma = new Date(2023,10,10);
        ma.printDate();
        Animal allat = new Animal(4,2,"macska");
        allat.printAnimal();
    }
}