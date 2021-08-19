public class CodeSnippet2 {

    public Array() {
        String[] strs = IntStream.range(0, 15)  // 15 is the size
           .mapToObj(i -> Integer.toString(i))
           .toArray(String[]::new);
    }     
}
