import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void inputs() {
        driver.get(URL + "/inputs");
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        String inputValue = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(inputValue, "1", "Ввод с помощью кнопок не работает, при нажатии вверх");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        String inputValue2 = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(inputValue2, "-1", "Ввод с помощью кнопок не работает, при нажатии вниз");
    }
}
