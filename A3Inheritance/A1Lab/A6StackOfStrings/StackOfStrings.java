package A3Inheritance.A1Lab.A6StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {

    private List<String> data;
    private int index = -1;


    public StackOfStrings(){
        this.data = new ArrayList<>();
    }

    public void push(String s) {
        this.data.add(s);
        this.index++;
    }


    public String peek() {
        return this.data.get(this.index);
    }


    public String pop() {
        return this.data.remove(this.index--);

    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
