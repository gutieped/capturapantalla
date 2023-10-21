package org.example;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arturo\\Desktop\\geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();

        try{
            driver.get("https://demoqa.com/text-box");

            //Tomar captura de pantalla
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);


            //Destino del archivo
            File destFile = new File("/home/fer/capturas/ejemplo.png");

            FileUtils.copyFile(srcFile, destFile);

            System.out.println("Se genero la captura de pantalla");


        } catch (IOException e) {
            System.out.println("Existe un error al capturar la pantalla");
        }


    }
}