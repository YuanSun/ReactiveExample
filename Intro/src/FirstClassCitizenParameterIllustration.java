import java.util.function.Function;

public class FirstClassCitizenParameterIllustration {
    public static void main(String[] args) {

        // Function is passed as parameter
        System.out.println(concatAndTransform("Hello ", "World", (s) -> s.toUpperCase()));

        // Function is passed from a variable
        Function<String, String> transformToLower = s -> s.toLowerCase();
        System.out.println(concatAndTransform("Hello ", "World", transformToLower));
    }

    private static String concatAndTransform(String a, String b, Function<String, String> stringTransform) {
        if(stringTransform != null) {
            a = stringTransform.apply(a);
            b = stringTransform.apply(b);
        }

        return a + b;
    }
}
