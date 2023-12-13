import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class ToDoListTest {

    private Item itemValid;
    private Item itemNoValid;
    private ToDoList toDo;
    private User userValid;
    private User userNoValid;
    private EmailSenderService emailSender;
    @Before
    public void setup() {
        this.emailSender = mock(EmailSenderService.class);
        when(emailSender.sendMail(anyString())).thenReturn(true);
        this.itemValid = new Item("Test","aeezegg");
        this.itemNoValid = new Item("Test","aeezegg");
        this.userValid = new User("TestFN","TestLN","PassWordTest","Test@gmail.com",15);
        this.userNoValid = new User("TestFN","TestLN","PassWordTest","Test@gmail.com",12);
    }

    @Test
    public void testToDoListAddItem() {
        toDo.addItem(itemValid, userValid);
        assertTrue(toDo.getItems().contains(itemValid));
    }

    @Test
    public void testToDoListAddItemFalse() {
        toDo.addItem(itemNoValid, userNoValid);
        assertFalse(toDo.getItems().contains(itemNoValid));
    }

}
