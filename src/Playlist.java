import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private List<Tracks> tracksList;
    private String playMethod;


    public List<Tracks> getTracksList() {
        return tracksList;
    }

    public void setTracksList(List<Tracks> tracksList) {
        this.tracksList = tracksList;
    }

    public String getPlayMethod() {
        return playMethod;
    }

    public void setPlayMethod(String playMethod) {
        this.playMethod = playMethod;
    }

    public Playlist(){
        tracksList = new ArrayList<>();
        playMethod = "NORMAL";
    }

    public void addElement(Tracks tracks){
        tracksList.add(tracks);
    }


    public void addPlaylist(Playlist otherPlaylist){
        if(otherPlaylist.getPlayMethod().equals("RANDOM")) {
            tracksList.addAll(otherPlaylist.randomOrder());
        }
        else {
            tracksList.addAll(otherPlaylist.getTracksList());
        }


    }


    public void play(){
        if(playMethod.equals("LOOP")){
            while (true){
                tracksList.forEach( media -> System.out.println(media));
            }
        }
        if(playMethod.equals("RANDOM")){
            randomOrder().forEach( media -> System.out.println(media));
        }
        else {
            tracksList.forEach( media -> System.out.println(media));
        }

    }

    private List<Tracks> randomOrder(){
        List<Tracks> randomList = new ArrayList<>();
        randomList.addAll(tracksList);
        Collections.shuffle(randomList);
        return randomList;
    }




}
