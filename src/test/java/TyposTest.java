import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {

    @Test
    public void typosTest() {
        driver.get("https://the-internet.herokuapp.com/typos");
        String text = driver.findElements(By.tagName("p")).get(1).getText();
        assertEquals(text, "Sometimes you'll see a typo, other times you won't.", "FUCK");
        driver.navigate().refresh();
        String text2 = driver.findElements(By.tagName("p")).get(1).getText();
        assertEquals(text2, "Sometimes you'll see a typo, other times you won't.", "FUCK");
    }
}
