package phase_one.lesson_3;

public class Dog {
    String dogName;
    String dogType;
    String dogColor;
    int dogAge;

    public Dog(String dogName, String dogType, String dogColor, int dogAge){
        this.dogName = dogName;
        this.dogType = dogType;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    // Getters
    public String getDogName() {
        return dogName;
    }

    public String getDogType() {
        return dogType;
    }

    public String getDogColor() {
        return dogColor;
    }

    public int getDogAge() {
        return dogAge;
    }

    // Setters

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogType='" + dogType + '\'' +
                ", dogColor='" + dogColor + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }


    public static void main(String[] args) {
        Dog james = new Dog("James", "Poodle", "Red", 7);
        System.out.println(james);
    }
}
