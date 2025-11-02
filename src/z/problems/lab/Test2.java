package z.problems.lab;

public class Test2 {

    public static void main(String[] args) {
        String txt = """
  a
    b
  c
  """;
        System.out.println("txt: " + txt);
        txt.lines().map(String::length).forEachOrdered(System.out::print);
    }

}
