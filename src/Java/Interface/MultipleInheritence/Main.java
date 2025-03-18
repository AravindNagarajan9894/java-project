package Java.Interface.MultipleInheritence;

public class Main {

	public static void main(String[] args) {
		Moblie mobile = new Moblie();
		mobile.getCoordinates();
		mobile.startRadio();
		mobile.stopRadio();
	}
}
interface gps{
	abstract void getCoordinates();
}
interface Radio{
	abstract void startRadio();
	abstract void stopRadio();
}
class Moblie implements gps, Radio{
	@Override
	public void startRadio() {
		System.out.println("Mobile radio starts");
	}
	@Override
	public void stopRadio() {
		System.out.println("Mobile radio stops");
	}

	@Override
	public void getCoordinates() {
		System.out.println("Mobile gps working");
	}	
}