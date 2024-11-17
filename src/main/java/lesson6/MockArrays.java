package lesson6;

public class MockArrays {
    private static final String[][] array = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };

    private static final String[][] arrayWithExternalLengthError = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
    };

    private static final String[][] arrayWithInternalLengthError = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15"}
    };

    private static final String[][] arrayWithDataError = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "error"}
    };

    public static String[][] getMockArrayByType(String type) {
        return switch (type) {
            case "validArray" -> array;
            case "invalidArrayWithExternalLengthError" -> arrayWithExternalLengthError;
            case "invalidArrayWithInternalLengthError" -> arrayWithInternalLengthError;
            case "invalidArrayWithData" -> arrayWithDataError;
            default -> new String[0][0];
        };
    }
}
