package Model.Json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeSeriesDaily {

    @JsonProperty("2025-05-05")
    private DataCotacao dataCotacao;

    @Override
    public String toString() {
        return "TimeSeriesDaily{" +
                "dataCotacao=" + dataCotacao +
                '}';
    }

    public TimeSeriesDaily(){

    }
}
