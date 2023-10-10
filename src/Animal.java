public class Animal {
    private int numberOfLegs;
    private int numberOfEyes;
    private String name;

    public void printAnimal(){
        System.out.println(this);
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public String getName() {
        return name;
    }

    public Animal(int numberOfLegs, int numberOfEyes, String name) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + "\n" + numberOfLegs + " láb" + numberOfEyes + " szem, ";
    }
}
