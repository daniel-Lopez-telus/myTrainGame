import tracks.Track;
import trains.Train;

import java.util.Scanner;

public class TrainGame {

    Track track;
    Train train;

    public TrainGame(Track track, Train train) {
        this.track = track;
        this.train = train;
        printInitialMessage();
    }

    public void printInitialMessage() {
        Scanner sc = new Scanner(System.in);
        int option;
        boolean flag = true;
        System.out.println("Please enter a valid user name");
        String userName = sc.nextLine();
        System.out.println("▒▒▒▒░░      ▒▒▒▒▒▒\n" +
                "            ████████████████████▓▓██████████████████████████████████████████▓▓██████████████████\n" +
                "        ████                                                                                  ██\n" +
                "      ██░░░░██                                                                                ██\n" +
                "    ██░░░░░░██        ▒▒▒▒▓▓  ▒▒▒▒▒▒  ▒▒▓▓▒▒  ▒▒▒▒▒▒  ▓▓▒▒▓▓  ▓▓▒▒▓▓  ▓▓▒▒▒▒    ▓▓▒▒▒▒  ████████\n" +
                "  ██░░░░████          ▒▒  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓  ▓▓    ▓▓  ▓▓  ██░░▓▓██\n" +
                "████████              ▓▓▓▓▓▓  ▓▓▓▓▓▓  ▓▓▓▓▓▓  ▓▓▓▓▓▓  ▓▓▒▒▓▓  ▓▓▒▒▓▓  ▓▓▓▓▓▓    ▓▓  ▓▓  ██░░▓▓██\n" +
                "██            ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒██░░▓▓██\n" +
                "██▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░▓▓██\n" +
                "██▒▒▒▒▒▒▒▒                                                                              ██▓▓▓▓██\n" +
                "  ██████▓▓▓▓▒▒████████████████████████████████████████▓▓▒▒████████████████████▒▒████████████████\n" +
                "            ▓▓▓▓▓▓██  ██▓▓▓▓██                                    ██▓▓▓▓██  ▓▓▓▓▓▓██            \n" +
                "              ████░░  ░░████                                        ████      ▓▓██\n");


        System.out.println("Hello " + userName + " you have chosen: \n" +
                this.train + " with a " + train.getEngine() + " that can achieve " + train.getSpeed() + "km/h"
                + " that is ready to go on " + track.toString() + "...");

        do {
            System.out.println("=== PLEASE ENTER AN ACTION ===");
            System.out.println("1. MOVE");
            System.out.println("2. WHISTLE");
            System.out.println("3. STOP");
            option = sc.nextInt();
            if (option == 1) {
                System.out.println(train.move() + " on " + track.toString() + "... ");
                train.move();
            } else if (option == 2) {
                train.whistle();
            } else if (option == 3) {
                train.stop();
                flag = false;
            }
        } while (flag);

        float revs = calculateRevs();
        System.out.println("Your train has traveled the track in " + revs + "hours");
        train.turnOff();
    }

    //este metodo me dice en cuanto tiempo puedo recorrer la pista con el perimetro o distancia de la pista y la velocidad del determinado tren.
    public float calculateRevs() {
        return (float) track.getPerimeter() / train.getSpeed();
    }

}