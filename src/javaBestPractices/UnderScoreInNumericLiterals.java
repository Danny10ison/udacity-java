package javaBestPractices;

public class UnderScoreInNumericLiterals {
    public static void main(String[] args) {
        // bad
        int bmaxUploadSize = 20971520;
        long baccountBalance = 1000000000000L;
        float bpi = 3.141592653589F;

        // better, readability
        int maxUploadSize = 20_971_520;
        long accountBalance = 1_000_000_000_000L;
        float pi = 3.141_592_653_589F;
    }
}
