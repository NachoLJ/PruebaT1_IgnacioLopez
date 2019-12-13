package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Clase controladora de la ventana principal
 * @author Nacho
 * @version 1.0
 */

public class ControlRocket {

	@FXML
	private AnchorPane root, ventanaSecundaria;
	@FXML
	private ImageView fotoLogin;

	public void initialize() {

		transiccionFoto();

	}

	/**
	 * Metodo para abrir una ventana nueva
	 */
	@FXML
	public void openStage() {
		Stage thisStage = (Stage) root.getScene().getWindow();
		thisStage.close();

		try {
			// Load the fxml file and create a new stage for the popup.
			FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Urano.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 800, 600);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo que se encarga de la transiccion de la foto del login
	 */

	private void transiccionFoto() {
		FadeTransition ft = new FadeTransition(Duration.seconds(5), fotoLogin);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
	}
	
	/**
	 * Metodo que cierra el stage de la primera ventada de la aplicacion
	 */
	@FXML
	public void closeApp() {
		Stage thisStage = (Stage) root.getScene().getWindow();
		thisStage.close();
	}

}
