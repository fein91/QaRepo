public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzString("str"));
    }

    public static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
        if (str.startsWith("f")) return "Fizz";
        if (str.endsWith("b")) return "Buzz";
        return str;
    }
}
