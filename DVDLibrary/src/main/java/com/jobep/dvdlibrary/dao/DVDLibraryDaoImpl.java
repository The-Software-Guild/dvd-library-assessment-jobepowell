/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.dvdlibrary.dao;

import com.jobep.dvdlibrary.dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author powel
 */
public class DVDLibraryDaoImpl implements DVDLibraryDao{

    private Map<String,DVD> dvdLibrary = new HashMap<String,DVD>();
    public static String FILENAME = "DVD_DB";
    public static String DELIMITER = "::";
    
    @Override
    public void addDVD(DVD movie) {
        dvdLibrary.put(movie.getTitle(), movie);
        
    }

    @Override
    public DVD removeDVD(String movie) {
        DVD removedDVD = dvdLibrary.remove(movie);
        return removedDVD;
    }

    @Override
    public int editDVD(DVD movie, int propertyToChange, String replaceValue) {
        switch(propertyToChange){
            case 1:
                dvdLibrary.remove(movie.getTitle());
                movie.setTitle(replaceValue);
                dvdLibrary.put(replaceValue,movie);
                
                break;
            case 2:
                movie.setReleaseDate(replaceValue);
                break;
            case 3:
                movie.setRating(replaceValue);
                break;
            case 4:
                movie.setDirectorName(replaceValue);
                break;
            case 5:
                movie.setStudio(replaceValue);
                break;
            case 6:
                movie.setUserRating(replaceValue);
                break;
            default:
                return -1;
        }
        return 1;
    }

    @Override
    public List<DVD> getAllDVD() {
        return new ArrayList<DVD>(dvdLibrary.values());
    }

    @Override
    public DVD getDVD(String title) {
        return dvdLibrary.get(title);
    }

    @Override
    public String marshallDVD(DVD aDVD) {
        String toReturn = aDVD.getTitle() + DELIMITER;
        toReturn+= aDVD.getReleaseDate() + DELIMITER;
        toReturn+= aDVD.getRating() + DELIMITER;
        toReturn+= aDVD.getDirectorName() + DELIMITER;
        toReturn+= aDVD.getStudio() + DELIMITER;
        toReturn+= aDVD.getUserRating();
        return toReturn;
    }

    @Override
    public DVD unmarshallDVD(String dvdAsString) {
        DVD tempDVD = new DVD();
        String[] tokens = dvdAsString.split(DELIMITER);
        tempDVD.setTitle(tokens[0]);
        tempDVD.setReleaseDate(tokens[1]);
        tempDVD.setRating(tokens[2]);
        tempDVD.setDirectorName(tokens[3]);
        tempDVD.setStudio(tokens[4]);
        tempDVD.setUserRating(tokens[5]);
        return tempDVD;
    }

    @Override
    public void loadLibrary() throws Exception{
        Scanner scanner;
        try {
            scanner = new Scanner( new BufferedReader(new FileReader(FILENAME)));
        } catch (FileNotFoundException e) {
            throw new Exception("ERROR: Could not load DVD Library",e);
        }
        String currLine;
        DVD currDVD;
            
        while(scanner.hasNextLine()){
            currLine = scanner.nextLine();
            currDVD  = unmarshallDVD(currLine);
            dvdLibrary.put(currDVD.getTitle(),currDVD);
        }
        scanner.close();
    }

    @Override
    public void writeLibrary() throws Exception{
        PrintWriter out;
        try{
            out = new PrintWriter( new FileWriter(FILENAME));
        } catch(FileNotFoundException e){
            throw new Exception("ERROR: Could not save data", e);
        }
        String DVDAsString;
        List<DVD> DVDs = this.getAllDVD();
        for(DVD currDVD : DVDs){
            DVDAsString = marshallDVD(currDVD);
            out.println(DVDAsString);
            out.flush();
        }
        out.close();
    }
    
}
