package calculator.domain;

import calculator.util.DelimiterUtil;

public class StringCalculator {
    public static int run(String value) {
        if (isNullOrBlank(value)) {
            return 0;
        }
        return calculate(value);
    }

    private static int calculate(String value) {
        String[] valueSplit = DelimiterUtil.parseString(value);
        return new Numbers(valueSplit).sum();
    }

    private static boolean isNullOrBlank(String value) {
        return value == null || value.isBlank();
    }
}
