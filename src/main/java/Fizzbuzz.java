public class Fizzbuzz {
    public static String compute(int i) {
        if (i == 0) return String.valueOf(i);
        else if (i % 3 == 0 && i % 5 == 0) return "fizzbuzz";
        else if (i % 3 == 0) return "fizz";
        else if (i % 5 == 0) return "buzz";
        else return String.valueOf(i);
    }
}
