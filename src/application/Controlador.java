package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Controlador {
	
	@FXML
	public ImageView smash;

	private Ellipse ceiling;
	public AnchorPane page;
	public Scene scene;

	public Stage sendStage;

	/**
	 * Opens an stage to send the profile
	 */

	public void showSendProfile() {
		try {

            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Header.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send Smash");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            
            sendStage.show();		

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * la clase controladora que añade un efecto a la imagen
	 */
	class SetBlur {

		@FXML
		private ImageView smash;

		/**
		 * la etiqueta FXML permite acceder al componente imageView ya creado en
		 * fxml
		 */
		
		@FXML
		public void initialize() {
			smash.setEffect(new GaussianBlur(50));

		}
	}

	/**
	 * Method to handle the ImageView action in the Main stage
	 */

	@FXML
	private void handleSend() {
		showSendProfile();
	}

	/**
	 * Closes the application when clicked on Exit in the secondary stage
	 */
	@FXML
	private void handleClose() {

		System.exit(0);
	}

}
