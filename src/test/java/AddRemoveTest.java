import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AddRemoveTest extends BaseTest {

    @Test
    public void addRemoveElements() {
        driver.get(URL + "add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElements(By.xpath("//button[text()='Delete']")).get(1).click();
        int deleteButtons = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        assertEquals(deleteButtons, 1, "Number of delete numbers is not correct");
    }
}
