package java2.hw2;

public class ArraySum {
    public int calc(String[][] values) {
        checkSizeCondition(values);

        for (int i = 0; i < values.length; i++) {
            checkSizeCondition(values[i]);
        }

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            String.format("Array[%s][%s] contains non-parsable value: %s", i, j, values[i][j]),
                            e
                    );
                }
            }
        }

        return sum;
    }

    private void checkSizeCondition(String[][] values) {
        if (values.length != 4) {
            throw new MyArraySizeException("Array should be 4-size");
        }
    }

    private void checkSizeCondition(String[] values) {
        if (values.length != 4) {
            throw new MyArraySizeException("Array should be 4-size");
        }
    }
}
