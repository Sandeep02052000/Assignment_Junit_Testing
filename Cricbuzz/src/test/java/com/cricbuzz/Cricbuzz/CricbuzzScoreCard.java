package com.cricbuzz.Cricbuzz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzScoreCard {

    public static void main(String[] args) {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open the provided cricket scoreboard URL
        String url = "https://www.cricbuzz.com/live-cricket-scorecard/77898/rsa-vs-ind-2nd-test-india-tour-of-south-africa-2023-24";
        driver.get(url);

        // Extract and print the team names
        WebElement team1Element = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[1]/div[1]"));
        WebElement team2Element = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[3]/div[1]"));
        String team1 = team1Element.getText();
        String team2 = team2Element.getText();
        System.out.println("Team 1: " + team1);
        System.out.println("Team 2: " + team2);

        // Extract and print the score summary
        WebElement scoreElement = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[2]"));
        String scoreSummary = scoreElement.getText();
        System.out.println("Score Summary: " + scoreSummary);

        // Extract and print the detailed scorecard
        WebElement scorecardElement = driver.findElement(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        String scorecard = scorecardElement.getText();
        System.out.println("Detailed Scorecard:\n" + scorecard);

        // Close the WebDriver
        driver.quit();
    }
}
