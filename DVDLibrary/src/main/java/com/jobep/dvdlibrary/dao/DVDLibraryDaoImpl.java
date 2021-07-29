/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.dvdlibrary.dao;

import com.jobep.dvdlibrary.dto.DVD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author powel
 */
public class DVDLibraryDaoImpl implements DVDLibraryDao{

    private Map<String,DVD> dvdLibrary = new HashMap<String,DVD>();
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
    public String marshallDVD(String DVDAsString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DVD unmarshallDVD(String currDVD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadLibrary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeLibrary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
