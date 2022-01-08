package cj.OOPS.Encapsulation.encapsul;

import java.util.Scanner;

public class BikeGear {
    private int gear;
    public void setGear(int gear1) throws IllegalArgumentException{
        if(gear1 < 0|| gear1>5){
            throw new IllegalArgumentException("invalid gear,the gear must between 0-5");
        }
        else {
           gear=gear1;
        }
    }
    public int getGear(){
        return gear;
    }
}

class BikeRide{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BikeGear br=new BikeGear();
        System.out.println("Select Gear");
        int selectGear=sc.nextInt();
        while (true){
            try {
        br.setGear(selectGear);
            System.out.println(br.getGear());
            break;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}


