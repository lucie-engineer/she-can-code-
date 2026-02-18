//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Integer[] numbers1 = {1, 2, 3};
        Integer[] numbers2 = {4, 5, 6};

        Integer[] mergedNumbers = GenericArrayUtil.mergeArrays(numbers1, numbers2);

        System.out.println("Merged Integer array:");
        for (Integer num : mergedNumbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        String[] words1 = {"Hello", "World"};
        String[] words2 = {"Java", "Generics"};

        String[] mergedWords = GenericArrayUtil.mergeArrays(words1, words2);

        System.out.println("Merged String array:");
        for (String word : mergedWords) {
            System.out.print(word + " ");
        }
    }
}
