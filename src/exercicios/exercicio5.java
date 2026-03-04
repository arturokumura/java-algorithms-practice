// Platform: Codewars
// Difficulty: 8kyu
// Problem: Find the force of gravity between two objects

package exercicios;

import java.util.Scanner;

public class exercicio5 {
        public static double gravitationalForce(double[] arr_val, String[] arr_unit) {
            final double G = 6.67e-11; // N·m²/kg²

            // Converter massa para kg
            double m1 = convertMassToKg(arr_val[0], arr_unit[0]);
            double m2 = convertMassToKg(arr_val[1], arr_unit[1]);

            // Converter distância para metros
            double r = convertDistanceToM(arr_val[2], arr_unit[2]);

            // Fórmula da gravitação
            return G * m1 * m2 / (r * r);
        }

        private static double convertMassToKg(double mass, String unit) {
            switch (unit) {
                case "kg": return mass;
                case "g": return mass * 1e-3;
                case "mg": return mass * 1e-6;
                case "μg": return mass * 1e-9;
                case "lb": return mass * 0.453592;
                default: throw new IllegalArgumentException("Unidade de massa inválida");
            }
        }

        private static double convertDistanceToM(double dist, String unit) {
            switch (unit) {
                case "m": return dist;
                case "cm": return dist * 1e-2;
                case "mm": return dist * 1e-3;
                case "μm": return dist * 1e-6;
                case "ft": return dist * 0.3048;
                default: throw new IllegalArgumentException("Unidade de distância inválida");
            }
        }
    // Teste rápido
    public static void main(String[] args) {
        double[] values = {1000, 500, 2};   // 1000 g, 500 g, 2 m
        String[] units = {"g", "g", "m"};

        double force = gravitationalForce(values, units);
        System.out.println("Gravitational Force: " + force + " N");
    }
}

