package oopc15.ue1.businesslogic;

import oopc15.ue1.interfaces.IPoint;

import java.util.LinkedList;

public class Bird {
    private IPoint position;
    private LinkedList<Bird> neighbors;

    public Bird(IPoint position){
        this.position = position;
    }

    private void notifyNeighbors(){
        for(Bird bird : neighbors){
            bird.onNeighborPosChanged();
        }
    }

    private void onNeighborPosChanged(){

    }
}
