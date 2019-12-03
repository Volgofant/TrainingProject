import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

class ExecutableImplementation implements Executable {

    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class LymbdaComporator {
    public LymbdaComporator() {
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation());
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello2");
            }
        });
        runner.run(() -> System.out.println("Hello3"));


        List<String> list = new ArrayList<>();
        list.add("dsag");
        list.add("s");
        list.add("fah");
        list.add("sd");

        Comparator<String> comparator = (s1, s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        };
        list.sort(comparator);

        System.out.println(list);
    }
}
