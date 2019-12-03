import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherReGEX {
    public PatternAndMatcherReGEX() {
        String text = "Hello, guys! My name is the master of orion my jonny@mail.ru sadgfadfh h hqerhdfvhad fasdg kit@yandex.ru asha ;sdrsrg iuqerigsda f kadf' gh";

        Pattern email = Pattern.compile("((\\w+)@(mail|yandex))\\.(com|ru)");
        Matcher matcher = email.matcher(text);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }

        System.out.println(list.toString());
    }
}
