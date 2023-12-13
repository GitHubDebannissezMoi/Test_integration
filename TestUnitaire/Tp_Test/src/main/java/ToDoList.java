import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import static java.time.temporal.ChronoUnit.MINUTES;

@Getter
public class ToDoList {
    private List<Item> items = new ArrayList<Item>();
    private EmailSenderService email;

    public void addItem(Item item,User user) {
        if(MINUTES.between(item.getCreationDate(), LocalDateTime.now()) > 30
        && user.isUserValid()) {
            this.items.add(item);
            if(items.size() == 8) {
                email.sendMail(user.email);
            }
        }
        else {
            System.out.println("Impossible d'ajouter un Item");
        }

    }
}
