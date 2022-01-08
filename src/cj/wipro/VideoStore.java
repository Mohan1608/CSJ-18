package cj.wipro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VideoStore {
        List inventory= new ArrayList<>();
        Video[] store = new Video [10];
        int i =0;
    public void addVideo(String vname){


        inventory.add(vname);
        store[i] = new Video(vname);
        System.out.println("Video added successfully");
        i++;
        }
    public void doCheckout(String name){
        inventory.remove(name);
    }
    public void doReturn(String name){

    }public void receiveRating(String name,int rating){

    }
    void listInventory(){
        System.out.println(inventory);

    }
}
