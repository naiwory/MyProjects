package module9.practice.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)

public class SnippetIn {
    private String authorDisplayName;
    private String textDisplay;
    private int likeCount;
    private String publishedAt;
    private String updatedAt;

    @Override
    public String toString ( ) {
        return "SnippetIn{" +
                "authorDisplayName='" + authorDisplayName + '\'' +
                ", textDisplay='" + textDisplay + '\'' +
                ", likeCount=" + likeCount +
                ", publishedAt='" + publishedAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

    public boolean commentUpdate(){
        if(publishedAt == updatedAt)
            return false;
        else
            return true;
    }

    public String getAuthorDisplayName ( ) {
        return authorDisplayName;
    }

    public void setAuthorDisplayName ( String authorDisplayName ) {
        this.authorDisplayName = authorDisplayName;
    }

    public String getTextDisplay ( ) {
        return textDisplay;
    }

    public void setTextDisplay ( String textDisplay ) {
        this.textDisplay = textDisplay;
    }

    public int getLikeCount ( ) {
        return likeCount;
    }

    public void setLikeCount ( int likeCount ) {
        this.likeCount = likeCount;
    }

    public String getPublishedAt ( ) {
        return publishedAt;
    }

    public void setPublishedAt ( String publishedAt ) {
        this.publishedAt = publishedAt;
    }

    public String getUpdatedAt ( ) {
        return updatedAt;
    }

    public void setUpdatedAt ( String updatedAt ) {
        this.updatedAt = updatedAt;
    }
}
