import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ItemTest {
    private Item item;

    @Before
    public void setup() {
        this.item = new Item("Test","aeezegg");
    }

    @Test
    public void testItemContent() { Assert.assertTrue(item.itemIsValid());}

    @Test
    public void testItemName() { Assert.assertTrue(item.itemIsValid());}
}
