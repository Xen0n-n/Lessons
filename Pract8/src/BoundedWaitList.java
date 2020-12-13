public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {
        if (super.content.size() <= capacity)
            super.add(element);
    }

    public String toString() {
        return capacity + ": " + content.toString();
    }

}