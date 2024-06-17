package SEM5.homework;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\AllPrograming\\IdeaProjects\\SEM5\\text";
        try {
            reserv(path);
        } catch (Exception e) {}
    }
    public static void reserv(String path) throws IOException {
        // Исходная директория
        String sourceDirectory = path;

        // Директория для резервной копии
        String backupDirectory = "./backup";

        // Создать директорию для резервной копии
        Path backupDirPath = Paths.get(backupDirectory);
        Files.createDirectories(backupDirPath);

        // Получить все файлы в исходной директории
        try (Stream<Path> files = Files.list(Paths.get(sourceDirectory))) {
            files.filter(file -> !Files.isDirectory(file))
                    .forEach(file -> {
                        try {
                            // Скопировать файл в директорию для резервной копии
                            Files.copy(file, backupDirPath.resolve(file.getFileName()));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }
}
