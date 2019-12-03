import java.lang.reflect.Method;
import java.util.Scanner;

public class first {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = classObject1.getMethod(methodName, classObject2);

    }

}


