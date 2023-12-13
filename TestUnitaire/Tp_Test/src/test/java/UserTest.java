import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class UserTest {
    @Test
    void userTestMailValid() {
        User user = new User("Test", "Test", "password123", "john.doe@example.com", 25);
        Assert.assertTrue(user.isValidEmail(user.email));
    }
    @Test
    void userTestPasswordValid() {
        User user = new User("Test", "Test", "password123", "john.doe@example.com", 25);
        Assert.assertTrue(user.isValidPassword(user.password));
    }

    @Test
    void userTestAgeValid() {
        User user = new User("Test", "Test", "password123", "john.doe@example.com", 25);
        Assert.assertTrue(user.isValidAge(user.age));
    }
}