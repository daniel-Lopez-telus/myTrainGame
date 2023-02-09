import java.util.Scanner;

import tracks.Downtown;
import tracks.Forrest;
import tracks.Track;
import trains.ExpressTrain;
import trains.LoadTrain;
import trains.RegularTrain;
import trains.Train;

public class Main {

    public static void main(String[] args) {
        

            TrainGame myGame;
            Track myTrack;
            int trackSelected;
            String userName;
            Train myTrain;
            int trainSelected;
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Welcome to this train emulator in which you can " +
                    "pick a track, a kind of a train\nand select some actions " +
                    "and have as a result the time that takes your train to travel your track.\n");
    
            System.out.println("select your favorite track: \n1. downtown\n2. forrest");
            trackSelected = sc.nextInt();
    
            if(trackSelected == 1){
                myTrack = new Downtown();
            } else if(trackSelected == 2){
                myTrack = new Forrest();
            }

            myTrack = (trackSelected == 1) ? new Downtown() : new Forrest();
    
            System.out.println("select a train: \n1. Express Train\n2. Regular Train\n3. Load Train");
            trainSelected = sc.nextInt();

            myTrain = getMyTrain(trainSelected);

            myGame = new TrainGame(myTrack, myTrain);
    

    }

    public static Train getMyTrain(int option){
        if(option == 1){
            return new ExpressTrain();
        } else if(option == 2) {
            return new RegularTrain();
        } else if(option == 3) {
            return  new LoadTrain();
        }
        return new ExpressTrain();
    }
}