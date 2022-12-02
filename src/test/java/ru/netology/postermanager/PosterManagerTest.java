package ru.netology.postermanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void AddMovies() {
        PosterManager manager = new PosterManager(10);
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");


        String[] expected = {"movie1", "movie2", "movie3"};
        String[] actual = manager.findAll();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddMoviesNotSet() {
        PosterManager manager = new PosterManager();
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");


        String[] expected = {"movie1", "movie2", "movie3"};
        String[] actual = manager.findAll();


        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void AddMoviesEqualLimit() {
        PosterManager manager = new PosterManager(10);

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");
        manager.add("movie6");
        manager.add("movie7");
        manager.add("movie8");
        manager.add("movie9");
        manager.add("movie10");

        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7", "movie8", "movie9", "movie10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastUnderLimit() {
        PosterManager manager = new PosterManager(10);
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");

        String[] actual = manager.findLast();
        String[] expected = {"movie5", "movie4", "movie3", "movie2", "movie1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastWhenOverLimit() {
        PosterManager manager = new PosterManager(12);
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");
        manager.add("movie6");
        manager.add("movie7");
        manager.add("movie8");
        manager.add("movie9");
        manager.add("movie10");
        manager.add("movie11");
        manager.add("movie12");

        String[] actual = manager.findLast();
        String[] expected = {"movie12", "movie11", "movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};

        Assertions.assertArrayEquals(expected, actual);
    }



}
