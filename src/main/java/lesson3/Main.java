package lesson3;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        DataRequest dataRequest = new DataRequest();
        dataRequest.request();

        CreateFile createFile = new CreateFile(dataRequest);
        createFile.createFile();
    }
}
