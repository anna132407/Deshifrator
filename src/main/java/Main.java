import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\s(в|без|до|из|к|на|по|о|перед|при|через|с|у|за|над|об|под|про|для)\\s");
        Matcher matcher = pattern.matcher(input);
        String newStr = matcher.replaceAll(" Java ");
        System.out.println("\n"+newStr);
    }
}
