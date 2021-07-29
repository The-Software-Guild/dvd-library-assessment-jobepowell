/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.dvdlibrary.dto;

/**
 *
 * @author powel
 */
public class DVD {
    private String title;
    private String releaseDate;
    private String rating;
    private String directorName;
    private String studio;
    private String userRating;
    
    //Getter/Accessor methods
    public String getTitle(){
        return this.title;
    }
    public String getReleaseDate(){
        return this.releaseDate;
    }
    public String getRating(){
        return this.rating;
    }
    public String getDirectorName(){
        return this.directorName;
    }
    public String getStudio(){
        return this.studio;
    }
    public String getUserRating(){
        return this.userRating;
    }
    
    //Setter/Mutator methods
    public void setTitle(String title){
        this.title = title;
    }
    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    public void setDirectorName(String directorName){
        this.directorName = directorName;
    }
    public void setStudio(String studio){
        this.studio = studio;
    }
    public void setUserRating(String userRating){
        this.userRating = userRating;
    }
    
}
