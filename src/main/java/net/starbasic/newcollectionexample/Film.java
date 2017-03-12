/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.starbasic.newcollectionexample;

/**
 *
 * @author Серж
 */
class Film {
    private String title;
    private int year;
    /**
     * 
     * @param title
     * @param year 
     */
    public Film(String title, int year){
        this.title = title;
        this.year = year;
    }
    /**
     * @create empty films
     */
    public Film(){
        this.title = "Німе кіно";
        this.year = 1900;
    }
    
    /**
     * 
     * @return string view for nested object
     */
    
    @Override
    public String toString(){
        return this.getTitle() + "(" + this.getYear() +")";
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
}
