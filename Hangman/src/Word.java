
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Word {

    public String getWord() {

        String urlStr = "http://randomword.setgetgo.com/get.php";
        String randomWord = "";

        //keep getting words until we get one that is the correct length
        while (randomWord.length() < 5 || randomWord.length() > 10) {
            try {
                URL url = new URL(urlStr);
                URLConnection conn = url.openConnection();
                conn.connect();
                InputStream is = conn.getInputStream();
                randomWord = getStringFromInputStream(is);
                randomWord = randomWord.toUpperCase();
                System.out.println(randomWord);

            } catch (IOException e) {
                System.err.println("Caught IOException: " + e.getMessage());
            }

        }

        return randomWord;

    }

    // convert InputStream to String
    private static String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();

    }

    public String searchWord(char letter, String word, String hiddenWord) {

        // search word for chosen letter
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                hiddenWord = changeCharInPosition(i, letter, hiddenWord);
            }
        }
        return hiddenWord;
    }

    private String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

}
