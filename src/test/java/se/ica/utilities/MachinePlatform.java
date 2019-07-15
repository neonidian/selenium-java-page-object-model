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
            throw new RuntimeException("********* Platform not yet supported - " + platformFromJava);
        }
        return platform;
    }
}
