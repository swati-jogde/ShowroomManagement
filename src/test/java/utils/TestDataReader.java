package utils;

import java.util.List;
import java.util.Map;
import java.io.File;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDataReader {

	public static List<Map<String, String>> readLoginData(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(
                new File(filePath),
                new TypeReference<List<Map<String, String>>>() {}
            );
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to read login data from JSON file: " + filePath);
        }
    }
}
