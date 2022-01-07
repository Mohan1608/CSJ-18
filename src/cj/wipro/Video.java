package cj.wipro;

public class Video {
    private String videoName;
    boolean checkout;
    private int rating;

    public  Video(){

    }
    public Video(String name){
        videoName = name;
    }
    public String getName(){

        return videoName;
    }
    public void doCheckout(){

    }
    public void doReturn(){

    }
    void recievingRating(int rating){

    }
    public int getRating(){
        return rating;
    }
    public boolean getCheckout(){
        return checkout;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoName='" + videoName + '\'' +
                ", checkout=" + checkout +
                ", rating=" + rating +
                '}';
    }
}
