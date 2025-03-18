package Java.Interface.ApplicationForm;

public class Form {
	
	Buttons button; 
	Form(){
		button = new Register();
	}
	void save() {
		button.saveButton();
	}
	void close() {
		button.closeButton();
	}
	void updateForm() {
		button = new Update();
	}
}

