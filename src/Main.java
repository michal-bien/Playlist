
public class Main {

    public static void main(String [] args){
        Tracks song = new Song("Brown Sugar", "MP3", "4:20","Rolling Stones");
        Playlist firstPlaylist = new Playlist();
        Tracks song2 = new Song("Paint it black", "MP3", "3:10","Rolling Stones");
        Tracks song3 = new Song("Miss you", "MP3", "3:40","Rolling Stones");
        Tracks song4 = new Song("Wild horses", "MP3", "5:33","Rolling Stones");
        firstPlaylist.addElement(song2);
        firstPlaylist.addElement(song3);
        firstPlaylist.addElement(song4);
        firstPlaylist.setPlayMethod("RANDOM");
        Tracks movie = new Movie("Casablanca", "AVI","158:01", "Drama", "Michael Curtiz");
        Playlist mainPlayList = new Playlist();
        mainPlayList.addElement(song);
        mainPlayList.addPlaylist(firstPlaylist);
        mainPlayList.addElement(movie);
        mainPlayList.addElement(new Song("The great gig in the sky", "MP3", "4:44","Pink Floyd"));
        mainPlayList.play();



    }
}
