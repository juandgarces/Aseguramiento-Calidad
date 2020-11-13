package co.com.devco.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static co.com.devco.utils.Constantes.*;


public class MyWebDriverFactory {

    private static WebDriver driver;

    public static MyWebDriverFactory web() {
        driver = getDriver();
        driver.manage().window().maximize();
        return new MyWebDriverFactory();
    }

    public static WebDriver getDriverBrowser(){
        return driver;
    }

    private static WebDriver getDriver() {
        String webdriverstr = DRIVER;

        if(webdriverstr == null) {
            webdriverstr="chrome";
        }

        switch(webdriverstr) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                FirefoxOptions ffOptions = new FirefoxOptions();
                ffOptions.addArguments("--ignore-certificate-errors");

                return new FirefoxDriver(ffOptions);
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:/Webdriver/chromedriver.exe");
                return new ChromeDriver();


            case "ie":
                System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");

                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability("ignoreZoomSetting", true);
                capabilities.setCapability("ignoreProtectedModeSettings", true);
                capabilities.setCapability("requireWindowFocus", true);
                capabilities.setCapability("enableNativeEvents", true);
                capabilities.setCapability("enablePersistentHover", true);
                capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                capabilities.setCapability("initialBrowserUrl", "http://");
                return new InternetExplorerDriver(capabilities);

            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriverstr);
        }
    }

    public WebDriver onTheWebsite(String url) {
        driver.get(url);
        return driver;
    }

}
