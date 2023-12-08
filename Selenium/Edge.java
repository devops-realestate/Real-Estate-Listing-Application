package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\I527909\\Downloads\\msedgedriver.exe");

        // Initialize the WebDriver (in this example, using Chrome)
        WebDriver driver = new EdgeDriver();
        String url = "http://35.154.70.190/dashboard/project/login.php";
        driver.get(url);



        //Login
        WebElement user = driver.findElement(By.name("email"));
        user.sendKeys("rakshithrakki119@gmail.com");


        WebElement pass = driver.findElement(By.name("pass"));
        pass.sendKeys("12345");

        driver.findElement(By.name("submit")).click();



        //Post property
        WebElement liElement = driver.findElement(By.xpath("//li[a[contains(@href,'post_property.php')]]"));

        // Find the link element within the <li> element
        WebElement linkElement = liElement.findElement(By.tagName("a"));
        linkElement.click();

        WebElement pr_name = driver.findElement(By.name("property_name"));
        pr_name.sendKeys("Ace properties");

        WebElement price = driver.findElement(By.name("price"));
        price.sendKeys("16580000");

        WebElement depo = driver.findElement(By.name("deposite"));
        depo.sendKeys("1250000");

        WebElement addr = driver.findElement(By.name("address"));
        addr.sendKeys("Bengalore, Whitefield");

        WebElement ca = driver.findElement(By.name("carpet"));
        ca.sendKeys("560");

        WebElement age = driver.findElement(By.name("age"));
        age.sendKeys("2");

        WebElement floors  = driver.findElement(By.name("total_floors"));
        floors.sendKeys("6");

        WebElement roomf  = driver.findElement(By.name("room_floor"));
        roomf.sendKeys("9");

        WebElement description  = driver.findElement(By.name("description"));
        description.sendKeys("Ace Properties: Elevate your living experience with our premium residences, where every detail is designed for your comfort. Discover homes that redefine convenience, featuring state-of-the-art facilities that cater to your every need. From modern kitchens to relaxing recreation spaces, our properties offer a perfect blend of style and functionality. Choose Ace Properties for a lifestyle that transcends the ordinary—where luxury meets practicality. Whether you crave urban excitement or serene suburban living, our diverse portfolio ensures your ideal home. Experience excellence with Ace Properties, where every residence is a testament to refined living. Welcome to a life of ease, style, and sophistication.");


        //image
        WebElement image1 = driver.findElement(By.xpath("//input[@type='file' and @name='image_01']"));

        image1.sendKeys("C:\\Users\\I527909\\Documents\\DevOps\\Xaamp\\htdocs\\Real-Estate-Listing-Application\\desgin\\images\\house-img-4.webp");

        WebElement image2 = driver.findElement(By.xpath("//input[@type='file' and @name='image_02']"));

        image2.sendKeys("C:\\Users\\I527909\\Documents\\DevOps\\Xaamp\\htdocs\\Real-Estate-Listing-Application\\desgin\\images\\hall-img-1.webp");

        WebElement image3 = driver.findElement(By.xpath("//input[@type='file' and @name='image_03']"));

        image3.sendKeys("C:\\Users\\I527909\\Documents\\DevOps\\Xaamp\\htdocs\\Real-Estate-Listing-Application\\desgin\\images\\kitchen-img-4.webp");


        driver.findElement(By.name("post")).click();

        driver.quit();

    }


}
