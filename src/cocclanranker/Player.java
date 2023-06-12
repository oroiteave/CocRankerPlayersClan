/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocclanranker;

import java.util.Comparator;

/**
 *
 * @author oroir
 */
public final class Player{
    private int pos;
    private String name;
    private int[] stars;
    private int th;
    private int[] enemyPos;
    private float index;
    public Player(){
    
    }
    
    public Player(int newpos,String name,int th,int[] newStars,int [] newEnemyPos){
        this.pos = newpos ;
        this.name =name;
        this.th=th;
        this.stars = newStars;
        this.enemyPos = newEnemyPos;
        this.index = indexCalculator();
    }

    public float indexCalculator(){
        float index1,index2,thIndex;
        float finalIndex;
        thIndex = th/10;
        float posicion = (float)pos+thIndex;
        index1 = (stars[1]*(posicion/enemyPos[0]));
        if(enemyPos[1]==0){
            return index1/2;
        }else{
            index2 = (stars[1]*(posicion/enemyPos[1]));
            return (index1+index2)/2;
        }
    }
    
    public float getIndex(){
        return this.index;
    }
    public void setIndex(float newIndex){
        this.index = newIndex;
    }
    public int getPos(){
        return this.pos;
    }
    public void setPos(int newpos){
            this.pos = newpos;
    }
    public String getName(){
            return this.name;
    }
    public void setName(String newname){
            this.name = newname;
    }
    public int getTh(){
        return this.th;
    }
    public void setTh(int newTh){
        this.th = newTh;
    }
    public int[] getStars(){
        return this.stars;
    }
    public void setStars(int [] newStars){
        this.stars = newStars;
    }
    public int[] getEnemyPos(){
        return this.enemyPos;
    }
    public void setEnemyPos(int[] newEnemyPos){
        this.enemyPos = newEnemyPos;
    }
    public static Comparator<Player> indexComparator = (Player p1, Player p2) -> Float.compare(p1.getIndex() , p2.getIndex());
}
