package com.assurity.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import sun.nio.fs.WindowsFileSystemProvider;


import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

public class FirefoxDriverApp {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver-v0.24.0-win64\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        Path path = new WindowsFileSystemProvider().getPath(new URI("file:///Program%20Files%20(x86)/Mozilla%20Firefox/firefox.exe"));
        options.setBinary(path);
        FirefoxProfile profile = new FirefoxProfile();
        options.setProfile(profile);

        WebDriver driver = new FirefoxDriver(options);
        driver.get("http://google.co.nz");
        driver.wait(1000);
        driver.close();
    }
}
