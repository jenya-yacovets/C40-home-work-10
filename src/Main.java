import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(StringHandler.customSplit("2923342267233238242"));

        System.out.println();

        List<String> listStr = new ArrayList<>();
        listStr.add("Книга");
        listStr.add("Анна");
        listStr.add("Программа");
        System.out.println(StringHandler.filterPalindromes(listStr));
    }
}
