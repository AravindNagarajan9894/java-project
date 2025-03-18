package Java.Interface.ApplicationForm;

public class Update implements Buttons {
	
	
	@Override
	public void saveButton() {
		System.out.println("Update form saves");
		
	}

	@Override
	public void closeButton() {
		System.out.println("Update form closes");
		
	}

}
