package berezyk.vadim;

public class Main2 {
    public static void main(String[] args) {
        int secs = 360;
        int hours = secs/3600;
        System.out.println(secs + " sec = " + hours + " h " + " and " + (secs%3600)/60 + " min " + (secs%3600)%60 + " sec");
    }
}
