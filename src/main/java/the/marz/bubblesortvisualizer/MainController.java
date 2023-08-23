package the.marz.bubblesortvisualizer;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.net.PasswordAuthentication;
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

    Vector<Integer> numeriCasuali = new Vector<>();

    public void initialize() {

        vettoreRettangoli.add(r10);
        vettoreRettangoli.add(r9);
        vettoreRettangoli.add(r8);
        vettoreRettangoli.add(r7);
        vettoreRettangoli.add(r6);
        vettoreRettangoli.add(r5);
        vettoreRettangoli.add(r4);
        vettoreRettangoli.add(r3);
        vettoreRettangoli.add(r2);
        vettoreRettangoli.add(r1);


    }


    @FXML
    private void insertArray(){

    }




    @FXML
    private void startSimulation(){

        int i,j,tmp;

        

        for (i = 0; i<numeriCasuali.size();i++){

            vettoreRettangoli.elementAt(i).setFill(Color.RED);

            for(j=1; j < (numeriCasuali.size()-i); j++){
                vettoreRettangoli.elementAt(j).setFill(Color.GREEN);
                if(numeriCasuali.elementAt(j-1) > numeriCasuali.elementAt(i)){
                    SwapRettangoli(vettoreRettangoli.elementAt(i),vettoreRettangoli.elementAt(j-1));

                    tmp = numeriCasuali.elementAt(j-1);
                    numeriCasuali.set(j-1,tmp);
                    numeriCasuali.set(j,tmp);

                }
            }
        }


    }



    @FXML
    private void SwapRettangoli(Rectangle i,Rectangle j){

        //Animazione
        TranslateTransition index_i = new TranslateTransition();
        TranslateTransition index_j = new TranslateTransition();

        double riX = i.getX();
        double rjX = j.getX();

        index_i.setNode(i);
        index_j.setNode(j);

        index_i.setDuration(Duration.millis(2000));
        index_j.setDuration(Duration.millis(2000));

        index_i.setByX(rjX);
        index_j.setByX(riX);;

        index_i.play();
        index_i.play();


    }


    @FXML
    private void generateArray() {
        initialize();
        numeriCasuali = generateRandomIntegers(10, 1, 30);

        for (int i = 0; i < 10; i++) {
            Integer randHeight = numeriCasuali.elementAt(i);

            vettoreRettangoli.elementAt(i).setHeight(randHeight*10);

            System.out.printf("Rettangolo [%d]: %d\n", i, numeriCasuali.elementAt(i)*10);
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