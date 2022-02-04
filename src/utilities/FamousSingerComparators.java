/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;


import entity.FamousSingerEntity;
import java.util.Comparator;

public class FamousSingerComparators {

   public static Comparator<FamousSingerEntity> sortByName = new Comparator<FamousSingerEntity>(){
       
     @Override
     public int compare(FamousSingerEntity singer1 , FamousSingerEntity singer2){
         
         return singer1.getFamousName().compareTo(singer2.getFamousName());
     }
       
   };

   
   public static Comparator<FamousSingerEntity> sortByDisk = new Comparator<FamousSingerEntity>(){
       
       @Override
       public int compare(FamousSingerEntity singer1, FamousSingerEntity singer2){
           
        return singer1.getBestSellingAlbum().compareTo(singer2.getBestSellingAlbum());
       }
       
       
   };
   
   
}
