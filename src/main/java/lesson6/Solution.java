package lesson6;

public class Solution {
    static int requiredExternalLength = 4;
    static int requiredInternalLength = 4;

    public static void main(String[] args) {
        String[][][] arrays = {
                MockArrays.getMockArrayByType("validArray"),
                MockArrays.getMockArrayByType("invalidArrayWithExternalLengthError"),
                MockArrays.getMockArrayByType("invalidArrayWithInternalLengthError"),
                MockArrays.getMockArrayByType("invalidArrayWithData"),
        };

        for (String[][] array : arrays) {
            try {
                System.out.println(calculateArrayItems(array));
            } catch (MyArraySizeException | MyArrayDataException error) {
                System.err.println("Ошибка: " + error.getMessage());
            }
        }
    }

    public static int calculateArrayItems(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != requiredExternalLength) {
            throw new MyArraySizeException("Длина внешнего массива должна быть равна " + requiredExternalLength);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != requiredInternalLength) {
                throw new MyArraySizeException("Длина внутренного массива должна быть равна " + requiredInternalLength);
            }

            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException error) {
                    throw new MyArrayDataException("исключение при преобразовании строки '" + array[i][j] + "' к числу - по адресу " + "[" + i  + "]" + "[" + j + "]");
                }
            }
        }

        return sum;
    }
}
