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
public interface DVDLibraryDao {
    public void addDVD(DVD movie);
    public void removeDVD(DVD movie);
    public void editDVD();
    public void getAllDVD();
    public void getDVD();
    public void marshallDVD();
    public void unmarshallDVD();
    public void loadLibrary();
    public void writeLibrary();
}
