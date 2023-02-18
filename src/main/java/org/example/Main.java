package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/rafid/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    public void login() {
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }
    public void cart(){
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

    }
    public void checkOut(){
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

    }
    public void info (){
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Rafid");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Hasan");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("3100");
    }
    public void beforeFinish(){
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

    }
    public void finish() {
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

    }
    public static void main(String[] args) throws InterruptedException {
        Main obj = new Main();
        obj.launchBrowser();
        obj.login();
        Thread.sleep(2000);
        obj.cart();
        Thread.sleep(2000);
        obj.checkOut();
        Thread.sleep(2000);
        obj.info();
        Thread.sleep(2000);
        obj.beforeFinish();
        Thread.sleep(2000);
        obj.finish();
    }
}