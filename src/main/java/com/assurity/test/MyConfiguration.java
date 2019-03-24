package com.assurity.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.nio.fs.WindowsFileSystemProvider;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

@Configuration
public class MyConfiguration {

    @Bean
    public WebDriver driver() throws URISyntaxException {
        System.setProperty("webdriver.gecko.driver", "C:\\Tools\\geckodriver-v0.24.0-win64\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        Path path = new WindowsFileSystemProvider().getPath(new URI("file:///Program%20Files%20(x86)/Mozilla%20Firefox/firefox.exe"));
        options.setBinary(path);
        FirefoxProfile profile = new FirefoxProfile();
        options.setProfile(profile);

        return new FirefoxDriver(options);
    }

}
