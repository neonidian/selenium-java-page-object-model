package se.ica.utilities;

import org.openqa.selenium.Platform;

public class MachinePlatform {

    public static Platform platformOfHostMachine() {
        String platformFromJava = System.getProperty("os.name");
        Platform platform = null;
        if(platformFromJava.toLowerCase().contains("linux")) {
            platform = Platform.LINUX;
        }
        else if(platformFromJava.toLowerCase().contains("windows")) {
            platform = Platform.WINDOWS;
        }
        else if(platformFromJava.toLowerCase().contains("mac")) {
            platform = Platform.MAC;
        }
        else {
            try {
                throw new Exception("Platform not yet supported - " + platformFromJava);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return platform;
    }
}
