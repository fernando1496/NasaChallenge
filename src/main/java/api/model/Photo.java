package api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;



@Getter
@Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Accessors(fluent = true)
public class Photo {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("sol")
    public Integer sol;
    @JsonProperty("camera")
    public Camera camera;
    @JsonProperty("img_src")
    public String imgSrc;
    @JsonProperty("earth_date")
    public String earthDate;
    @JsonProperty("rover")
    public Rover rover;
}