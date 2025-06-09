module com.iessanalberto.dam1.proyectojenkinscalcularfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.proyectojenkinscalcularfx to javafx.fxml;
    exports com.iessanalberto.dam1.proyectojenkinscalcularfx;
}