package Model.Json;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaDataClass {

    @JsonProperty("Meta Data")
    private MetaData metaData;

    public MetaDataClass(){

    }

    @Override
    public String toString() {
        return "MetaDataClass{" +
                "metaData=" + metaData +
                '}';
    }
}
