import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public enum Types {
    STRING {
        @Override
        public void doTheWork(Object o) {
            textList.add((String) o);
        }
    },
    LONG{
        @Override
        public void doTheWork(Object o) {
            numericList.add((Long) o);
        }
    },

    INTEGER {
        @Override
        public void doTheWork(Object o) {
            String value = o.toString();
            numericList.add(Long.parseLong(value));
        }
    },

    PERSON{
        @Override
        public void doTheWork(Object o) {
            personList.add((Person) o);
        }
    },
    CHARACTER{
        @Override
        public void doTheWork(Object o) {
            String value = ((Character) o).toString();
          textList.add(value);
        }
    };

    abstract void doTheWork(Object o);

    final private static List<String> textList = new ArrayList<>();
    final private static List<Long> numericList = new ArrayList<>();
    final private static List<Person> personList = new ArrayList<>();

    public static void displayTextList() {
        String result = textList.stream().map(Objects::toString).collect(Collectors.joining(" "));
        System.out.println(result);
    }

    public static void displaySumOfNumbers() {
        Long sum = numericList.stream().mapToLong(Long::valueOf).sum();
        System.out.println(sum);
    }

    public static void displayPersonList() {
        System.out.println(personList);
    }

}
