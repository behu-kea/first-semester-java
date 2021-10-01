public class NumberCypher {
    public static String alphabeat = "abcdefghijklmnopqrstxyzvwæøå";
    public static void main(String[] args) {

    }

    public static int[] numberCypherEncode(String message) {
        int[] numbers = {1,2};

        return numbers;
    }

    public int getIndexFromCharacter(char character) {
        // We plus one since its not exactly the index but the number in the alphabeat
        int characterIndex = alphabeat.indexOf(character) + 1;

        return characterIndex;
    }
}
