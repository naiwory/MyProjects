package module9.practice.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)

public class Item {
    private CommentInfo ci;

    @Override
    public String toString ( ) {
        return "Item{" +
                "ci=" + ci +
                '}';
    }

    public CommentInfo getCi ( ) {
        return ci;
    }

    public void setCi ( CommentInfo ci ) {
        this.ci = ci;
    }
}
