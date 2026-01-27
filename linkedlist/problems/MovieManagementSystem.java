package linkedlist.problems;

import linkedlist.nodes.DoublyLinkedList;

class Movie {
    String title, director;
    Integer releaseYear;
    Double rating;

    Movie(String title, String director, Integer releaseYear, Double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return this.title + " " + this.director + " "  +this.releaseYear + " " + this.rating;
    }
}


public class MovieManagementSystem<T> {
   
    public static void main(String[] args) {
        DoublyLinkedList<Movie> movieList = new DoublyLinkedList<>();
        Movie RaOne = new Movie("Ra.One", "Anubhav Sinha", 2014, 10.00);
        Movie krrish3 = new Movie("krrish 3", "unknown", 2018, 9.1);
        Movie Robot = new Movie("Robot", "ioansfnas", 2010, 10.0);

        movieList.insertAtHead(RaOne);
        movieList.insertAtTail(krrish3);
        movieList.insertAtTail(Robot);

        movieList.displayAllNodes();
    }
}
