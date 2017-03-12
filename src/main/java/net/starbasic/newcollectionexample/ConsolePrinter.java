package net.starbasic.newcollectionexample;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Серж
 * 
 */
public class ConsolePrinter {
    /**
     * 
     */
    static ArrayList<Film>filmList = new ArrayList<Film>();
    
    public static void main(String[] args) {
        
        filmList.add(new Film("Индус",2015));
        filmList.add(new Film("Гаишники", 2008));
        filmList.add(new Film("Однажды в Одессе", 2005));
        filmList.add(new Film("Военная разведка", 2006));
        
        for(Film film:filmList)System.out.println(film);
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
           
        
    }
    
}
