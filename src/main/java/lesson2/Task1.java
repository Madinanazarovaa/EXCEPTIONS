package lesson2;
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя
// ввод данных.

import java.util.Scanner;

public class Task1 {
    public static float getUserInputFloat() {
        Scanner scanner = new Scanner(System.in);
        float userInput = 0.0f;

        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                System.out.print("Введите дробное число (типа float): ");
                userInput = Float.parseFloat(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите дробное число (типа float):");
            }
        }

        scanner.close();
        return userInput;
    }
    }
