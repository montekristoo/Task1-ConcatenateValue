public class Main {
    public static void main(String[] args) {
        Object[] array1 = new Object[]{"Today", new Person("Victor", "Cebotari", 10, "male"), 100000000L, new Person("Maxim", "Mocanu", 20, "male"), 23, 362, "is", 'a', "big", "day"};
        concatenateValues(array1);
        System.out.println();
        Object[] array2 = new Object[]{"Have", 'a', new Person("Dascal", "Marina", 30, "female"), 1000L, 150, 300, "good",  new Person("Ruslan", "Moraru", 25, "male"), "day"};
        System.out.println("Second test: ");
        concatenateValues(array2);

    }
    private static void concatenateValues(Object[] array) {
        for (Object o : array) {
           for (Types t : Types.values()) {
               if (o.getClass().getSimpleName().toUpperCase().equals(t.toString())) {
                   t.doTheWork(o);
               }
           }
        }
        Types.displaySumOfNumbers();
        Types.displayTextList();
        Types.displayPersonList();
    }
}
