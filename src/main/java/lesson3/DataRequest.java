package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataRequest {
    List<Object> myList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String surname;
    String name;
    String patronymic;
    String dateOfBirth;
    long number;
    char gender;
    boolean isValidInput = false;
    int count = 6;

    public void request() {
        while (!isValidInput) {
            try {
                System.out.print("Введите фамилию: ");
                surname = scanner.nextLine();
                System.out.print("Введите имя: ");
                name = scanner.nextLine();
                System.out.print("Введите отчество: ");
                patronymic = scanner.nextLine();
                System.out.print("Введите дату рождения (dd.mm.yyyy): ");
                dateOfBirth = scanner.nextLine();
                System.out.print("Введите номер телефона: ");
                number = Long.parseLong(scanner.nextLine());
                System.out.print("Введите пол (f или m): ");
                String genderInput = scanner.nextLine();

                myList.add(surname);
                myList.add(name);
                myList.add(patronymic);
                myList.add(dateOfBirth);
                myList.add(number);
                myList.add(gender);

                if (surname.isEmpty() || name.isEmpty() || patronymic.isEmpty() || dateOfBirth.isEmpty() || genderInput.isEmpty()) {
                    throw new IllegalArgumentException("Вы ввели не все данные.");
                }

                if (surname.length() < 2 || name.length() < 2 || patronymic.length() < 2) {
                    throw new IllegalArgumentException("Введите полностью ФИО");
                }

                if (!dateOfBirth.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                    throw new IllegalArgumentException("Некорректный формат даты рождения.");
                }

                gender = genderInput.charAt(0);
                if (gender != 'f' && gender != 'm') {
                    throw new IllegalArgumentException("Некорректный формат пола.");
                }

                isValidInput = true;

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Некорректный ввод числа для номера телефона.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
                myList.clear();
            }
        }
    }
}
