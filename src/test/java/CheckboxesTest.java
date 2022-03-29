import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkboxes (){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        boolean checkbox1 = driver.findElements(By.cssSelector("[type=checkbox]")).get(0).isSelected();
        assertFalse(checkbox1, "Error msg");
        driver.findElements(By.cssSelector("[type=checkbox]")).get(0).click();
        checkbox1 = driver.findElements(By.cssSelector("[type=checkbox]")).get(0).isSelected();
        assertTrue(checkbox1, "Error msg");
        boolean checkBox2 = driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected();
        assertTrue(checkBox2, "Error msg");
        driver.findElements(By.cssSelector("[type=checkbox]")).get(1).click();
        checkBox2 = driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected();
        assertFalse(checkBox2, "Error msg");
    }
}