package Java.Interface.MakeACar;

public class Media implements MediaPlayer{
	@Override
	public void start() {
		System.out.println("Media Player Starts");
	}
	@Override
	public void stop() {
		System.out.println("Media Player Stops");
	}
}
