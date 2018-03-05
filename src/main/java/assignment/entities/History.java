package assignment.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class History {

    @JsonProperty("dailysummary")
    private ArrayList dailysummary;

    public ArrayList getDailySummary() {
        return dailysummary;
    }

    public void setDailySummary(ArrayList dailySummary) {
        this.dailysummary = dailySummary;
    }

    @Override
    public String toString() {
        return "[dailysummary=" + dailysummary + "]";
    }
}
