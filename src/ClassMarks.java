import java.util.Arrays;
import java.util.stream.Stream;

public class ClassMarks {

    public static void main(String[] args) {

        int[] markFive = new int[10];
        int[] markFour = new int[15];
        int[] markThree = new int[15];
        int[] markTwo = new int[10];

        int amountFive = markFive.length;
        int amountFour = markFour.length;
        int amountThree = markThree.length;
        int amountTwo = markTwo.length;

        Arrays.fill(markFive, 5);
        Arrays.fill(markFour,4);
        Arrays.fill(markThree, 3);
        Arrays.fill(markTwo, 2);

        System.out.println("Количество 5-ок за контрольную: " + amountFive);
        System.out.println(Arrays.toString(markFive));

        System.out.println("Количество 4-ок за контрольную: " + amountFour);
        System.out.println(Arrays.toString(markFour));

        System.out.println("Количество 3-ек за контрольную: " + amountThree);
        System.out.println(Arrays.toString(markThree));

        System.out.println("Количество 2-ек за контрольную: " + amountTwo);
        System.out.println(Arrays.toString(markTwo));
    }
}
