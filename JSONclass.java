package ir.org.acm.main;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ben on 12/30/16.
 */
public class JSONclass {
    JSONObject json;
    File file;
    public JSONclass() throws JSONException, IOException {

        json = new JSONObject();
        file = new File("/Users/ben/IdeaProjects/JSONmaker/jsonFile.json");
        file.createNewFile();
    }

    public void appendObject(String name, String university, String email, String field,String link) throws JSONException, IOException {
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(),true);

        json.put("email",email);
        json.put("PageLink",link);
        json.put("name",name);
        json.put("field",field);
        json.put("university",university);

        fileWriter.write(json.toString(4));
        fileWriter.write("---------------------------\n");
        fileWriter.flush();
        fileWriter.close();
    }
}
