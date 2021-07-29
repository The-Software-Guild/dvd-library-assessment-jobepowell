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
    public void removeDVD(DVD movie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editDVD(DVD movie, int propertyToChange) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DVD> getAllDVD() {
        return new ArrayList<DVD>(dvdLibrary.values());
    }

    @Override
    public DVD getDVD(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
