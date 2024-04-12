// Create a program that concatenates a small string ("a")
// to itself 10000 times using String, StringBuilder, and StringBuffer.
// Measure and compare the time taken for each approach to complete,
// illustrating the performance impact of immutable versus mutable string types.

public class Main {
    public static void main(String[] args) {
        Main.String();
        Main.StringBuilder();
        Main.StringBuffer();
    }

    public static void String() {
        long startTime = System.currentTimeMillis();
        String r = "";
        for (int i = 0; i < 10000; i++) {
            r += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String: " + (endTime - startTime) + "ms");
    }

    public static void StringBuilder() {
        long startTime = System.currentTimeMillis();
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            r.append("a");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime) + "ms");
    }

    public static void StringBuffer() {
        long startTime = System.currentTimeMillis();
        StringBuffer r = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            r.append("a");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime - startTime) + "ms");
    }
}


