module the.marz.bubblesortvisualizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens the.marz.bubblesortvisualizer to javafx.fxml;
    exports the.marz.bubblesortvisualizer;
}