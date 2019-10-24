package Orchestra;

public class Orchestra {
    void chooseAConcertHall()
    {
        System.out.println("Choosing concert hall");
    }

    static void inviteConductor()
    {
        System.out.println("Conductor has been invited");
    }
    static class FolkOrchestra
    {
        void playFolkMusic()
        {
            System.out.println("Playing folk music");
        }
        void startAConcert()
        {
            System.out.println("Folk orchestra");
            inviteConductor();;
            new Orchestra().chooseAConcertHall();
            new SymphonicOrchestra().playSymphonicMusic();
        }
    }
    static class SymphonicOrchestra
    {
        void playSymphonicMusic()
        {
            System.out.println("Playing symphonic music");
        }
        void startAConcert()
        {
            System.out.println("Symphonic orchestra");
            inviteConductor();;
            new Orchestra().chooseAConcertHall();
            new FolkOrchestra().playFolkMusic();
        }
    }
    public static void main(String[] args) {
        new Orchestra.SymphonicOrchestra().startAConcert();
        new Orchestra.FolkOrchestra().startAConcert();
    }
}
