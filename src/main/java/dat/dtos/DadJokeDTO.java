package dat.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DadJokeDTO implements IJoke {
    private String id;
    private String joke;

    @Override
    public String getJoke(){
        return "Dadjoke: " + joke;
    }
}
