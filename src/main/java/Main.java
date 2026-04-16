public class Main {
    public static void main(String[] agrs) {

        String[][] correct = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidData = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "X", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidData1 = {
                {"1", "2", "3"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] invalidData2 = {
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] wrongSizeArray = {
                {"1", "2"},
                {"3", "4"}
        };
        try {
            int result = Processor.processArray(correct);
            System.out.println("Сумма = " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n Выход за пределы массива:");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e);
        }
    }
}
