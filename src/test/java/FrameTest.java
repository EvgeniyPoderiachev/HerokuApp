import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {

    @Test
    public void iframe() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        String textInFrame = driver.findElement(By.tagName("p")).getText();
        assertEquals(textInFrame, "Your content goes here.");
        driver.switchTo().defaultContent();
    }
}
