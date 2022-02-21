package Problema02;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CSVWrite {

    private ArrayList<String[]> moviesFinalList;
    private File file = new File("MovieFinal.csv");

    public void Movies(ArrayList<String[]> movies) {
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(
                    "movie_id, movie_title, duration, color, language, country, content_rating, budget, title_year, imdb_score, aspect_ratio, movie_imdb_link\n");

        } catch (

        Exception e) {
        }
    }

}