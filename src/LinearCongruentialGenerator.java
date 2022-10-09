public class LinearCongruentialGenerator {

    private final Integer multiplier = 5;
    private final Integer increment = 12;
    private final Integer mod = 23;
    private final Integer seed = 4;

    public String encode(String message) {

        StringBuilder encodedMessage = new StringBuilder();
        int curElem = seed;
        for (int i = 0; i < message.length(); i++) {
            char symbol = message.charAt(i);
            encodedMessage.append((char)(curElem ^ symbol));
            curElem = (curElem * multiplier + increment) % mod;
        }
        return encodedMessage.toString();
    }

    public String decode(String encodedMessage) {
        return encode(encodedMessage);
    }
}
