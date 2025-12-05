public class ajay {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("Inputs: a=" + a + ", b=" + b + ", c=" + c);

        System.out.println("1) If-else method: " + maxIfElse(a, b, c));
        System.out.println("2) Math.max method: " + maxMath(a, b, c));
        System.out.println("3) Ternary operator: " + maxTernary(a, b, c));
        System.out.println("4) Array + sort: " + maxArraySort(a, b, c));
        System.out.println("5) Streams (IntStream): " + maxStream(a, b, c));
        System.out.println("6) Collections.max (boxed): " + maxCollections(a, b, c));
    }

    // 1) Classic if-else comparisons
    public static int maxIfElse(int x, int y, int z) {
        int max = x;
        if (y > max)
            max = y;
        if (z > max)
            max = z;
        return max;
    }

    // 2) Using Math.max
    public static int maxMath(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    // 3) Nested ternary operator
    public static int maxTernary(int x, int y, int z) {
        return (x >= y) ? ((x >= z) ? x : z) : ((y >= z) ? y : z);
    }

    // 4) Put into array and sort
    public static int maxArraySort(int x, int y, int z) {
        int[] arr = new int[] { x, y, z };
        java.util.Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    // 5) Java 8 Streams
    public static int maxStream(int x, int y, int z) {
        return java.util.stream.IntStream.of(x, y, z).max().orElse(Integer.MIN_VALUE);
    }

    // 6) Collections.max with boxed Integers
    public static int maxCollections(int x, int y, int z) {
        java.util.List<Integer> list = java.util.Arrays.asList(x, y, z);
        return java.util.Collections.max(list);
    }
}