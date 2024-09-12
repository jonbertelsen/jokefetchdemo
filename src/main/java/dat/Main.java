package dat;

import dat.config.HibernateConfig;
import dat.dtos.AllJokesDTO;
import dat.dtos.ChuckJokeDTO;
import dat.dtos.DadJokeDTO;
import dat.services.CallableFutureExample;
import dat.services.JokeService;
import jakarta.persistence.EntityManagerFactory;
import lombok.Data;

public class Main {
    public static void main(String[] args) {
        // Record the start time
        long startTime = System.currentTimeMillis();

        //CallableFutureExample.runTasks();

        //DadJokeDTO dadJokeDTO = JokeService.getDadjoke();

        DadJokeDTO dadJokeDTO = JokeService.getDTOFromURI(DadJokeDTO.class, "https://icanhazdadjoke.com");
        ChuckJokeDTO chuckJokeDTO = JokeService.getDTOFromURI(ChuckJokeDTO.class, "https://api.chucknorris.io/jokes/random");

        AllJokesDTO allJokesDTO = new AllJokesDTO();
        allJokesDTO.setDadJokeDTO(dadJokeDTO);
        allJokesDTO.setChuckJokeDTO(chuckJokeDTO);
        System.out.println(allJokesDTO.getAllJokes());

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Task runtime: " + duration + " milliseconds");
    }
}
