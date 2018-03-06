package assignment.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Date
{
    @JsonProperty("min")
    private String min;

    @JsonProperty("mday")
    private String mday;

    @JsonProperty("mon")
    private String mon;

    @JsonProperty("year")
    private String year;

    @JsonProperty("hour")
    private String hour;

    @JsonProperty("pretty")
    private String pretty;

    @JsonProperty("tzname")
    private String tzname;

    public String getMin ()
    {
        return min;
    }

    public void setMin (String min)
    {
        this.min = min;
    }

    public String getMday ()
    {
        return mday;
    }

    public void setMday (String mday)
    {
        this.mday = mday;
    }

    public String getMon ()
    {
        return mon;
    }

    public void setMon (String mon)
    {
        this.mon = mon;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    public String getHour ()
    {
        return hour;
    }

    public void setHour (String hour)
    {
        this.hour = hour;
    }

    public String getPretty ()
    {
        return pretty;
    }

    public void setPretty (String pretty)
    {
        this.pretty = pretty;
    }

    public String getTzname ()
    {
        return tzname;
    }

    public void setTzname (String tzname)
    {
        this.tzname = tzname;
    }

    @Override
    public String toString()
    {
        return " [min = "+min+", mday = "+mday+", mon = "+mon+", year = "+year+"," +
                " hour = "+hour+", pretty = "+pretty+", tzname = "+tzname+"]";
    }
}
