package Java.Interface.ApplicationForm;

public class Register implements Buttons{
	
	@Override
	public void saveButton() {
		System.out.println("Register form saves");
		
	}

	@Override
	public void closeButton() {
		System.out.println("Register form Closes");		
	}
}
