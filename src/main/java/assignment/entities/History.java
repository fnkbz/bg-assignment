package assignment.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class History {

    @JsonProperty("dailysummary")
    private Dailysummary[] dailysummary;

    public Dailysummary[] getDailysummary ()
    {
        return dailysummary;
    }

    public void setDailysummary (Dailysummary[] dailysummary)
    {
        this.dailysummary = dailysummary;
    }

    @Override
    public String toString() {
        return "[ dailysummary = " + Arrays.toString(dailysummary)+ "]";
    }
}
