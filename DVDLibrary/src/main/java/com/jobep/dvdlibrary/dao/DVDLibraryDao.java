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
    public int editDVD(DVD movie, int propertyToChange, String replaceValue);
    public List<DVD> getAllDVD();
    public DVD getDVD(String title);
    public String marshallDVD(DVD aDVD);
    public DVD unmarshallDVD(String dvdAsString);
    public void loadLibrary() throws Exception;
    public void writeLibrary() throws Exception;
}
