package exercicios.hackerranq;


public class exercicio15 {
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = s.substring(0, k);
            String largest = s.substring(0, k);

            for (int i = 0; i <= s.length() - k; i++) {
                String sep = s.substring(i, i + k);

                if (sep.compareTo(smallest) < 0) {
                    smallest = sep;
                }

                if (sep.compareTo(largest) > 0) {
                    largest = sep;
                }
            }

            return smallest + "\n" + largest;
        }
    }

