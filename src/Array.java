
public class Array {
    public static void main(String[] args) {
        System.out.println(PracticeOne());
        System.out.println(PracticeTwo());
        PracticeThree(3, 4, 5, 6, 7);
        PracticeFour();
        PracticeFive();
        PracticeSix();
        PracticeSeven();
        System.out.println(PracticeEight());
    }

    private static int PracticeOne() {
        int r[] = {54, 23, 66, 12};
        int sout = (r[1] + r[2]);
        return sout;
    }

    private static int PracticeTwo() {
        int t[] = {1, 2, 3, 4, 5};
        t[3] = ++t[3];
        int sout = (t[3]);
        return sout;
    }

    private static void PracticeThree(int i, int i1, int i2, int i3, int i4) {
        int af[] = {i, i1, i2, i3, i4};
        for (int print : af) {
            System.out.println(print);
        }
    }

    private static void PracticeFour() {
        int ag[] = {3, 4, 5, 6, 7};
        int multiply = 2;
        for (int i = 0; i < ag.length; i++) {
            System.out.println(ag[i] * multiply);
        }
    }

    public static String[][] PracticeFive() {
        String[][] colors = new String[][]{
                {"lime", "forest", "olive", "pale", "spring"},
                {"orange", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };
        return colors;
    }

    private static void PracticeSix() {
        String animals[] = new String[]{"kuty", "macsk", "cic"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i] + "a");
        }
    }

    private static void PracticeSeven() {
        String[] abc = new String[]{"first", "second", "third"};
        String help = abc[0];
        abc[0] = abc[2];
        abc[2] = help;
        for (String print : abc) {
            System.out.println(print);
        }
    }

    public static int PracticeEight() {
        int ai[] = {3, 4, 5, 6, 7};
        int sum = 0;

        for (int i : ai) {
            sum += i;
        }
        return sum;
    }
}

