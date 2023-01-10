package exercise;

import java.util.List;
import org.apache.commons.lang3.StringUtils;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        long gmails = emails.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.contains("@gmail.com"))
                .count();

        long yandexs = emails.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.contains("@yandex.ru"))
                .count();

        long hotmails = emails.stream()
                .filter(email -> StringUtils.isNotBlank(email))
                .filter(email -> email.contains("@hotmail.com"))
                .count();


        int freeEmails = (int) gmails + (int) yandexs + (int) hotmails;
        return freeEmails;
    }
}
// END
