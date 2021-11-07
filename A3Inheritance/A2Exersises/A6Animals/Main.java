package A3Inheritance.A2Exersises.A6Animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Animal> animals = new LinkedList<>();

        while (!input.equals("Beast!")){
            String[] data = scan.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            String gender = data[2];

            try {
                switch (input){
                    case "Dog":
                        Animal dog = new Dog(name,age,gender);
                        animals.add(dog);
                        break;
                    case "Cat":
                        Animal cat = new Cat(name,age,gender);
                        animals.add(cat);
                        break;
                    case "Frog":
                        Animal frog = new Frog(name,age,gender);
                        animals.add(frog);
                        break;
                    case "Kitten":
                        Animal kitten = new Kitten(name,age);
                        animals.add(kitten);
                        break;
                    case "Tomcat":
                        Animal tomcat = new Tomcat(name,age);
                        animals.add(tomcat);
                        break;

                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            input = scan.nextLine();
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
