package lesson2;
//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
// показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void task4() throws EmptyStringException{
        try {
            inputString();
        } catch (EmptyStringException ex) {
            System.out.println("Пустые строки вводить нельзя.");
        }
    }

    public static void inputString() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String userInput = scanner.nextLine();
        scanner.close();

        if (userInput.isEmpty()) {
            throw new EmptyStringException();
        }
    }
}

class EmptyStringException extends Exception {
    // Пустое тело конструктора
}


