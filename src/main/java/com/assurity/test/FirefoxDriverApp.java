package com.assurity.test;

import org.openqa.selenium.WebDriver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;


public class FirefoxDriverApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        WebDriver driver = context.getBean("driver", WebDriver.class);

        driver.get("http://google.co.nz");
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}
