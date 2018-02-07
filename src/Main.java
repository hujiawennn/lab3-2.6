import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String text = urlToString();
        int count = 1;
        String newtext = text.replaceAll(["[a-zA-Z0-9]", ""]);
        for (int i = 0; i < text.length(); i++) {
            if (newtext[i] == " " || )
        }
    }
}
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}

