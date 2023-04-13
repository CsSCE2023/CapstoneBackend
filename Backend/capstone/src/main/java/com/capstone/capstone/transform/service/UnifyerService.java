import java.util.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UnifyerService {



    public Collection<> parser(){

        ArrayList<UnifiedProduct> temp = new ArrayList<UnifiedProduct>();
        ObjectMapper mapper = new ObjectMapper();

        // De-serialize to an object
        UnifiedProduct product = mapper.readValue("{\"name\": \"John\"}", UnifiedProduct.class);

        // Read a single attribute
        JsonNode nameNode = mapper.readTree("{\"name\": \"John\"}");

        return temp;
    }

}