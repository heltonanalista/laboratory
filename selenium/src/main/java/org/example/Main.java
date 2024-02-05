package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver navegator= new ChromeDriver();
        navegator.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        navegator.findElement(By.id("endereco")).sendKeys("40020-210");
        navegator.findElement(By.id("btn_pesquisar" )).click();
       sleep(1);
        List<WebElement> trs = navegator.findElements(By.cssSelector("tbody > tr"));
        for(WebElement tr : trs) {
            List<WebElement> tds = tr.findElements(By.tagName("td"));
            System.out.println(tds);
        }

}}