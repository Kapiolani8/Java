import java.util.HashMap;

public class Hashmatique{
    static HashMap<String,String> trackList = new HashMap<>();

    public static void getTracks(){
            for (String key : trackList.keySet()) {
            System.out.println(key + " - The lyrics to this song are: " + trackList.get(key));
            // for(HashMap.Entry<String,String>e:trackList.entrySet()){
            // System.out.println("Track: "+e.getKey()+" Lyrics: "+e.getValue());
        }
    }



    public static void main(String[] args){
        trackList.put("Track1","Do you ever feel like breaking down?");
        trackList.put("Track2","Cause I'm obsessed with you.");
        trackList.put("Track3","Waving through a window.");
        trackList.put("Track4"," At the end of the day you're another day older.");

        getTracks();
    }
}