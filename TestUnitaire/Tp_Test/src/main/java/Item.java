import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Item {
    private String name;
    private String content;
    private LocalDateTime creationDate;
    private List<String> namesItems = new ArrayList<String>();

    public Item(String name,String content) {
        this.name = name;
        this.content = content;
        this.creationDate = LocalDateTime.now();
        this.namesItems.add(name);
    }

    public boolean itemIsValid() {
        if(isNameValid(this.name) && isContentValid(this.content)) {
            System.out.println("Item Valide");
            return true;
        }
        else {
            System.out.println("Item non valide");
            return false;
        }
    }

    private boolean isNameValid(String name) {
        int cpt = 0;
        for (String i:this.namesItems) {
            if(i.contains(name)) {
                cpt++;
            }
        }

        if(cpt > 1) {
            System.out.println("Name non unique");
            return false;
        }
        else {
            System.out.println("Name unique");
            return true;
        }
    }

    private boolean isContentValid(String content) {
        if(content.length() > 1000) {
            System.out.println("content non valide");
            return false;
        }
        else {
            System.out.println("Content valide");
            return true;
        }
    }
}
