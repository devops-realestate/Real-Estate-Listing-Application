x   package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\I527909\\Downloads\\chromedriver.exe");

        // Initialize the WebDriver (in this example, using Chrome)
        WebDriver driver = new ChromeDriver();
        String url = "http://35.154.70.190/dashboard/project/login.php";
        driver.get(url);



        //Login
        WebElement user = driver.findElement(By.name("email"));
        user.sendKeys("guru@gmail.com");


        WebElement pass = driver.findElement(By.name("pass"));
        pass.sendKeys("12345");

        driver.findElement(By.name("submit")).click();



        //Post property
        WebElement liElement = driver.findElement(By.xpath("//li[a[contains(@href,'post_property.php')]]"));

        // Find the link element within the <li> element
        WebElement linkElement = liElement.findElement(By.tagName("a"));
        linkElement.click();

        WebElement pr_name = driver.findElement(By.name("property_name"));
        pr_name.sendKeys("Guru properties");

        WebElement price = driver.findElement(By.name("price"));
        price.sendKeys("100000000");

        WebElement depo = driver.findElement(By.name("deposite"));
        depo.sendKeys("5250000");

        WebElement addr = driver.findElement(By.name("address"));
        addr.sendKeys("Bengalore, Hoodi");

        WebElement ca = driver.findElement(By.name("carpet"));
        ca.sendKeys("420");

        WebElement age = driver.findElement(By.name("age"));
        age.sendKeys("4");

        WebElement floors  = driver.findElement(By.name("total_floors"));
        floors.sendKeys("6");

        WebElement roomf  = driver.findElement(By.name("room_floor"));
        roomf.sendKeys("5");

        WebElement description  = driver.findElement(By.name("description"));
        description.sendKeys("Guru Properties stands as a beacon of contemporary living, offering residents an unparalleled blend of sophistication and convenience. Our meticulously crafted residences feature spacious interiors, seamlessly combining modern design with comfort. At the heart of our community lies a state-of-the-art fitness center, resort-style pool, and stylish co-working spaces, ensuring that every aspect of your lifestyle is catered to. Gourmet kitchens with high-end appliances, smart home technology, and pet-friendly amenities underscore our commitment to enhancing your living experience. Our concierge team is available 24/7 to provide personalized assistance, while entertainment lounges and secure parking facilities add an extra layer of luxury and convenience. With scenic outdoor spaces and stunning architecture, Guru Properties creates an oasis within the urban landscape, inviting residents to embrace a lifestyle where elegance meets innovation.");




        //image
        WebElement image1 = driver.findElement(By.xpath("//input[@type='file' and @name='image_01']"));

        image1.sendKeys("C:\\Users\\I527909\\Documents\\DevOps\\Xaamp\\htdocs\\Real-Estate-Listing-Application\\desgin\\images\\house-img-4.webp");

        WebElement image2 = driver.findElement(By.xpath("//input[@type='file' and @name='image_02']"));

        image2.sendKeys("C:\\Users\\I527909\\Documents\\DevOps\\Xaamp\\htdocs\\Real-Estate-Listing-Application\\desgin\\images\\hall-img-1.webp");

        WebElement image3 = driver.findElement(By.xpath("//input[@type='file' and @name='image_03']"));

        image3.sendKeys("C:\\Users\\I527909\\Documents\\DevOps\\Xaamp\\htdocs\\Real-Estate-Listing-Application\\desgin\\images\\kitchen-img-4.webp");



        driver.findElement(By.name("post")).click();

        driver.quit();




        //Edge
    }


}
