package d.collections.arrays;

import java.time.LocalDate;

public class Pair<E> {

    private E left;
    private E right;

    public Pair(E left, E right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public void setRight(E right) {
        this.right = right;
    }

}


class UsePair {

    public static void main(String[] args) {
        Pair<String> ps = new Pair<>("Hi", "Hello");
        String cn = ps.getLeft();
        ps.setRight("Bonjour");
        System.out.println("cn: " + cn);
        Pair<LocalDate> pld = new Pair<>(LocalDate.now(), LocalDate.now().plusDays(1));
        System.out.println("pld: " + pld.getLeft() + ", " + pld.toString());

    }

}



