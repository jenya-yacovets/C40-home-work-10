import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringHandler {

    public static String customSplit(String str) {
        String[] arrStr = str.trim().split("");
        Collections.reverse(Arrays.asList(arrStr));
        String result = "";

        for (int i = arrStr.length-1; i >= 0; i--) {
            result += arrStr[i];
             if(i != 0 && i % 3 == 0) result += " ";
        }
        return result;
    }

    public static List<String> filterPalindromes(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String str: list) {
            String preparedStr = str.trim().toLowerCase();

            if (preparedStr.contains(reverse(preparedStr))) {
                result.add(str);
            }
        }
        return result;
    }

    private static String reverse(String str) {
        String[] arrStr = str.trim().split("");
        Collections.reverse(Arrays.asList(arrStr));
        return String.join("", arrStr);
    }
}
