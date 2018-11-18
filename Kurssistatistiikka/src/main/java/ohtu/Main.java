package ohtu;

import org.apache.http.client.fluent.Request;
import com.google.gson.Gson;
import java.io.IOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Main {

    public static void main(String[] args) throws IOException {
        
        
        // ÄLÄ laita githubiin omaa opiskelijanumeroasi
        String studentNr = "012345678";
        if ( args.length>0) {
            studentNr = args[0];
        }
        String url = "https://studies.cs.helsinki.fi/courses/students/"+studentNr+"/submissions";

        String bodyText = Request.Get(url).execute().returnContent().asString();

        //System.out.println("json-muotoinen data:");
        //System.out.println( bodyText );

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        
        /*String url2 = "https://studies.cs.helsinki.fi/courses/courseinfo";
        String courseInfo = Request.Get(url2).execute().returnContent().asString();
        JsonParser parser = new JsonParser();
        JsonObject parsittuData = parser.parse(courseInfo).getAsJsonObject();
        System.out.println(parsittuData.get("week"));*/
        
        
        //System.out.println("Oliot:");
        for (Submission submission : subs) {
            System.out.println(submission);
        }

    }
}