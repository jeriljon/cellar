package d.collections.arrays;

public class OrderedPair<E extends Comparable<E>> {

    public static void main(String[] args) {
        OrderedPair<String> ops = new OrderedPair<>("Alice", "Bob");
        OrderedPair<StringBuilder> opsb = new OrderedPair<>(new StringBuilder("Alice"), new StringBuilder("Bob"));
    }

    private E left, right;

    public OrderedPair(E left, E right) {
        this.left = left;
        this.right = right;
    }

    public void order() {
        if (left.compareTo(right) > 0) {
            E temp = left;
            left = right;
            right = temp;

        }
    }


}
