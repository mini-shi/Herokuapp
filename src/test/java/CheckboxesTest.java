import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends BaseTest {
    @Test
    public void checkboxes() {
        driver.get(URL + "/checkboxes");
        List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
        assertFalse(list.get(0).isSelected(), "Checkbox 1 selected");
        list.get(0).click();
        assertTrue(list.get(0).isSelected(), "Checkbox 1 not selected");
        assertTrue(list.get(1).isSelected(), "Checkbox 1 not selected");
        list.get(1).click();
        assertFalse(list.get(1).isSelected(), "Checkbox 1 selected");
    }
}
