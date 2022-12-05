module ru.gb.oseminar4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens ru.gb.oseminar4 to javafx.fxml;
    exports ru.gb.oseminar4;
    exports ru.gb.oseminar4.Controller;
}