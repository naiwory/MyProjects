package module9.practice.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)

public class CommentInfo {
    private Snippet snippet;

    @Override
    public String toString ( ) {
        return "CommentInfo{" +
                "snippet=" + snippet +
                '}';
    }

    public Snippet getSnippet ( ) {
        return snippet;
    }

    public void setSnippet ( Snippet snippet ) {
        this.snippet = snippet;
    }
}
