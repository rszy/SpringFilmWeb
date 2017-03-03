package pl.javastart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by Rysiek on 2017-03-03.
 */
@Entity
public class Actor {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String surname;
    private Date bornDate;

    @OneToMany(mappedBy = "actor")
    private List<MovieActor> movieActorList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surName) {
        this.surname = surName;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public List<MovieActor> getMovieActorList() {
        return movieActorList;
    }

    public void setMovieActorList(List<MovieActor> movieActorList) {
        this.movieActorList = movieActorList;
    }
}
