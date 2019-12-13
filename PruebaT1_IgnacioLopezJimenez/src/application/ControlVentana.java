package application;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * Clase controladora de la ventana secundaria
 * @author Nacho
 * @version 1.0
 *
 */
public class ControlVentana {
	@FXML
	private AnchorPane ventanaSecundaria, panelMenu;
	
	

	private boolean extraer;

	public void initialize() {
		eliminarPanelMenu();
		extraer = true;
	}

	/**
	 * Metodo que quita el panel de la vista moviendolo al la izquiera
	 */
	public void eliminarPanelMenu() {
		TranslateTransition eliminar = new TranslateTransition(Duration.seconds(0.2), panelMenu);
		eliminar.setByX(-600);
		eliminar.play();
	}

	/**
	 * Metodo void que comprueba el estado del panel a traves de un booleano. extrae
	 * o muestra el panel en funcion del resultado
	 */
	public void visualizarPanelMenu() {
		if (!extraer) {
			eliminarPanelMenu();
			extraer = true;

		} else {
			TranslateTransition visualizar = new TranslateTransition(Duration.seconds(1), panelMenu);
			visualizar.setByX(600);
			visualizar.play();
			extraer = false;
		}
	}

	/**
	 * Metodo para cerrar la aplicacion
	 */
	public void salir() {
		System.exit(0);
	}
	
}
