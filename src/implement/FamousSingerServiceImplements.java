/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.FamousSingerEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import service.FamousSingerService;

/**
 *
 * @author Gabi
 */
public class FamousSingerServiceImplements implements FamousSingerService {

    Scanner read;

    ArrayList<FamousSingerEntity> singersList;

    public FamousSingerServiceImplements() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.singersList = new ArrayList<FamousSingerEntity>();
    }

    @Override
    public FamousSingerEntity createNewSinger() {

        FamousSingerEntity newSinger = new FamousSingerEntity();

        System.out.println("Insert the singer name");
        newSinger.setFamousName(read.next());

        System.out.println("Insert the singer's most selled disk name");
        newSinger.setBestSellingAlbum(read.next());

        return newSinger;
    }

    @Override
    public String addSingerToTheList(FamousSingerEntity newSinger) {

        singersList.add(newSinger);

        return newSinger.toString() + "added to the list";

    }

    @Override
    public String showTheSingers() {

        String allTheSingersListed = "The Singers with their most selled disk are : \n";

        for (FamousSingerEntity unitarySinger : singersList) {

            allTheSingersListed += unitarySinger + "\n";

        }

        return allTheSingersListed;
    }

    @Override
    public Boolean removeSinger(String singerToRemove) {
        
        boolean singerCondition = false;
        
        for (int i = 0; i < singersList.size(); i++) {
            
            FamousSingerEntity unitarySinger = singersList.get(i);
            
             if (unitarySinger.getFamousName().equals(singerToRemove)) {

                singersList.remove(unitarySinger);
                singerCondition = true;
            }
            
        }
        

        return singerCondition;

    }

    @Override
    public String sortByName() {

        String sortedByName = "List of singers sorted by name : \n";

        Collections.sort(singersList, utilities.FamousSingerComparators.sortByName);

        for (FamousSingerEntity unitarySinger : singersList) {

            sortedByName += unitarySinger.getFamousName() + " , " + unitarySinger.getBestSellingAlbum() + "\n";

        }

        return sortedByName;
    }

    @Override
    public String sortByDisk() {

        String sortedByDisk = "List of singers sorted by disk : \n";

        Collections.sort(singersList, utilities.FamousSingerComparators.sortByDisk);

        for (FamousSingerEntity unitarySinger : singersList) {

            sortedByDisk += unitarySinger.getBestSellingAlbum() + " , " + unitarySinger.getFamousName() + "\n";

        }

        return sortedByDisk;
    }

    @Override
    public void menu() {
        int option;

        for (int i = 0; i < 5; i++) {

            addSingerToTheList(createNewSinger());
        }

        do {

            System.out.println(constants.FamousSingerConstants.MENU_MESSAGE);

            option = read.nextInt();

            switch (option) {
                case 1:

                    addSingerToTheList(createNewSinger());

                    break;
                case 2:
                    System.out.println(showTheSingers());

                    break;
                case 3:
                    System.out.println("Insert the singer to remove:");
                    String singerToRemove = read.next();
                    if (!removeSinger(singerToRemove)) {
                        System.out.println("Singer doesnt exist in the list");
                    }
                    break;
                case 4:
                    System.out.println(sortByName());
                    break;
                case 5:
                    System.out.println(sortByDisk());
                    break;

                case 6:

                    String optExit;

                    System.out.println("Do you want to exit ?");

                    optExit = read.next();

                    if (optExit.equalsIgnoreCase("y")) {
                        System.out.println("The program has finished.");
                    } else {

                        option = 0;
                    }
                    break;
                default:
                    throw new AssertionError();
            }

        } while (option != 6);

    }
}
