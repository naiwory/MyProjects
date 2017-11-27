package module9.practice.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)

public class TopLevelComment {
    private SnippetIn snippet;

    @Override
    public String toString ( ) {
        return "TopLevelComment{" +
                "snippet=" + snippet +
                '}';
    }

    public SnippetIn getSnippet ( ) {
        return snippet;
    }

    public void setSnippet ( SnippetIn snippet ) {
        this.snippet = snippet;
    }
}
