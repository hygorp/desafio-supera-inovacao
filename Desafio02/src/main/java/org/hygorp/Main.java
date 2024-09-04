package org.hygorp;

public class Main {
    public static String drawingAttempt(int r1, int x1, int y1, int r2, int x2, int y2) {
        try {
            if (r1 < 1)
                throw new IllegalArgumentException("O número deve ser maior ou igual a 1");

            if (r2 < 1 || r2 > 1000)
                throw new IllegalArgumentException("O número deve ser maior ou igual a 1 e menor ou igual a 1000");

            double distanceForCenters = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (distanceForCenters + r2 <= r1)
                return "RICO";
            else
                return "MORTO";
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(drawingAttempt(10, 5, 5, 3, 7, 7));
    }
}