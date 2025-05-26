package Model.Json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataCotacao {

    @JsonProperty("1. open")
    private String open;

    @Override
    public String toString() {
        return "DataCotacao{" +
                "open='" + open + '\'' +
                '}';
    }

    public DataCotacao(){

    }
}
