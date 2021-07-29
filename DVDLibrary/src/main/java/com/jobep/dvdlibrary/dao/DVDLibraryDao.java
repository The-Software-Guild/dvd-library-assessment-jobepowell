/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.dvdlibrary.dao;

/**
 *
 * @author powel
 */
import com.jobep.dvdlibrary.dto.DVD;
import java.util.List;
public interface DVDLibraryDao {
    public void addDVD(DVD movie);
    public DVD removeDVD(String movie);
    public void editDVD(DVD movie, int propertyToChange);
    public List<DVD> getAllDVD();
    public DVD getDVD(String title);
    public String marshallDVD(String DVDAsString);
    public DVD unmarshallDVD(String currDVD);
    public void loadLibrary();
    public void writeLibrary();
}
