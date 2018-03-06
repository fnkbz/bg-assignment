package assignment.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dailysummary
{
    @JsonProperty("maxtempi")
    private String maxtempi;

    @JsonProperty("minpressurei")
    private String minpressurei;

    @JsonProperty("coolingdegreedays")
    private String coolingdegreedays;

    @JsonProperty("meanpressurem")
    private String meanpressurem;

    @JsonProperty("meandewpti")
    private String meandewpti;

    @JsonProperty("maxtempm")
    private String maxtempm;

    @JsonProperty("minpressurem")
    private String minpressurem;

    @JsonProperty("mindewptm")
    private String mindewptm;

    @JsonProperty("meandewptm")
    private String meandewptm;

    @JsonProperty("mindewpti")
    private String mindewpti;

    @JsonProperty("since1jancoolingdegreedaysnormal")
    private String since1jancoolingdegreedaysnormal;

    @JsonProperty("gdegreedays")
    private String gdegreedays;

    @JsonProperty("since1julheatingdegreedays")
    private String since1julheatingdegreedays;

    @JsonProperty("since1sepcoolingdegreedays")
    private String since1sepcoolingdegreedays;

    @JsonProperty("snow")
    private String snow;

    @JsonProperty("minvism")
    private String minvism;

    @JsonProperty("monthtodatesnowfalli")
    private String monthtodatesnowfalli;

    @JsonProperty("monthtodateheatingdegreedays")
    private String monthtodateheatingdegreedays;

    @JsonProperty("minvisi")
    private String minvisi;

    @JsonProperty("monthtodatesnowfallm")
    private String monthtodatesnowfallm;

    @JsonProperty("thunder")
    private String thunder;

    @JsonProperty("precipi")
    private String precipi;

    @JsonProperty("precipm")
    private String precipm;

    @JsonProperty("meanvisi")
    private String meanvisi;

    @JsonProperty("maxvism")
    private String maxvism;

    @JsonProperty("humidity")
    private String humidity;

    @JsonProperty("maxvisi")
    private String maxvisi;

    @JsonProperty("meanvism")
    private String meanvism;

    @JsonProperty("meanpressurei")
    private String meanpressurei;

    @JsonProperty("maxhumidity")
    private String maxhumidity;

    @JsonProperty("monthtodateheatingdegreedaysnormal")
    private String monthtodateheatingdegreedaysnormal;

    @JsonProperty("meantempi")
    private String meantempi;

    @JsonProperty("minwspdi")
    private String minwspdi;

    @JsonProperty("meantempm")
    private String meantempm;

    @JsonProperty("maxwspdm")
    private String maxwspdm;

    @JsonProperty("heatingdegreedays")
    private String heatingdegreedays;

    @JsonProperty("maxwspdi")
    private String maxwspdi;

    @JsonProperty("maxpressurem")
    private String maxpressurem;

    @JsonProperty("date")
    private Date date;

    @JsonProperty("minwspdm")
    private String minwspdm;

    @JsonProperty("maxpressurei")
    private String maxpressurei;

    @JsonProperty("mintempm")
    private String mintempm;

    @JsonProperty("maxdewpti")
    private String maxdewpti;

    @JsonProperty("mintempi")
    private String mintempi;

    @JsonProperty("maxdewptm")
    private String maxdewptm;

    @JsonProperty("monthtodatecoolingdegreedaysnormal")
    private String monthtodatecoolingdegreedaysnormal;

    @JsonProperty("rain")
    private String rain;

    @JsonProperty("monthtodatecoolingdegreedays")
    private String monthtodatecoolingdegreedays;

    @JsonProperty("hail")
    private String hail;

    @JsonProperty("meanwindspdi")
    private String meanwindspdi;

    @JsonProperty("snowfalli")
    private String snowfalli;

    @JsonProperty("since1sepcoolingdegreedaysnormal")
    private String since1sepcoolingdegreedaysnormal;

    @JsonProperty("snowfallm")
    private String snowfallm;

    @JsonProperty("precipsource")
    private String precipsource;

    @JsonProperty("since1julsnowfalli")
    private String since1julsnowfalli;

    @JsonProperty("since1sepheatingdegreedays")
    private String since1sepheatingdegreedays;

    @JsonProperty("heatingdegreedaysnormal")
    private String heatingdegreedaysnormal;

    @JsonProperty("since1julheatingdegreedaysnormal")
    private String since1julheatingdegreedaysnormal;

    @JsonProperty("fog")
    private String fog;

    @JsonProperty("since1jancoolingdegreedays")
    private String since1jancoolingdegreedays;

    @JsonProperty("since1julsnowfallm")
    private String since1julsnowfallm;

    @JsonProperty("snowdepthm")
    private String snowdepthm;

    @JsonProperty("minhumidity")
    private String minhumidity;

    @JsonProperty("coolingdegreedaysnormal")
    private String coolingdegreedaysnormal;

    @JsonProperty("meanwdire")
    private String meanwdire;

    @JsonProperty("meanwindspdm")
    private String meanwindspdm;

    @JsonProperty("tornado")
    private String tornado;

    @JsonProperty("snowdepthi")
    private String snowdepthi;

    @JsonProperty("since1sepheatingdegreedaysnormal")
    private String since1sepheatingdegreedaysnormal;

    @JsonProperty("meanwdird")
    private String meanwdird;

    public String getMaxtempi ()
    {
        return maxtempi;
    }

    public void setMaxtempi (String maxtempi)
    {
        this.maxtempi = maxtempi;
    }

    public String getMinpressurei ()
    {
        return minpressurei;
    }

    public void setMinpressurei (String minpressurei)
    {
        this.minpressurei = minpressurei;
    }

    public String getCoolingdegreedays ()
    {
        return coolingdegreedays;
    }

    public void setCoolingdegreedays (String coolingdegreedays)
    {
        this.coolingdegreedays = coolingdegreedays;
    }

    public String getMeanpressurem ()
    {
        return meanpressurem;
    }

    public void setMeanpressurem (String meanpressurem)
    {
        this.meanpressurem = meanpressurem;
    }

    public String getMeandewpti ()
    {
        return meandewpti;
    }

    public void setMeandewpti (String meandewpti)
    {
        this.meandewpti = meandewpti;
    }

    public String getMaxtempm ()
    {
        return maxtempm;
    }

    public void setMaxtempm (String maxtempm)
    {
        this.maxtempm = maxtempm;
    }

    public String getMinpressurem ()
    {
        return minpressurem;
    }

    public void setMinpressurem (String minpressurem)
    {
        this.minpressurem = minpressurem;
    }

    public String getMindewptm ()
    {
        return mindewptm;
    }

    public void setMindewptm (String mindewptm)
    {
        this.mindewptm = mindewptm;
    }

    public String getMeandewptm ()
    {
        return meandewptm;
    }

    public void setMeandewptm (String meandewptm)
    {
        this.meandewptm = meandewptm;
    }

    public String getMindewpti ()
    {
        return mindewpti;
    }

    public void setMindewpti (String mindewpti)
    {
        this.mindewpti = mindewpti;
    }

    public String getSince1jancoolingdegreedaysnormal ()
    {
        return since1jancoolingdegreedaysnormal;
    }

    public void setSince1jancoolingdegreedaysnormal (String since1jancoolingdegreedaysnormal)
    {
        this.since1jancoolingdegreedaysnormal = since1jancoolingdegreedaysnormal;
    }

    public String getGdegreedays ()
    {
        return gdegreedays;
    }

    public void setGdegreedays (String gdegreedays)
    {
        this.gdegreedays = gdegreedays;
    }

    public String getSince1julheatingdegreedays ()
    {
        return since1julheatingdegreedays;
    }

    public void setSince1julheatingdegreedays (String since1julheatingdegreedays)
    {
        this.since1julheatingdegreedays = since1julheatingdegreedays;
    }

    public String getSince1sepcoolingdegreedays ()
    {
        return since1sepcoolingdegreedays;
    }

    public void setSince1sepcoolingdegreedays (String since1sepcoolingdegreedays)
    {
        this.since1sepcoolingdegreedays = since1sepcoolingdegreedays;
    }

    public String getSnow ()
    {
        return snow;
    }

    public void setSnow (String snow)
    {
        this.snow = snow;
    }

    public String getMinvism ()
    {
        return minvism;
    }

    public void setMinvism (String minvism)
    {
        this.minvism = minvism;
    }

    public String getMonthtodatesnowfalli ()
    {
        return monthtodatesnowfalli;
    }

    public void setMonthtodatesnowfalli (String monthtodatesnowfalli)
    {
        this.monthtodatesnowfalli = monthtodatesnowfalli;
    }

    public String getMonthtodateheatingdegreedays ()
    {
        return monthtodateheatingdegreedays;
    }

    public void setMonthtodateheatingdegreedays (String monthtodateheatingdegreedays)
    {
        this.monthtodateheatingdegreedays = monthtodateheatingdegreedays;
    }

    public String getMinvisi ()
    {
        return minvisi;
    }

    public void setMinvisi (String minvisi)
    {
        this.minvisi = minvisi;
    }

    public String getMonthtodatesnowfallm ()
    {
        return monthtodatesnowfallm;
    }

    public void setMonthtodatesnowfallm (String monthtodatesnowfallm)
    {
        this.monthtodatesnowfallm = monthtodatesnowfallm;
    }

    public String getThunder ()
    {
        return thunder;
    }

    public void setThunder (String thunder)
    {
        this.thunder = thunder;
    }

    public String getPrecipi ()
    {
        return precipi;
    }

    public void setPrecipi (String precipi)
    {
        this.precipi = precipi;
    }

    public String getPrecipm ()
    {
        return precipm;
    }

    public void setPrecipm (String precipm)
    {
        this.precipm = precipm;
    }

    public String getMeanvisi ()
    {
        return meanvisi;
    }

    public void setMeanvisi (String meanvisi)
    {
        this.meanvisi = meanvisi;
    }

    public String getMaxvism ()
    {
        return maxvism;
    }

    public void setMaxvism (String maxvism)
    {
        this.maxvism = maxvism;
    }

    public String getHumidity ()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getMaxvisi ()
    {
        return maxvisi;
    }

    public void setMaxvisi (String maxvisi)
    {
        this.maxvisi = maxvisi;
    }

    public String getMeanvism ()
    {
        return meanvism;
    }

    public void setMeanvism (String meanvism)
    {
        this.meanvism = meanvism;
    }

    public String getMeanpressurei ()
    {
        return meanpressurei;
    }

    public void setMeanpressurei (String meanpressurei)
    {
        this.meanpressurei = meanpressurei;
    }

    public String getMaxhumidity ()
    {
        return maxhumidity;
    }

    public void setMaxhumidity (String maxhumidity)
    {
        this.maxhumidity = maxhumidity;
    }

    public String getMonthtodateheatingdegreedaysnormal ()
    {
        return monthtodateheatingdegreedaysnormal;
    }

    public void setMonthtodateheatingdegreedaysnormal (String monthtodateheatingdegreedaysnormal)
    {
        this.monthtodateheatingdegreedaysnormal = monthtodateheatingdegreedaysnormal;
    }

    public String getMeantempi ()
    {
        return meantempi;
    }

    public void setMeantempi (String meantempi)
    {
        this.meantempi = meantempi;
    }

    public String getMinwspdi ()
    {
        return minwspdi;
    }

    public void setMinwspdi (String minwspdi)
    {
        this.minwspdi = minwspdi;
    }

    public String getMeantempm ()
    {
        return meantempm;
    }

    public void setMeantempm (String meantempm)
    {
        this.meantempm = meantempm;
    }

    public String getMaxwspdm ()
    {
        return maxwspdm;
    }

    public void setMaxwspdm (String maxwspdm)
    {
        this.maxwspdm = maxwspdm;
    }

    public String getHeatingdegreedays ()
    {
        return heatingdegreedays;
    }

    public void setHeatingdegreedays (String heatingdegreedays)
    {
        this.heatingdegreedays = heatingdegreedays;
    }

    public String getMaxwspdi ()
    {
        return maxwspdi;
    }

    public void setMaxwspdi (String maxwspdi)
    {
        this.maxwspdi = maxwspdi;
    }

    public String getMaxpressurem ()
    {
        return maxpressurem;
    }

    public void setMaxpressurem (String maxpressurem)
    {
        this.maxpressurem = maxpressurem;
    }

    public Date getDate ()
    {
        return date;
    }

    public void setDate (Date date)
    {
        this.date = date;
    }

    public String getMinwspdm ()
    {
        return minwspdm;
    }

    public void setMinwspdm (String minwspdm)
    {
        this.minwspdm = minwspdm;
    }

    public String getMaxpressurei ()
    {
        return maxpressurei;
    }

    public void setMaxpressurei (String maxpressurei)
    {
        this.maxpressurei = maxpressurei;
    }

    public String getMintempm ()
    {
        return mintempm;
    }

    public void setMintempm (String mintempm)
    {
        this.mintempm = mintempm;
    }

    public String getMaxdewpti ()
    {
        return maxdewpti;
    }

    public void setMaxdewpti (String maxdewpti)
    {
        this.maxdewpti = maxdewpti;
    }

    public String getMintempi ()
    {
        return mintempi;
    }

    public void setMintempi (String mintempi)
    {
        this.mintempi = mintempi;
    }

    public String getMaxdewptm ()
    {
        return maxdewptm;
    }

    public void setMaxdewptm (String maxdewptm)
    {
        this.maxdewptm = maxdewptm;
    }

    public String getMonthtodatecoolingdegreedaysnormal ()
    {
        return monthtodatecoolingdegreedaysnormal;
    }

    public void setMonthtodatecoolingdegreedaysnormal (String monthtodatecoolingdegreedaysnormal)
    {
        this.monthtodatecoolingdegreedaysnormal = monthtodatecoolingdegreedaysnormal;
    }

    public String getRain ()
    {
        return rain;
    }

    public void setRain (String rain)
    {
        this.rain = rain;
    }

    public String getMonthtodatecoolingdegreedays ()
    {
        return monthtodatecoolingdegreedays;
    }

    public void setMonthtodatecoolingdegreedays (String monthtodatecoolingdegreedays)
    {
        this.monthtodatecoolingdegreedays = monthtodatecoolingdegreedays;
    }

    public String getHail ()
    {
        return hail;
    }

    public void setHail (String hail)
    {
        this.hail = hail;
    }

    public String getMeanwindspdi ()
    {
        return meanwindspdi;
    }

    public void setMeanwindspdi (String meanwindspdi)
    {
        this.meanwindspdi = meanwindspdi;
    }

    public String getSnowfalli ()
    {
        return snowfalli;
    }

    public void setSnowfalli (String snowfalli)
    {
        this.snowfalli = snowfalli;
    }

    public String getSince1sepcoolingdegreedaysnormal ()
    {
        return since1sepcoolingdegreedaysnormal;
    }

    public void setSince1sepcoolingdegreedaysnormal (String since1sepcoolingdegreedaysnormal)
    {
        this.since1sepcoolingdegreedaysnormal = since1sepcoolingdegreedaysnormal;
    }

    public String getSnowfallm ()
    {
        return snowfallm;
    }

    public void setSnowfallm (String snowfallm)
    {
        this.snowfallm = snowfallm;
    }

    public String getPrecipsource ()
    {
        return precipsource;
    }

    public void setPrecipsource (String precipsource)
    {
        this.precipsource = precipsource;
    }

    public String getSince1julsnowfalli ()
    {
        return since1julsnowfalli;
    }

    public void setSince1julsnowfalli (String since1julsnowfalli)
    {
        this.since1julsnowfalli = since1julsnowfalli;
    }

    public String getSince1sepheatingdegreedays ()
    {
        return since1sepheatingdegreedays;
    }

    public void setSince1sepheatingdegreedays (String since1sepheatingdegreedays)
    {
        this.since1sepheatingdegreedays = since1sepheatingdegreedays;
    }

    public String getHeatingdegreedaysnormal ()
    {
        return heatingdegreedaysnormal;
    }

    public void setHeatingdegreedaysnormal (String heatingdegreedaysnormal)
    {
        this.heatingdegreedaysnormal = heatingdegreedaysnormal;
    }

    public String getSince1julheatingdegreedaysnormal ()
    {
        return since1julheatingdegreedaysnormal;
    }

    public void setSince1julheatingdegreedaysnormal (String since1julheatingdegreedaysnormal)
    {
        this.since1julheatingdegreedaysnormal = since1julheatingdegreedaysnormal;
    }

    public String getFog ()
    {
        return fog;
    }

    public void setFog (String fog)
    {
        this.fog = fog;
    }

    public String getSince1jancoolingdegreedays ()
    {
        return since1jancoolingdegreedays;
    }

    public void setSince1jancoolingdegreedays (String since1jancoolingdegreedays)
    {
        this.since1jancoolingdegreedays = since1jancoolingdegreedays;
    }

    public String getSince1julsnowfallm ()
    {
        return since1julsnowfallm;
    }

    public void setSince1julsnowfallm (String since1julsnowfallm)
    {
        this.since1julsnowfallm = since1julsnowfallm;
    }

    public String getSnowdepthm ()
    {
        return snowdepthm;
    }

    public void setSnowdepthm (String snowdepthm)
    {
        this.snowdepthm = snowdepthm;
    }

    public String getMinhumidity ()
    {
        return minhumidity;
    }

    public void setMinhumidity (String minhumidity)
    {
        this.minhumidity = minhumidity;
    }

    public String getCoolingdegreedaysnormal ()
    {
        return coolingdegreedaysnormal;
    }

    public void setCoolingdegreedaysnormal (String coolingdegreedaysnormal)
    {
        this.coolingdegreedaysnormal = coolingdegreedaysnormal;
    }

    public String getMeanwdire ()
    {
        return meanwdire;
    }

    public void setMeanwdire (String meanwdire)
    {
        this.meanwdire = meanwdire;
    }

    public String getMeanwindspdm ()
    {
        return meanwindspdm;
    }

    public void setMeanwindspdm (String meanwindspdm)
    {
        this.meanwindspdm = meanwindspdm;
    }

    public String getTornado ()
    {
        return tornado;
    }

    public void setTornado (String tornado)
    {
        this.tornado = tornado;
    }

    public String getSnowdepthi ()
    {
        return snowdepthi;
    }

    public void setSnowdepthi (String snowdepthi)
    {
        this.snowdepthi = snowdepthi;
    }

    public String getSince1sepheatingdegreedaysnormal ()
    {
        return since1sepheatingdegreedaysnormal;
    }

    public void setSince1sepheatingdegreedaysnormal (String since1sepheatingdegreedaysnormal)
    {
        this.since1sepheatingdegreedaysnormal = since1sepheatingdegreedaysnormal;
    }

    public String getMeanwdird ()
    {
        return meanwdird;
    }

    public void setMeanwdird (String meanwdird)
    {
        this.meanwdird = meanwdird;
    }

    @Override
    public String toString()
    {
        return "maxtempi = "+maxtempi+", minpressurei = "+minpressurei+", coolingdegreedays = "+coolingdegreedays+", " +
                "meanpressurem = "+meanpressurem+", meandewpti = "+meandewpti+", maxtempm = "+maxtempm+"," +
                " minpressurem = "+minpressurem+", mindewptm = "+mindewptm+", meandewptm = "+meandewptm+"," +
                " mindewpti = "+mindewpti+", since1jancoolingdegreedaysnormal = "+since1jancoolingdegreedaysnormal+"," +
                " gdegreedays = "+gdegreedays+", since1julheatingdegreedays = "+since1julheatingdegreedays+"," +
                " since1sepcoolingdegreedays = "+since1sepcoolingdegreedays+", snow = "+snow+", minvism = "+minvism+"," +
                " monthtodatesnowfalli = "+monthtodatesnowfalli+", monthtodateheatingdegreedays = "+monthtodateheatingdegreedays+"," +
                " minvisi = "+minvisi+", monthtodatesnowfallm = "+monthtodatesnowfallm+", thunder = "+thunder+"," +
                " precipi = "+precipi+", precipm = "+precipm+", meanvisi = "+meanvisi+", maxvism = "+maxvism+"," +
                " humidity = "+humidity+", maxvisi = "+maxvisi+", meanvism = "+meanvism+", meanpressurei = "+meanpressurei+"," +
                " maxhumidity = "+maxhumidity+", monthtodateheatingdegreedaysnormal = "+monthtodateheatingdegreedaysnormal+"," +
                " meantempi = "+meantempi+", minwspdi = "+minwspdi+", meantempm = "+meantempm+", maxwspdm = "+maxwspdm+"," +
                " heatingdegreedays = "+heatingdegreedays+", maxwspdi = "+maxwspdi+", maxpressurem = "+maxpressurem+"," +
                " date = "+date+", minwspdm = "+minwspdm+", maxpressurei = "+maxpressurei+", mintempm = "+mintempm+"," +
                " maxdewpti = "+maxdewpti+", mintempi = "+mintempi+", maxdewptm = "+maxdewptm+"," +
                " monthtodatecoolingdegreedaysnormal = "+monthtodatecoolingdegreedaysnormal+"," +
                " rain = "+rain+", monthtodatecoolingdegreedays = "+monthtodatecoolingdegreedays+", hail = "+hail+"," +
                " meanwindspdi = "+meanwindspdi+", snowfalli = "+snowfalli+", since1sepcoolingdegreedaysnormal = "+since1sepcoolingdegreedaysnormal+"," +
                " snowfallm = "+snowfallm+", precipsource = "+precipsource+", since1julsnowfalli = "+since1julsnowfalli+"," +
                " since1sepheatingdegreedays = "+since1sepheatingdegreedays+", heatingdegreedaysnormal = "+heatingdegreedaysnormal+"," +
                " since1julheatingdegreedaysnormal = "+since1julheatingdegreedaysnormal+", fog = "+fog+"," +
                " since1jancoolingdegreedays = "+since1jancoolingdegreedays+", since1julsnowfallm = "+since1julsnowfallm+"," +
                " snowdepthm = "+snowdepthm+", minhumidity = "+minhumidity+", coolingdegreedaysnormal = "+coolingdegreedaysnormal+"," +
                " meanwdire = "+meanwdire+", meanwindspdm = "+meanwindspdm+", tornado = "+tornado+", snowdepthi = "+snowdepthi+"," +
                " since1sepheatingdegreedaysnormal = "+since1sepheatingdegreedaysnormal+", meanwdird = "+meanwdird+"";
    }
}
