public class CodeSnippet1 {
    public static void resetValues(double[] values) {
        int len = values.length;
        if (len > 0) {
            values[0] = 0.0;
        }
        for (int i = 1; i < len; i += i) {
            System.arraycopy(values, 0, values, i, ((len - i) < i) ? (len - i) : i);
        }
    }
}
