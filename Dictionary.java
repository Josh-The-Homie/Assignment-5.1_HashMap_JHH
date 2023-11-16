import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Joshua Henderson
 */
public class dictionary{
    public static Map<String, String> readCSVData(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Map<String, String> dataMap = new HashMap<>();
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    dataMap.put(key, value);
                }//end if
            }//end while
            
            return dataMap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }//end catch
    }//end Map
}//end Dictionary
