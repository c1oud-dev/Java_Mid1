package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
    }
}

/**
 * 원래는 hello java가 나와야 하는데 hello만 나왔다.
 * 이유는?
 */
