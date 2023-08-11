module KMEmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.mahanta;
    opens com.mahanta.view;
    opens com.mahanta.controller;
    opens com.mahanta.model;

}
