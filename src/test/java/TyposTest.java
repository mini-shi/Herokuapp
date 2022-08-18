import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {

    @Test
    public void typos() {
        driver.get(URL + "/typos");
        List<WebElement> list = driver.findElements((By.tagName("p")));
        String text = list.get(0).getAttribute("innerText");
        assertEquals(text, "This example demonstrates a typo being introduced. It does it randomly on each page load.", "There is an error in the text");
        String text2 = list.get(1).getAttribute("innerText");
        assertEquals(text2, "Sometimes you'll see a typo, other times you won't.", "There is an error in the text");
    }
}
