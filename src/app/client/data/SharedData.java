package app.client.data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SharedData {
	
	private final StringProperty stringLineProp = new SimpleStringProperty("");

    public StringProperty getStringLineProp() {
        return stringLineProp;
    }

}
