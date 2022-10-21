package maxElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxElement {
    private final List<Integer> friendsList = new ArrayList();
    private final Stack<Integer> elementsStack = new Stack();

    public MaxElement() {
    }

    public void addElement(int a) {
        if (this.friendsList.isEmpty()) {
            this.friendsList.add(a);
            this.elementsStack.push(a);
        } else {
            this.friendsList.add(a);
            this.elementsStack.push(Math.max(a, this.getMax()));
        }
    }

    public void removeLast() {
        this.friendsList.remove(this.size() - 1);
        this.elementsStack.pop();
    }

    public int getLast() {
        return (Integer)this.friendsList.get(this.size() - 1);
    }

    public int getMax() {
        return (Integer)this.elementsStack.peek();
    }

    public int size() {
        return this.friendsList.size();
    }

    public boolean isEmpty() {
        return this.friendsList.isEmpty();
    }
}

