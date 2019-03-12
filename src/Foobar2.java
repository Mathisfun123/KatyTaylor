public class Foobar2 {
    public static void main(String[] args) {
        String answer = answer(3);
        System.out.println(answer);

    }
    public static String answer(int n) {
        String primes = "2357111317192329313741434753596167717379838997101103107109113127131137139149151157163167173179181191193197199211223227229233239241251257263";
        return("\"" + primes.substring(n,n+5)+ "\"");
    }
}
