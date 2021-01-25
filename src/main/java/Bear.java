public class Bear {

    private String name;
    private int age;
    private double weight;

    // constructor
    public Bear(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String newName) {
        this.name = newName;
    }


    // getter method
    public int getAge() {
        return age;
    }

    // setter method
    public void setAge(int newAge) {
        this.age = newAge;
    }


    // getter method
    public double getWeight() {
        return weight;
    }

    // setter method
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
}
