package Model.Json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeSeriesDailyClass {

    @JsonProperty("Time Series (Daily)")
    private TimeSeriesDaily timeSeriesDaily;

    @Override
    public String toString() {
        return "TimeSeriesDailyClass{" +
                "timeSeriesDaily=" + timeSeriesDaily +
                '}';
    }

    public TimeSeriesDailyClass(){

    }

}
