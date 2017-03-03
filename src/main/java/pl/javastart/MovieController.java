package pl.javastart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Rysiek on 2017-02-24.
 */
@Controller
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieActorRepository movieActorRepository;

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping("/")
    public String movieList(Model model) {
        List<Movie> movies = movieRepository.findAll();
        model.addAttribute("movies", movies);
        return "movies";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("movie", new Movie());
        model.addAttribute("categories", Category.values());
        return "addForm";
    }

    @PostMapping("/add")
    public String addMovie(Movie movie) {
        movieRepository.save(movie);
        return "redirect:/";
    }

    @GetMapping("/movie")
    public String filmDetails(Model model, @RequestParam Long id) {
        Movie movie = movieRepository.findOne(id);
        model.addAttribute("movie", movie);
        model.addAttribute("comment", new Comment());
        double sum = 0;
        for (Comment comment : movie.getComments()) {
            sum = sum+comment.getRating();
        }
        double rating = sum/movie.getComments().size();
        model.addAttribute("rating", rating);
        List<Actor> actorList = new ArrayList<>();
        for (MovieActor movieActor : movie.getMovieActorList()) {
            actorList.add(actorRepository.findOne(movieActor.getActor().getId()));
        }
        model.addAttribute("actorList", actorList);
        return "movieDetails";
    }

}
