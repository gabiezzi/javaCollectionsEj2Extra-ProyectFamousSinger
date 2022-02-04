/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
public class FamousSingerEntity {
    
    private String famousName;
    private String bestSellingAlbum;

    public FamousSingerEntity(String famousName, String bestSellingAlbum) {
        this.famousName = famousName;
        this.bestSellingAlbum = bestSellingAlbum;
    }

    public FamousSingerEntity() {
    }

    public String getFamousName() {
        return famousName;
    }

    public void setFamousName(String famousName) {
        this.famousName = famousName;
    }

    public String getBestSellingAlbum() {
        return bestSellingAlbum;
    }

    public void setBestSellingAlbum(String bestSellingAlbum) {
        this.bestSellingAlbum = bestSellingAlbum;
    }

    @Override
    public String toString() {
        return "FamousSingerEntity{" + "famousName=" + famousName + ", bestSellingAlbum=" + bestSellingAlbum + '}';
    }
    
    
}
    