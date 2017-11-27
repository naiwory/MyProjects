package module9.practice.entities;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)

public class Comments {
    ArrayList<Item> items = new ArrayList<>();

    @Override
    public String toString ( ) {
        return "Comments{" +
                "items=" + items +
                '}';
    }
}
