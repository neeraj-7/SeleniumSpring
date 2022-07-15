package com.udemy.spring.sprintselenium.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {

//    public static WebDriver driver;
    @Value("${default.timeout:30}")
    private int timeout;

    @Bean
    public WebDriver chromeDriver(){
         WebDriverManager.chromedriver().setup();
         return new ChromeDriver();
//        System.out.println("****"+System.getProperty("user.dir"));
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver");
//        return new ChromeDriver();

    }

//    @Bean
//    public WebDriverWait webDriverWait(WebDriver driver){
//        return new WebDriverWait(driver, this.timeout);
//    }
}
