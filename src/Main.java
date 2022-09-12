import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("First test: ");
        Object[] array1 = new Object[]{"Today", new Person("Victor", "Cebotari", 10, "male"), 32344234234L, new Person("Maxim", "Mocanu", 20, "male"), 23, 362, "is", 'a', "big", "day"};
        concatenateValues(array1);
        System.out.println();
        Object[] array2 = new Object[]{"Have", 'a', new Person("Dascal", "Marina", 30, "female"), 100000000L, 150, 1000, "good",  new Person("Ruslan", "Moraru", 25, "male"), "day"};
        System.out.println("Second test: ");
        concatenateValues(array2);

    }
    private static void concatenateValues(Object[] array) {
        StringBuilder concatenate = new StringBuilder();
        Long sum = 0L;
        List<Person> personList = new ArrayList<>();
        for (Object o : array) {
            switch (o.getClass().getSimpleName()) {
                case "String", "Character" -> concatenate.append(o).append(" ");
                case "Long" -> sum += (Long) o;
                case "Integer" -> {
                    String value = o.toString();
                    sum += (Long.parseLong(value));
                }
                case "Person" -> personList.add((Person) o);
            }
        }
        System.out.println(concatenate);
        System.out.println(sum);
        System.out.println(personList);
    }
}
