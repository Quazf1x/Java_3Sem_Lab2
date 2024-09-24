import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String[] urlsArr = {"http://www.example.com", "http://example.com",
                "Just Text", "http://a.com",
                "https://github.com/ArtemiiK/OOP/blob/main/LR2.md"};
        String regex = "(https?:\\/\\/)?(www\\.)?([a-zA-Z]{2,})(\\.[a-zA-Z]{2,})+(:\\d+)?(\\/[^\\s]*)*(\\#[^\\s]*)?";
        for (String url : urlsArr) {
            boolean isMatch = checkURL(url, regex);
            System.out.println(url + " : " + isMatch);
        }
    }

    public static boolean checkURL(String url, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}