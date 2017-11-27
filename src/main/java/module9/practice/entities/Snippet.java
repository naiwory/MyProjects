package module9.practice.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)

public class Snippet {
    private TopLevelComment topLevelComment;

    @Override
    public String toString ( ) {
        return "Snippet{" +
                "topLevelComment=" + topLevelComment +
                '}';
    }

    public TopLevelComment getTopLevelComment ( ) {
        return topLevelComment;
    }

    public void setTopLevelComment ( TopLevelComment topLevelComment ) {
        this.topLevelComment = topLevelComment;
    }
}
