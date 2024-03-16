import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstcode {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the Movie Critics site
        driver.get("https://movie-reviews-psi.vercel.app/");

        // 1. Search and edit
        // Click the search text box and write the movie name "Leo 2"
        WebElement searchBox = driver.findElement(By.xpath("/html/body/main/section[1]/input"));
        searchBox.sendKeys("Leo 2");
        Thread.sleep(3000);

        // Click on Edit button
        WebElement editButton = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/button[1]/svg"));
        editButton.click();
        Thread.sleep(3000);

        // Click the text box and write the date as "12092023"
        WebElement releaseDateBox = driver.findElement(By.xpath("//*[@id='release']"));
        releaseDateBox.sendKeys("12092023");
        Thread.sleep(3000);

        // Click Update button
        WebElement updateButton = driver.findElement(By.xpath("//*[@id='movie-add-modal']/div/form/div[3]/button/h4"));
        updateButton.click();
        Thread.sleep(3000);

        // 2. Click on Add movie
        // Click on Add movie button
        WebElement addMovieButton = driver.findElement(By.xpath("/html/body/nav/div/button[1]/h4"));
        addMovieButton.click();
        Thread.sleep(3000);

        // Write the movie name "SAALAR"
        WebElement movieNameBox = driver.findElement(By.xpath("//*[@id='name']"));
        movieNameBox.sendKeys("SAALAR");
        Thread.sleep(3000);

        // Write the date as "12102023"
        WebElement releaseDateBox2 = driver.findElement(By.xpath("//*[@id='release']"));
        releaseDateBox2.sendKeys("12102023");
        Thread.sleep(3000);

        // Click Update button
        WebElement updateButton2 = driver.findElement(By.xpath("//*[@id='movie-add-modal']/div/form/div[3]/button/h4"));
        updateButton2.click();
        Thread.sleep(3000);

        // 3. Click on Add New Review
        // Click on Add New Review button
        WebElement addNewReviewButton = driver.findElement(By.xpath("/html/body/nav/div/button[2]/h4"));
        addNewReviewButton.click();
        Thread.sleep(3000);

        // Click the drop down box and down arrow button and enter
        WebElement dropDownBox = driver.findElement(By.xpath("//*[@id='movie']"));
        dropDownBox.click();
        dropDownBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        dropDownBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        // Write the name "Kishore"
        WebElement reviewerNameBox = driver.findElement(By.xpath("//*[@id='name']"));
        reviewerNameBox.sendKeys("Kishore");
        Thread.sleep(3000);

        // Write the rating as "2"
        WebElement ratingBox = driver.findElement(By.xpath("//*[@id='rating']"));
        ratingBox.sendKeys("2");
        Thread.sleep(3000);

        // Write the comments as "Worst"
        WebElement reviewBox = driver.findElement(By.xpath("//*[@id='review']"));
        reviewBox.sendKeys("Worst");
        Thread.sleep(3000);

        // Click Create review button
        WebElement createReviewButton = driver.findElement(By.xpath("//*[@id='review-add-modal']/div/form/div[5]/button/h4"));
        createReviewButton.click();
        Thread.sleep(3000);

        // 4. Click on 6th movie
        WebElement sixthMovieButton = driver.findElement(By.xpath("/html/body/main/section[2]/div[5]/div/button[2]/svg/path[3]"));
        sixthMovieButton.click();
        Thread.sleep(3000);

        // Close the browser
        driver.quit();
    }
}
