/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.dvdlibrary.controller;

import com.jobep.dvdlibrary.dao.DVDLibraryDao;
import com.jobep.dvdlibrary.dto.DVD;
import com.jobep.dvdlibrary.ui.DVDLibraryView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author powel
 */

public class DVDLibraryController{
    //Controller allows for dependency injection
    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view){
        this.dao = dao;
        this.view = view;
    }
    
    private DVDLibraryDao dao;
    private DVDLibraryView view;
    
    public void run(){
        boolean keepGoing = true;
        int response;
        while(keepGoing){
            response = getMenuSelect();
            switch(response){
                case 1: //Add DVD to Collection
                    createDVD();
                    break;
                case 2: //Remove DVD from collection
                    deleteDVD();
                    break;
                case 3: //Edit DVD from collection
                    editDVD();
                    break;
                case 4: //List DVDs currently in collection
                    displayDVDList();
                    break;
                case 5: //Display one DVD's info from collection
                    displayDVD();
                    break;
                case 6: //Exit program
                    keepGoing = false;
                    break;
                default:
                    invalidInput();
                    
            }
        }
    }
    
    public int getMenuSelect(){
        return view.displayMenuOptions();
    }
    public void createDVD(){
        DVD currDVD = view.createNewDVD();
        dao.addDVD(currDVD);
        view.displayAddedSuccessfully();
    }
    public void deleteDVD(){
        
    }
    public void editDVD(){
        
    }
    public void displayDVDList(){
        List<DVD> dvdList = dao.getAllDVD();
        view.displayAllDVDs(dvdList);
    }
    public void displayDVD(){
        
    }
    public void invalidInput(){
        
    }
}
