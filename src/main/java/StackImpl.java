import java.util.ArrayList;
import java.util.List;

public class StackImpl implements Stack {
    private List<Integer> items;

    public StackImpl() {
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override
    public int size() {
        return this.items.size();
    }

    @Override
    public int pop() {
        if (this.items.isEmpty()) throw new EmptyStackException("Cannot pop from an empty stack");
        int lastIdx = this.items.size() - 1;
        return this.items.remove(lastIdx);
    }

    @Override
    public int peek() {
        if (this.items.isEmpty()) throw new EmptyStackException("Cannot pop from an empty stack");
        int lastIdx = this.items.size() - 1;
        return this.items.get(lastIdx);
    }

    @Override
    public void push(int item) {
        this.items.add(item);
    }
}
