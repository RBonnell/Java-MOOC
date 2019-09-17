/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> team = new ArrayList<Player>();
    
    public Team(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void addPlayer(Player player){
        if (maxSize > 0){  
            if (team.size() < maxSize){
                team.add(player);
            }
        }
        else{
            team.add(player);
        }
    }
    
    public void printPlayers(){
        for (Player player : team){
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int newSize){
        this.maxSize = newSize;
    }
    
    public int size(){
        return team.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        for (Player player : team){
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}
    
