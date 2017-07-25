
public class Array {
    public class Array {
        public void PracticeOne() {
            int r[] = {54, 23, 66, 12};
            System.out.println(r[1] + r[2]);
        }

        public void PracticeTwo() {
            int t[] = {1, 2, 3, 4, 5};
            t[3] = ++t[3];
            System.out.println(t[3]);
        }

        public void PracticeThree1() {
            int af[] = {4, 5, 6, 7};
            for (int print : af) {
                System.out.print(print);
            }
        }

        public void PracticeThree2() {
            int ag[] = {3, 4, 5, 6, 7};
            int multiply = 2;
            for (int i = 0; i < ag.length; i++) {
                System.out.print(ag[i] * multiply);
            }
        }

        public void PracticeFour() {
            String[][] colors = new String[][]{
                    {"lime", "forest", "olive", "pale", "spring"},
                    {"orange", "red", "tomato"},
                    {"orchid", "violet", "pink", "hot pink"}
            };
        }

        public void PracticeFive() {
            String nimals[] = new String[]{"kuty", "macs", "cic"};
            for (int i = 0; i < nimals.length; i++) {
                System.out.println(nimals[i] + "a");
            }
        }

        public void PracticeSix() {
            String[] abc = new String[]{"first", "second", "third"};
            String help = abc[0];
            abc[0] = abc[2];
            abc[2] = help;
            for (String print : abc) {
                System.out.println(print);
            }
        }

        public void PracticeSeven() {
            int ai[] = {3, 4, 5, 6, 7};
            int sum = 0;

            for (int i = 0; i < ai.length; i++) {
                sum += ai[i];
            }
            System.out.println(sum);

        }

        public void PracticeEight() {
            int aj[] = {3, 4, 5, 6, 7};

            for (int print : aj) {
                for (int i = 0; i < aj.length; i++) {
                    int temp = aj[i];
                    aj[i] = aj[aj.length - i - 1];
                    aj[aj.length - i - 1] = temp;
                }
                System.out.println(print);
            }
        }
    }
