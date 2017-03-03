package pl.javastart;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Rysiek on 2017-02-24.
 */
@Entity
public class Movie {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private Date premiereDate;
    @OneToMany (mappedBy = "movie")
    private List<MovieActor> movieActorList;
    @Enumerated(EnumType.STRING)
    private Category category;
    @OneToMany(mappedBy = "movie")
    private List<Comment> comments;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(Date premiereDate) {
        this.premiereDate = premiereDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<MovieActor> getMovieActorList() {
        return movieActorList;
    }

    public void setMovieActorList(List<MovieActor> movieActorList) {
        this.movieActorList = movieActorList;
    }
}
