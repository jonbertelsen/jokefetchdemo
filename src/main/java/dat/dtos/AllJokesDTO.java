package dat.dtos;

import lombok.Data;

@Data
public class AllJokesDTO {
    private DadJokeDTO dadJokeDTO;
    private ChuckJokeDTO chuckJokeDTO;

    public String getAllJokes(){
        StringBuilder jokes = new StringBuilder();
        jokes.append(dadJokeDTO.getJoke() + System.lineSeparator());
        jokes.append(chuckJokeDTO.getJoke());
        return jokes.toString();
    }
}
