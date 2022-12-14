package com.qa.cinema.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieID;

    @NotNull
    @Column(name = "movie")
    private String movieTitle;

    @NotNull
    private String director;

    @NotNull
    private String actors;

    @NotNull
    private Long showingTimes;

    public Listing(Long movieID, String movieTitle, String director, String actors, Long showingTimes) {
        this.movieID = movieID;
        this.movieTitle = movieTitle;
        this.director = director;
        this.actors = actors;
        this.showingTimes = showingTimes;
    }

    public Listing(String movieTitle, String director, String actors, Long showingTimes) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.actors = actors;
        this.showingTimes = showingTimes;
    }

    public Listing() {
    }

    public Long getMovieID() {
        return movieID;
    }

    public void setMovieID(Long movieID) {
        this.movieID = movieID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public Long getShowingTimes() {
        return showingTimes;
    }

    public void setShowingTimes(Long showingTimes) {
        this.showingTimes = showingTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Listing movie = (Listing) o;
        return Objects.equals(movieID, movie.movieID) && Objects.equals(movieTitle, movie.movieTitle) && Objects.equals(director, movie.director) && Objects.equals(actors, movie.actors) && Objects.equals(showingTimes, movie.showingTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieID, movieTitle, director, actors, showingTimes);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", movieTitle='" + movieTitle + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", showingTimes=" + showingTimes +
                '}';
    }
}
