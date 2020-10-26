public class Main {

    public Main() {
        // test solutions here
        ValidPalandromeSolution sol = new ValidPalandromeSolution();
        String testStr = "Marge, let's \"[went].\" I await {news} telegram.";
        System.out.println(sol.isPalindrome(testStr));
    }

    public static void main(String[] args) {
        new Main();
    }
}
