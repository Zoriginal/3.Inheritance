package A3Inheritance.A2Exersises.A6Animals;

public class Kitten extends Cat{

    private static final String GENDER = "Female";

    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
