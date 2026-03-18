package exercicios.hackerranq;

public class exercicio09 {
    public static String timeConversion(String s) {
        String period = s.substring(8); // AM ou PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8); // :mm:ss

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else { // PM
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + rest;
    }

    public static void main(String[] args) {
        String input = "07:05:45PM";
        System.out.println(timeConversion(input)); // 19:05:45
    }
}
