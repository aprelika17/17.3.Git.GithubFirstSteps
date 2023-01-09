import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DodoTest {
    @Test
    void addToCart() {
        open("https://dodopizza.ru/nizhnynovgorod");
        $(byText("Комбо")).click();
        $(byText("3 пиццы")).click();
        }
}