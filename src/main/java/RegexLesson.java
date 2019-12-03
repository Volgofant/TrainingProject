import java.util.Arrays;

public class RegexLesson {

    /*
    \\d - одна цифра
    \\w - одна буква английская
    + - один или более
    * - 0 или более
    ? - 0 или 1 символов до этого знака
    (x|y|z|) - либо x либо y либо z / одна строка из множества строк
    [abc] == (a|b|c) - идентичные записи
    [a-zA-Z] - описывает большие множиства(все английские буквы в данном случае)
    [0-9] == \\d - любая цифра в заданном диапазоне
    [^abc] - хотим все символы кроме [abc]
    . - любой символ
    {2} - 2 символа до (\\d{2}) - хотим две цифры
    {2,} - 2 или более символов (\\d{2,}) - хотим от двух до бесконечности
    {2, 4} - от 2 до 4 символов

     */

    public RegexLesson() {
        String url = "aggsd1gsdgjd9rtyur123hellom2an";
        url.matches("\\d{2,}");

        String[] words = url.split("\\d+");
        System.out.println(Arrays.toString(words));
        String b = "Иди ка ты на хер друг хер";
        System.out.println(b.replace("хер", "****"));
        System.out.println(b.replaceFirst("хер", "****"));
    }
}
