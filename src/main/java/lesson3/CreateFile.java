package lesson3;

import java.io.*;

public class CreateFile {
    private DataRequest dataRequest;

    public CreateFile(DataRequest dataRequest) {
        this.dataRequest = dataRequest;
    }

    public void createFile() {
        String fileName = dataRequest.surname + ".txt"; // Имя файла на основе фамилии

        try (FileWriter fileWriter = new FileWriter(fileName, true); // Открываем файл для записи с дополнением
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

            // Записываем данные в файл с новой строкой между каждой записью
            String content = dataRequest.surname + " " + dataRequest.name + " " + dataRequest.patronymic + " " +
                    dataRequest.dateOfBirth + " " + dataRequest.number + " " + dataRequest.gender;
            printWriter.println(content);

            System.out.println("Данные успешно записаны в файл: " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
