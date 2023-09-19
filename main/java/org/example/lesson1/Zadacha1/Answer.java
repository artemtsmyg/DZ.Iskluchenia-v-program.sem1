package org.example.lesson1.Zadacha1;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
//
//        Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//
//        Метод divisionByZero - Деление на 0
//
//        Метод numberFormatException - Ошибка преобразования строки в число
//
//        Важно: они не должны принимать никаких аргументов
class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = new int[5];
        int value = arr[10];
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int numerator = 5;
        int denominator = 0;
        int result = numerator / denominator;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "не число";
        int num = Integer.parseInt(str);
    }
}

class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}