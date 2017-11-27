package module9.practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import module9.practice.entities.Comments;

import java.io.IOException;
import java.util.ArrayList;

public class YoutubeDownload {

    private static final String YOU_TUBE = "https://www.googleapis.com/youtube/v3/{method}";

    private static final String API_KEY = "AIzaSyDp5DLXpO68jPvC0CdvjrZ12U876gHlvpQ";

    static {

        Unirest.setObjectMapper(new ObjectMapper () {

            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper

                    = new com.fasterxml.jackson.databind.ObjectMapper();



            public <T> T readValue(String value, Class<T> valueType) {

                try {

                    return jacksonObjectMapper.readValue(value, valueType);

                } catch (IOException e) {

                    throw new RuntimeException(e);

                }

            }



            public String writeValue(Object value) {

                try {

                    return jacksonObjectMapper.writeValueAsString(value);

                } catch (JsonProcessingException e) {

                    throw new RuntimeException(e);

                }

            }

        });

    }

    public static void main ( String[] args ) throws UnirestException {

        ArrayList<String> videolds = new ArrayList<>();
        videolds.add("wHcFBAEjV_Q");
        videolds.add("Y4nTz-Hn4Qs");
        videolds.add("IW19JUMdPdA");
        videolds.add("Dm5Yhj5loP8");
        videolds.add("ve3lCNrRulI");

        for(String video : videolds) {
            HttpResponse<Comments> response = Unirest.get ( YOU_TUBE )

                    .routeParam ( "method" , "commentThreads" )

                    .queryString ( "videoId" , video )

                    .queryString ( "part" , "snippet, replies" )

                    .queryString ( "key" , API_KEY )

                    .asObject ( Comments.class );

            System.out.println (response.getBody ().toString ());
        }



    }
}
