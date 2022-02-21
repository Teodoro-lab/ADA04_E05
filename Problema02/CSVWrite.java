package Problema02;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

import Problema01.Link.LinkList;

public class CSVWrite {

    // private LinkList<Movie> moviesFinalList;
    private File file = new File("Problema02/MovieFinal.csv");

    public void printMovies(LinkList<Movie> movies) {
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(
                    "movie_id, movie_title, duration, color, language, country, content_rating, budget, title_year, imdb_score, aspect_ratio, movie_imdb_link\n");

            boolean first = true;
            while (!movies.isEmpty()) {
                if (first) {
                    first = false;
                    continue;
                }
                Movie movie = movies.deleteFirst();
                fw.write(movie.toString());
            }
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

}
