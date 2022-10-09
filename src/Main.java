public class Main {
    public static void main(String[] args) {
        LinearCongruentialGenerator generator = new LinearCongruentialGenerator();
        String message = "message";

        String encoded = generator.encode(message);
        System.out.println(encoded);
        String decoded = generator.decode(encoded);
        System.out.println(decoded);
    }
}