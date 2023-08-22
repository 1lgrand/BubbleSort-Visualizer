package the.marz.bubblesortvisualizer;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import java.util.Random;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;

public class MainController{
    @FXML
    private ImageView play,stop,step_next,step_back;

    @FXML
    private Rectangle r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;

    Vector<Rectangle> vettoreRettangoli = new Vector<>();

    public void initialize() {

        vettoreRettangoli.add(r1);
        vettoreRettangoli.add(r2);
        vettoreRettangoli.add(r3);
        vettoreRettangoli.add(r4);
        vettoreRettangoli.add(r5);
        vettoreRettangoli.add(r6);
        vettoreRettangoli.add(r7);
        vettoreRettangoli.add(r8);
        vettoreRettangoli.add(r9);
        vettoreRettangoli.add(r10);

    }


    @FXML
    private void swap(){
        if (play.isVisible()){
            stop.setVisible(true);
            play.setVisible(false);
        }else{
            stop.setVisible(false);
            play.setVisible(true);
        }
    }

    @FXML
    private void insertArray(){

    }

    @FXML
    private void generateArray(){
        initialize();
        Vector<Integer> numeriCasuali = generateRandomIntegers(10,1,30);
        int i;

        System.out.println(numeriCasuali);


        for (i=0;i<10;i++){

            Integer randHeight= numeriCasuali.elementAt(i) * 10;
            System.out.println(randHeight);

            vettoreRettangoli.elementAt(i).setHeight(randHeight);
            System.out.println(vettoreRettangoli.elementAt(i).getHeight());

        }

    }


    public static Vector<Integer> generateRandomIntegers(int count, int min, int max) {
        Vector<Integer> listaNumeriCasuali = new Vector<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            Integer randomNumber = random.nextInt(max - min + 1) + min;
            listaNumeriCasuali.add(randomNumber);
        }

        return listaNumeriCasuali;
    }




}