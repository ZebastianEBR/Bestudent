module com.best.student.bestudent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.best.student.bestudent to javafx.fxml;
    exports com.best.student.bestudent;
}