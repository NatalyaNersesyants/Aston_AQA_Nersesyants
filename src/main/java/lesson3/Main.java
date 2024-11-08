package lesson3;

public class Main extends Lesson_3 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        System.out.println(isSumInRange(5, 7));
        printPositiveOrNegative(-3);
        System.out.println(isPositive(5));

        printStringNTimes("Hello", 3);
        System.out.println(isLeapYear(2024));

        int[] binaryArray = {1, 0, 1, 0, 1, 0, 1};
        invertArray(binaryArray);
        printArray(binaryArray);

        int[] filledArray = fillArray();
        printArray(filledArray);

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(array);
        printArray(array);

        int[][] diagonalArray = fillDiagonal(5);
        print2DArray(diagonalArray);

        int[] initializedArray = createArray(10, 5);
        printArray(initializedArray);
    }
}