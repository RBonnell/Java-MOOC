
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Aviary {
    private ArrayList<Bird> birds = new ArrayList<Bird>();

public void Add(Bird bird){
    birds.add(bird);
}   

public ArrayList<Bird> getBirdList(){
    return birds;
}
public void Observation(String observedBird){
    int count = 0;
    for (Bird b : birds){
        if (b.GetName().toLowerCase().equals(observedBird.toLowerCase())){
            b.Observe();
            count++;
            break;
        }
    }
    if (count == 0){
        System.out.println("Not a bird!");
    }
}

public void Statistics(){
    for (Bird bird : birds){
        Show(bird);
    }
}
public void Show(Bird bird){
        System.out.println(bird.GetName() + " (" + bird.GetLatinName() + "}: " + 
                          bird.Observed() + " observations");
    }
}


