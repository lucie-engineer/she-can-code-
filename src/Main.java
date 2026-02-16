//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pair<String, Integer> pair1 = new pair<>("Age", 25);
        System.out.println("Pair 1: " + pair1);

        pair<Integer, String> pair2 = new pair<>(404, "Not Found");
        System.out.println("Pair 2: " + pair2);

    }
}