package module04.generics;

// A Java program to demonstrate use of Comparable

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName() { return name; }
    public int getYear()	 { return year; }
}

// Driver class
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        ArrayList<Movie> list1 = new ArrayList<Movie>();
        list1.add(new Movie("Force Awakens", 8.3, 2015));
        list1.add(new Movie("Star Wars", 8.7, 1977));
        list1.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list1.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sort by rating : (1) Create an object of ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list1, ratingCompare);
        for (Movie movie: list1)
            System.out.println(movie.getRating() + " " +
                    movie.getName() + " " +
                    movie.getYear());


        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list1, nameCompare);
        for (Movie movie: list1)
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list1);
        for (Movie movie: list1)
            System.out.println(movie.getYear() + " " +
                    movie.getRating() + " " +
                    movie.getName()+" ");
    }

}

/*
Now, suppose we want to sort movies by their rating and names as well.
When we make a collection element comparable(by having it implement
 Comparable), we get only one chance to implement the compareTo() method.
 Unlike Comparable, Comparator is external to the element type
 we are comparing.
 It’s a separate class.
 We create multiple separate classes (that implement Comparator)
 to compare by different members.
Collections class has a second sort() method and it takes Comparator.
The sort() method invokes the compare() to sort objects.
 */

// Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

// Class to compare Movies by name
class NameCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}

/*
To summarize, if sorting of objects needs to be based on natural order
 then use Comparable whereas if your sorting needs
 to be done on attributes of different objects,
  then use Comparator in Java.
 */