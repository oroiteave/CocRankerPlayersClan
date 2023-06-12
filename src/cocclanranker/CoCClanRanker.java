/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocclanranker;

import java.awt.Frame;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JFrame;

/**
 *
 * @author oroir
 */
public class CoCClanRanker {
    
    public static Player newPlayer(int newpos,String name,int th,int[] newStars,int [] newEnemyPos){
        Player newPlayer = new Player(newpos,name,th,newStars,newEnemyPos);
        return newPlayer;
    }
    
    public static void main(String[] args) {
        
        // pos / name / stars[] / th / enemyPos[] /
        //Player[] players = new Player[3];
        //ArrayList<Player> playersList = new ArrayList<>();
        /*
        ArrayList<Player> players = new ArrayList<>();
        Player byron = newPlayer(1,"byron",12,new int[]{3,3},new int[]{1,2});
        Player oroi = newPlayer(2,"oroi",12,new int[]{3,1},new int[]{3,4});
        Player garua = newPlayer(3,"garuakun",9,new int[]{3,3},new int[]{5,6});
        players.add(oroi);
        players.add(byron);
        players.add(garua);
        */
        //Collections.sort(players, Player.indexComparator);
        //System.out.println(players.get(0).getIndex());
        //players[2] = newPlayer(1,"byron",12,new int[]{3,3},new int[]{1,2});
        //players[0] = newPlayer(2,"oroi",12,new int[]{3,1},new int[]{3,4});
        //players[1] = newPlayer(3,"garuakun",9,new int[]{3,3},new int[]{5,6});
        
        
        
        //Player players[1] = new Player(1,"byron2",12,new int[]{3,3},new int[]{1,2});
        //System.out.println(player.getIndex());
        //player.setIndex(2);
        //System.out.println(player.getIndex());
        JFrame.setDefaultLookAndFeelDecorated(true);
        Frame interfaz = new interfazDeRanking() {};
        interfaz.setVisible(true);
        
    }
    
}
