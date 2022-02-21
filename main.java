import Problema02.CSVWrite;
import Problema02.CSVRead;
import Problema02.Movie;

import Problema01.Link.LinkList;

class Main {
    public static void main(String[] args) {
        CSVRead read = new CSVRead();
        read.Read_Save(5);
        LinkList<Movie> movieList = read.getMoviesList();

        Movie BandB = new Movie(5044, "Beauty and the beast", "98", "color", "English", "USA", "PG", "1100", 2004,
                "6.6", "1.85", "http://www.imdb.com/title/tt0378407/?ref_=fn_tt_tt_1");
        Movie HG = new Movie(5045, "Hunger Games", "120", "color", "English", "USA", "PG", "1100", 2015, "6.6", "1.85",
                "http://www.imdb.com/title/tt0378407/?ref_=fn_tt_tt_1");
        Movie SM = new Movie(5046, "Spiderman: Far from home", "115", "color", "English", "USA", "PG", "1100", 2019,
                "6.6", "1.85", "http://www.imdb.com/title/tt0378407/?ref_=fn_tt_tt_1");

        Movie avatar = new Movie(1, "Avatar", "178", "Color", "English", "USA", "PG-13", "237000000", 2009, "7.9",
                "1.78", "http://www.imdb.com/title/tt0499549/?ref_=fn_tt_tt_1");

        movieList.insertFirst(BandB);
        movieList.displayList();

        movieList.deleteFirst();
        movieList.displayList();

        movieList.insertLast(HG);
        movieList.displayList();

        movieList.deleteLast();
        movieList.displayList();

        movieList.getFirst();
        movieList.displayList();

        movieList.getLast();
        movieList.displayList();

        System.out.println( movieList.length() );

        movieList.insertAfter(avatar, BandB);
        movieList.displayList();

        movieList.insertBefore(avatar, HG);
        movieList.displayList();

        movieList.insertInOrder(SM, true);
        movieList.displayList();

        movieList.deleteByIndex(3);
        movieList.displayList();

        movieList.findIndex(avatar);
        movieList.displayList();

        //movieList.clear();

        movieList.replace(4, HG);
        movieList.displayList();


        System.out.println("printing...");
        CSVWrite print = new CSVWrite();
        print.printMovies(movieList);
        

    }
}
