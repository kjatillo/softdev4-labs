package ex2part1;

import java.util.ArrayList;
import java.util.List;

public class DVDCollection {

    private List<DVD> dvdList;

    public DVDCollection() {
        dvdList = new ArrayList<>();
        dvdList.add(new DVD("Sherlock Holmes", "Warner Home Video", "2009"));
        dvdList.add(new DVD("The Lord of the Rings - The Two Towers","New Line Home Video","2002"));
        dvdList.add(new DVD("Pirates of the Caribbean - The Curse of the Black Pearl","Walt Disney Home Video","2003"));
        dvdList.add(new DVD("Spider-Man","Sony Pictures","2002"));
        dvdList.add(new DVD("Slumdog Millionaire","20th Century Fox","2008"));
        dvdList.add(new DVD("Lord of the Rings - Return of the King","Warner Home Video","2008"));
        dvdList.add(new DVD("Up","Disney Pixar","2009"));
        dvdList.add(new DVD("Men in Black","Sony Pictures","2000"));
        dvdList.add(new DVD("The Dark Knight","Warner Home Video","2008"));
        dvdList.add(new DVD("The Da Vinci Code","Sony Pictures","2006"));
        dvdList.add(new DVD("National Treasure","Buena Vista Home Entertainment","2005"));
        dvdList.add(new DVD("Avatar","20th Century Fox","2009"));

    }

    @Override
    public String toString() {
        String s = "DVDCollection:" + "dvdList:" +"\n";
        
        for (int i=0;i<dvdList.size();i++) {
            s+= dvdList.get(i);
        }
        return s;
    }

    public List<DVD> getDvdList() {
        return dvdList;
    } 
}
