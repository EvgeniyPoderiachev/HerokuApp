import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void inputsTest(){
        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("56");
        String input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "56", "Error msg");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "57", "Error msg");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "56", "Error msg");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("opo");
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "", "input is not correct");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("2e3");
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "2e3", "input is not correct");



    }
}
