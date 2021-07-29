/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.dvdlibrary.ui;

import com.jobep.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author powel
 */
public class DVDLibraryView {
    public DVDLibraryView(UserIO io){
        this.io = io;
    }
    
    private UserIO io;

    public int displayMenuOptions() {
        io.print("Enter one of the following options:\n"
                +"\t 1: Add DVD\n"
                +"\t 2: Remove DVD\n"
                +"\t 3: Edit DVD\n"
                +"\t 4: List all DVDs\n"
                +"\t 5: Display DVD info\n"
                +"\t 6: Exit\n");
        return io.readInt("Which option would you like? ");
    }
    
    public DVD createNewDVD(){
        io.print("**** Adding New DVD ****");
        String dvdTitle       = io.readString("Please enter DVD title");
        String dvdReleaseDate = io.readString("Please enter release date");
        String dvdMPAA        = io.readString("Please enter official MPAA rating");
        String dvdDirector    = io.readString("Please enter the Director's name");
        String dvdStudio      = io.readString("Please enter a studio name");
        String dvdReview      = io.readString("Please enter your rating or a review of the movie");
        
        DVD currDVD = new DVD();
        currDVD.setTitle(dvdTitle);
        currDVD.setReleaseDate(dvdReleaseDate);
        currDVD.setRating(dvdMPAA);
        currDVD.setDirectorName(dvdDirector);
        currDVD.setStudio(dvdStudio);
        currDVD.setUserRating(dvdReview);
        
        return currDVD;
    }
    public String getMovieTitle(){
        return io.readString("Please enter a movie title");
    }
    
    public void displayRemoveResult(DVD removed){
        if(removed != null)
            io.print("**** DVD successfully removed ****");
        else
            io.print("ERROR: DVD not found");
        pressEnterToContinue();
    }
    public void displayAllDVDs(List<DVD> DVDs){
        io.print("**** All Current DVDs ****");
        for(DVD currDVD : DVDs){
            io.print(currDVD.getTitle());
        }
        pressEnterToContinue();
    }
    public void displayAddedSuccessfully(){
        io.print("**** DVD added successfully! ****");
        pressEnterToContinue();
    }
    public void pressEnterToContinue(){
        io.readString("Press Any Key to Continue.");
    }
    public void displayRemoveBanner(){
        io.print("**** Removing DVD ****");
    }
    
}
