/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.FamousSingerEntity;

/**
 *
 * @author Gabi
 */
public interface FamousSingerService {
    
    public FamousSingerEntity createNewSinger();
    
    public String addSingerToTheList(FamousSingerEntity newSinger);
    
    public String showTheSingers();
    
    public Boolean removeSinger(String singerToRemove);
    
    public String sortByName();
    
    public String sortByDisk();
    
    public void menu();
}
