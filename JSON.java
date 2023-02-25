impoimport org.json.simple.JSONObject;
import org.json.simple.JSONValue;
public class JSON
{
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            //Use JSONObject for simple JSON and JSONArray for array of JSON.
            JSONObject data = (JSONObject) parser.parse(
                    new FileReader("/resources/config.json"));//path to the JSON file.

            String json = data.toJSONString();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}    