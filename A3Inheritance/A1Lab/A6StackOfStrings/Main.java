package A3Inheritance.A1Lab.A6StackOfStrings;

public class Main {
    public static void main(String[] args) {

        StackOfStrings sos = new StackOfStrings();

        sos.push("o");
        sos.push("t");
        sos.push("th");

        System.out.println(sos.isEmpty());
        System.out.println(sos.peek());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.isEmpty());

    }
}
