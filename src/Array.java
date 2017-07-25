
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

    }
